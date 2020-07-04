package com.drivelab.core.dto;

import com.drivelab.core.model.Problem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SearchByProblemsRequest {

    @NotNull
    private List<Problem> problems;
}
