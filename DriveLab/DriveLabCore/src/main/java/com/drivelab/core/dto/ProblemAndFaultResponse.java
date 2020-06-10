package com.drivelab.core.dto;

import com.drivelab.core.model.Problem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProblemAndFaultResponse {

    private Long id;
    private String name;
    private Boolean isCharacteristic;

    public ProblemAndFaultResponse(Problem problem, Boolean isCharacteristic) {
        this.id = problem.getId();
        this.name = problem.getName();
        this.isCharacteristic = isCharacteristic;
    }
}
