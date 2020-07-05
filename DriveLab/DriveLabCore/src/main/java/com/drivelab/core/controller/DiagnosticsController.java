package com.drivelab.core.controller;

import com.drivelab.core.dto.DiagnosticsRequest;
import com.drivelab.core.dto.DiagnosticsResult;
import com.drivelab.core.service.DiagnosticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

import static com.drivelab.core.common.Constants.API.DIAGNOSTICS_ENDPOINT;

@RestController
@RequestMapping(DIAGNOSTICS_ENDPOINT)
@PreAuthorize("hasAuthority('REPAIR_SHOP')")
@RequiredArgsConstructor
public class DiagnosticsController {

    private final DiagnosticsService diagnosticsService;

    @PostMapping
    public ResponseEntity<DiagnosticsResult> handlePostDiagnosisRequest(@RequestBody @Valid DiagnosticsRequest diagnosticsRequest) {
        diagnosticsRequest.setId(UUID.randomUUID());
        DiagnosticsResult diagnosticsResult = this.diagnosticsService.performDiagnostics(diagnosticsRequest);

        return ResponseEntity.ok(diagnosticsResult);
    }
}
