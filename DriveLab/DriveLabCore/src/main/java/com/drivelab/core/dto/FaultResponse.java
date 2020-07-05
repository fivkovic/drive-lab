package com.drivelab.core.dto;

import com.drivelab.core.model.Fault;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FaultResponse {

    private Long id;
    private String name;
    private String description;
    private String faultGroup;
    private Set<ProblemAndFaultResponse> problems;

    @SuppressWarnings("unused")
    public FaultResponse(Fault fault) {
        this.id = fault.getId();
        this.name = fault.getName();
        this.description = fault.getDescription();
        this.faultGroup = fault.getFaultGroup().getName();
        this.problems = fault.getProblems().stream().map(problemAndFault ->
                new ProblemAndFaultResponse(problemAndFault.getProblem(), problemAndFault.getIsCharacteristic())
            ).collect(Collectors.toSet());
    }
}
