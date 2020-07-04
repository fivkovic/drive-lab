package com.drivelab.core.service;

import com.drivelab.core.dto.*;
import com.drivelab.core.exception.NotFoundException;
import com.drivelab.core.model.*;
import com.drivelab.core.repository.CustomerRepository;
import com.drivelab.core.repository.RepairRepository;
import com.drivelab.core.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReportsService {

    private final RepairRepository repairRepository;
    private final CustomerRepository customerRepository;
    private final VehicleRepository vehicleRepository;

    // TODO: Move this to static class
    private KieSession getKieSession() {
        return (KieSession) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public FinancialReportResponse getFinancialReport(LocalDate from, LocalDate to) {

        // STEP 1: Get kieSession for user
        final KieSession kieSession = this.getKieSession();
        this.repairRepository.findAll().forEach(repair -> kieSession.insert(new Repair(repair)));

        // STEP 2: Execute query
        final QueryResults results = kieSession.getQueryResults("Get Financial Report Query", from, to);

        if (!results.iterator().hasNext()) {
            kieSession.getFactHandles(factHandle -> (factHandle instanceof Repair))
                    .forEach(kieSession::delete);
            return new FinancialReportResponse();
        }

        // STEP 3: Get query results
        final QueryResultsRow row = results.iterator().next();
        FinancialReportResponse financialReportResponse = (FinancialReportResponse) row.get("$financialReport");

        // STEP 4: Dispose kie Session
        kieSession.getFactHandles(factHandle -> (factHandle instanceof Repair))
                .forEach(kieSession::delete);

        return financialReportResponse;
    }

    public List<CustomerResponse> getCustomerReport() {

        // STEP 1: Get kieSession for user
        final KieSession kieSession = this.getKieSession();
        // TODO: this.repairRepository.findAll().forEach(repair -> kieSession.insert(new Repair(repair)));

        // STEP 2: Execute query
        final QueryResults results = kieSession.getQueryResults("Get Customer Report Query");

        return null;
    }

    public List<VehicleResponse> getVehicleReport() {

        // STEP 1: Get kieSession for user
        final KieSession kieSession = this.getKieSession();
        this.vehicleRepository.findAll().forEach(vehicle -> kieSession.insert(new Vehicle(vehicle)));

        // STEP 2: Execute query
        final QueryResults queryResults = kieSession.getQueryResults("Get Vehicle Report Query");

        // STEP 3: Get query results
        final List<Vehicle> vehicles = new ArrayList<>();
        queryResults.forEach(queryResultsRow -> vehicles.add((Vehicle) queryResultsRow.get("$vehicle")));

        final List<VehicleResponse> results = vehicles.stream().map(VehicleResponse::new).collect(Collectors.toList());

        // STEP 4: Dispose kie Session
        kieSession.getFactHandles(factHandle -> (factHandle instanceof Vehicle))
                .forEach(kieSession::delete);

        return results;
    }
}
