package com.drivelab.core.repository;

import com.drivelab.core.model.CarPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarPartRepository extends JpaRepository<CarPart, Long> {
}
