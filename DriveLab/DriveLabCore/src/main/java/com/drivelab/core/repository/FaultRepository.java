package com.drivelab.core.repository;

import com.drivelab.core.model.Fault;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaultRepository extends JpaRepository<Fault, Long> {
}
