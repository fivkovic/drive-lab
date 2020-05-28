package com.drivelab.core.service;

import com.drivelab.core.model.Fault;
import com.drivelab.core.repository.FaultRepository;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReasoningService {

    private final FaultRepository faultRepository;

    public void initializeKieSession() {
        final KieSession kieSession = this.getKieSession();
        this.faultRepository.findAll().forEach(fault -> kieSession.insert(new Fault(fault)));
    }

    private KieSession getKieSession() {
        return (KieSession) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
