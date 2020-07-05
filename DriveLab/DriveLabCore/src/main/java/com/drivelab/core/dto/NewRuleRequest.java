package com.drivelab.core.dto;

import com.drivelab.core.model.FaultGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewRuleRequest {

    private String ruleName;
    private int problemsCount;
    private FaultGroup faultGroup;
}
