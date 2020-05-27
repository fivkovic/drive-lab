package com.drivelab.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FaultProbability {

    private Fault fault;
    private Double probability;
}
