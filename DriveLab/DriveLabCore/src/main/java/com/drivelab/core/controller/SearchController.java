package com.drivelab.core.controller;

import com.drivelab.core.dto.DiagnosticsResult;
import com.drivelab.core.dto.ProblemResponse;
import com.drivelab.core.dto.SearchByFaultRequest;
import com.drivelab.core.dto.SearchByProblemsRequest;
import com.drivelab.core.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static com.drivelab.core.common.Constants.API.*;

@RestController
@RequestMapping(SEARCH_ENDPOINT)
@PreAuthorize("hasAuthority('REPAIR_SHOP')")
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @PostMapping(BY_PROBLEM)
    public ResponseEntity<List<DiagnosticsResult>> handleSearchByProblemsRequest(@RequestBody @Valid SearchByProblemsRequest searchByProblemsRequest) {
        List<DiagnosticsResult> searchResults = this.searchService.searchByProblems(searchByProblemsRequest.getProblems());

        return ResponseEntity.ok(searchResults);
    }

    @PostMapping(BY_FAULT)
    public ResponseEntity<List<ProblemResponse>> handleSearchByFaultRequest(@RequestBody @Valid SearchByFaultRequest searchByFaultRequest) {
        List<ProblemResponse> searchResults = this.searchService.searchByFault(searchByFaultRequest.getFault());

        return ResponseEntity.ok(searchResults);
    }
}
