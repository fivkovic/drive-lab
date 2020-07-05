package com.drivelab.core.repository;

import com.drivelab.core.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findByLicensePlate(String licensePlate);
    Optional<Vehicle> findByTrafficLicenseNumber(String trafficLicenseNumber);
}
