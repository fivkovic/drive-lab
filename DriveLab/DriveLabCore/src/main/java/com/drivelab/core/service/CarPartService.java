package com.drivelab.core.service;

import com.drivelab.core.model.CarPart;
import com.drivelab.core.model.CarPartGroup;
import com.drivelab.core.model.CarPartType;
import com.drivelab.core.repository.CarPartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarPartService extends BaseService<CarPart, Long> {

    @Autowired
    protected CarPartService(JpaRepository<CarPart, Long> carPartRepository) { super(carPartRepository); }

    public Collection<CarPart> findAllByType(CarPartType carPartType) {
        return ((CarPartRepository) this.repository).findAllByCarPartType(carPartType);
    }

    public Collection<CarPart> findAllByGroup(CarPartGroup carPartGroup) {
        return ((CarPartRepository) this.repository).findAllByCarPartGroup(carPartGroup);
    }
}
