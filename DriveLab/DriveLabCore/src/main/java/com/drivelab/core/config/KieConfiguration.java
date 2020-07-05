package com.drivelab.core.config;

import org.drools.template.ObjectDataCompiler;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KieConfiguration {

    @Value("${rules.groupId}")
    private String groupId;

    @Value("${rules.artifactId}")
    private String artifactId;

    @Value("${rules.version}")
    private String version;

    @Bean
    public KieBase kieBase() {
        final KieServices kieServices = KieServices.Factory.get();
        final KieBaseConfiguration kieBaseConfig = kieServices.newKieBaseConfiguration();
        kieBaseConfig.setOption(EventProcessingOption.STREAM);

        final KieContainer kieContainer = kieServices.newKieContainer(kieServices.newReleaseId(groupId, artifactId, version));
        final KieScanner kieScanner = kieServices.newKieScanner(kieContainer);
        kieScanner.start(5000);

        return kieContainer.newKieBase(kieBaseConfig);
    }

    @Bean
    public ObjectDataCompiler objectDataCompiler() {
        return new ObjectDataCompiler();
    }
}
