package com.drivelab.core.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiagnosticsResult {

    @NotNull
    private FaultResponse fault;

    @NotNull
    private Double probability;
}
