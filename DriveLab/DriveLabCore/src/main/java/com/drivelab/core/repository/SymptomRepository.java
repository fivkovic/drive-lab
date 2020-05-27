package com.drivelab.core.repository;

import com.drivelab.core.model.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SymptomRepository extends JpaRepository<Symptom, Long> {
}
