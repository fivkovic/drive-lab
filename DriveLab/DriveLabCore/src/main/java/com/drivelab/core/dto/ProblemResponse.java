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
public class ProblemResponse {

    private Long id;
    private String name;
    private String description;

    public ProblemResponse(Problem problem) {
        this.id = problem.getId();
        this.name = problem.getName();
        this.description = problem.getDescription();
    }
}
