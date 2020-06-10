package com.drivelab.core.service;

import com.drivelab.core.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleService extends BaseService<Vehicle, Long> {

    @Autowired
    protected VehicleService(JpaRepository<Vehicle, Long> vehicleRepository) { super(vehicleRepository); }
}
