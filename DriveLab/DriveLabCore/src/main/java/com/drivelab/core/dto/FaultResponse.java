package com.drivelab.core.dto;

import com.drivelab.core.model.Fault;
import com.drivelab.core.model.FaultGroup;
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
    private FaultGroup faultGroup;
    private Set<ProblemAndFaultResponse> problems;

}
