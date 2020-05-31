package com.drivelab.core.service;

import com.drivelab.core.model.VehicleManufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleManufacturerService extends BaseService<VehicleManufacturer, Long> {

    @Autowired
    protected VehicleManufacturerService(JpaRepository<VehicleManufacturer, Long> vehicleManufacturerRepository) { super(vehicleManufacturerRepository); }
}
