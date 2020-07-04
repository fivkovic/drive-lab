package com.drivelab.core.service;

import com.drivelab.core.dto.DiagnosticsRequest;
import com.drivelab.core.dto.DiagnosticsResult;
import com.drivelab.core.exception.NotFoundException;
import com.drivelab.core.model.Fault;
import com.drivelab.core.model.Vehicle;
import com.drivelab.core.repository.FaultRepository;
import com.drivelab.core.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DiagnosticsService {

    private final FaultRepository faultRepository;
    private final VehicleRepository vehicleRepository;

    // TODO: Move this to separate service
    public void initializeKieSession() {
        final KieSession kieSession = this.getKieSession();
        this.faultRepository.findAll().forEach(fault -> kieSession.insert(new Fault(fault)));
    }

    // TODO: Move this to separate service
    public void disposeKieSession(KieSession kieSession) {
        kieSession.getFactHandles(factHandle -> !(factHandle instanceof Fault))
                .forEach(kieSession::delete);
    }

    // TODO: Move this to static class
    private KieSession getKieSession() {
        return (KieSession) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public DiagnosticsResult performDiagnostics(DiagnosticsRequest diagnosticsRequest) {

        // STEP 1: Find vehicle to perform diagnostics on
        final Vehicle vehicle = this.vehicleRepository.findByLicensePlate(diagnosticsRequest.getVehicle().getLicensePlate())
                .orElseThrow(NotFoundException::new);

        // STEP 2: Get kieSession for user
        final KieSession kieSession = this.getKieSession();

        // STEP 3: Insert initial facts
        kieSession.insert(diagnosticsRequest);
        vehicle.getRepairs().forEach(kieSession::insert);

        // STEP 4: Execute rules
        kieSession.fireAllRules();

        // STEP 5: Get diagnostics result
        final Collection<?> kieSessionObjects = kieSession.getObjects(object -> object instanceof DiagnosticsResult);
        if (kieSessionObjects == null || kieSessionObjects.isEmpty()) throw new NotFoundException("Diagnostic session returned 0 results.");

        // STEP 6: Cast from object to DiagnosticsResult instance
        final DiagnosticsResult diagnosticsResult = kieSessionObjects.stream()
                .filter(object -> DiagnosticsResult.class.isAssignableFrom(object.getClass()))
                .map(DiagnosticsResult.class::cast)
                .collect(Collectors.toList())
                .get(0);

        // STEP 7: Dispose kie Session
        this.disposeKieSession(kieSession);

        return diagnosticsResult;
    }
}
