package com.drivelab.core.service;

import com.drivelab.core.dto.CustomRuleRequest;
import com.drivelab.core.model.Rule;
import com.drivelab.core.repository.RuleRepository;
import com.drivelab.core.repository.StorageRepository;
import com.drivelab.core.util.MavenUtils;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.drools.core.audit.event.LogEvent;
import org.drools.template.ObjectDataCompiler;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RuleService {

    private final RuleRepository ruleRepository;
    private final StorageRepository storageRepository;
    private final ObjectDataCompiler objectDataCompiler;

    @SneakyThrows
    public void create(Rule rule) {
        Rule savedRule = this.ruleRepository.save(rule);
        final String generatedRule = this.applyRuleTemplate(rule);
        this.storageRepository.save(rule.getId(), generatedRule);

        MavenUtils.mavenCleanAndInstallRules();
    }

    @SneakyThrows
    public void create(CustomRuleRequest rule) {
        this.storageRepository.save(new Random().nextLong(), rule.getBody());

        MavenUtils.mavenCleanAndInstallRules();
    }

    @SneakyThrows
    private String applyRuleTemplate(Rule rule) {
        InputStream template = this.getClass()
                .getResourceAsStream("/rules/templates/GeneralTemplate.drt");
        List<Rule> data = Collections.singletonList(rule);
        return this.objectDataCompiler.compile(data, template);
    }
}
