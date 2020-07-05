package com.drivelab.core.controller;

import com.drivelab.core.service.ReportsService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

import static com.drivelab.core.common.Constants.API.*;

@RestController
@RequestMapping(REPORTS_ENDPOINT)
@PreAuthorize("hasAuthority('REPAIR_SHOP')")
@RequiredArgsConstructor
public class ReportsController {

    private final ReportsService reportsService;

    @GetMapping(FINANCIAL)
    public ResponseEntity<?> handleGetFinancialReport(
            @RequestParam("from") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate from,
            @RequestParam("to") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate to) {
        return ResponseEntity.ok(this.reportsService.getFinancialReport(from, to));
    }

    @GetMapping(CUSTOMER)
    public ResponseEntity<?> handleGetCustomerReport() {
        return ResponseEntity.ok(this.reportsService.getCustomerReport());
    }

    @GetMapping(VEHICLE)
    public ResponseEntity<?> handleGetVehicleReport() {
        return ResponseEntity.ok(this.reportsService.getVehicleReport());
    }
}
