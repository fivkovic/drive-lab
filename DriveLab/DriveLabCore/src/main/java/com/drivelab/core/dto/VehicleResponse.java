package com.drivelab.core.dto;

import com.drivelab.core.model.EngineType;
import com.drivelab.core.model.Vehicle;
import com.drivelab.core.model.VehicleManufacturer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VehicleResponse {

    private Long id;
    private CustomerResponse owner;
    private VehicleManufacturer manufacturer;
    private String model;
    private Integer year;
    private Integer mileage;
    private EngineType engineType;
    private String licensePlate;
    private String trafficLicenseNumber;
    private Set<RepairResponse> repairs;

    public VehicleResponse(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.owner = null;                                          // NOTE: Intentionally left null
        this.manufacturer = vehicle.getManufacturer();
        this.model = vehicle.getModel();
        this.year = vehicle.getYear();
        this.mileage = vehicle.getMileage();
        this.engineType = vehicle.getEngineType();
        this.licensePlate = vehicle.getLicensePlate();
        this.trafficLicenseNumber = vehicle.getTrafficLicenseNumber();
        this.repairs = new HashSet<>();
        vehicle.getRepairs().forEach(repair -> this.repairs.add(new RepairResponse(repair)));
    }
}
