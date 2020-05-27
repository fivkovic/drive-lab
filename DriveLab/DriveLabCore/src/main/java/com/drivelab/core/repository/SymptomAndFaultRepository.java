package com.drivelab.core.repository;

import com.drivelab.core.model.SymptomAndFault;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SymptomAndFaultRepository extends JpaRepository<SymptomAndFault, Long> {
}
