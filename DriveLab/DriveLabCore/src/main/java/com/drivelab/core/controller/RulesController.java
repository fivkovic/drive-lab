package com.drivelab.core.controller;

import com.drivelab.core.dto.NewRuleRequest;
import com.drivelab.core.model.Rule;
import com.drivelab.core.service.RuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/api/rules")
@RequiredArgsConstructor
public class RulesController {

    private final RuleService ruleService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid NewRuleRequest newRuleRequest) {
        this.ruleService.create(new Rule(newRuleRequest));
        return ResponseEntity.ok().build();
    }
}
