package com.drivelab.core.repository;

import com.drivelab.core.model.CarPart;
import com.drivelab.core.model.CarPartGroup;
import com.drivelab.core.model.CarPartType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarPartRepository extends JpaRepository<CarPart, Long> {
    List<CarPart> findAllByCarPartType(CarPartType carPartType);
    List<CarPart> findAllByCarPartGroup(CarPartGroup carPartGroup);
}
