package com.drivelab.core.model;

import com.drivelab.core.dto.NewRuleRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;
    private int problemsCount;
    private String faultGroup;

    public Rule(NewRuleRequest newRuleRequest) {
        this.ruleName = newRuleRequest.getRuleName();
        this.problemsCount = newRuleRequest.getProblemsCount();
        this.faultGroup = newRuleRequest.getFaultGroup().name();
    }
}