package com.drivelab.core.service;

import com.drivelab.core.common.Constants;
import com.drivelab.core.dto.DiagnosticsResult;
import com.drivelab.core.dto.FaultResponse;
import com.drivelab.core.dto.ProblemResponse;
import com.drivelab.core.exception.NotFoundException;
import com.drivelab.core.model.Fault;
import com.drivelab.core.model.FaultProbability;
import com.drivelab.core.model.Problem;
import com.drivelab.core.model.ProblemAndFault;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchService {

    // TODO: Move this to separate service
    public void disposeKieSession(KieSession kieSession) {
        kieSession.getFactHandles(factHandle -> (factHandle instanceof Problem))
                .forEach(kieSession::delete);
    }

    // TODO: Move this to static class
    private KieSession getKieSession() {
        return (KieSession) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public List<DiagnosticsResult> searchByProblems(List<Problem> problems) {

        // STEP 1: Get kieSession for user
        final KieSession kieSession = this.getKieSession();

        // STEP 2: Insert initial facts
        problems.forEach(kieSession::insert);

        // STEP 3: Execute query
        final List<FaultProbability> faultProbabilities = new ArrayList<>();
        final QueryResults results = kieSession.getQueryResults(Constants.Drools.SEARCH_BY_PROBLEMS_QUERY_NAME);

        if (results == null || results.size() == 0) throw new NotFoundException("Search returned 0 results.");

        // STEP 4: Get query results
        results.forEach(queryResultsRow ->
                faultProbabilities.add(new FaultProbability(
                        (Fault) queryResultsRow.get("$fault"),
                        ((Long) queryResultsRow.get("$count")).doubleValue()
                )));

        // STEP 5: Convert to results and sort
        final List<DiagnosticsResult> searchResults = faultProbabilities.stream()
                .map(fp -> new DiagnosticsResult(new FaultResponse(fp.getFault()), fp.getProbability()))
                .sorted((o1, o2) -> (int) (o2.getProbability() - o1.getProbability()))
                .collect(Collectors.toList());

        // STEP 6: Dispose kie Session
        this.disposeKieSession(kieSession);

        return searchResults;
    }

    public List<ProblemResponse> searchByFault(String faultName) {

        // STEP 1: Get kieSession for user
        final KieSession kieSession = this.getKieSession();

        // STEP 2: Execute query
        final QueryResults results = kieSession.getQueryResults(Constants.Drools.SEARCH_BY_FAULT_QUERY_NAME, faultName);

        if (!results.iterator().hasNext()) throw new NotFoundException("Search returned 0 results.");

        // STEP 3: Get query results
        final QueryResultsRow row = results.iterator().next();
        final Collection<?> objects = (Collection<?>) row.get("$problems");

        // STEP 4: Convert to results and sort
        final List<ProblemResponse> searchResults = objects.stream()
                .map(obj -> (ProblemAndFault) obj)
                .sorted((o1, o2) -> (o2.getIsCharacteristic() ? 1 : 0) - (o1.getIsCharacteristic() ? 1 : 0))
                .map(problemAndFault -> new ProblemResponse(problemAndFault.getProblem()))
                .collect(Collectors.toList());

        // STEP 5: Dispose kie Session
        this.disposeKieSession(kieSession);

        return searchResults;
    }
}
