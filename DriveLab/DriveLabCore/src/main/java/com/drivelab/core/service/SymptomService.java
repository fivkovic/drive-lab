package com.drivelab.core.service;

import com.drivelab.core.model.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SymptomService extends BaseService<Symptom, Long> {

    @Autowired
    protected SymptomService(JpaRepository<Symptom, Long> symptomRepository) { super(symptomRepository); }
}
