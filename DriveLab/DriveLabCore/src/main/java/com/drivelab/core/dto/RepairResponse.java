package com.drivelab.core.dto;

import com.drivelab.core.model.Repair;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RepairResponse {

    private Long id;
    private VehicleResponse vehicle;
    private FaultResponse fault;
    private Boolean wasEngineOilLevelLow;
    private Boolean hasAftermarketPartsFitted;
    private Set<UsedCarPartResponse> usedParts;
    private BigDecimal totalPrice;
    private String performedAt;
    private Date performedOn;

    public RepairResponse(Repair repair) {
        this.id = repair.getId();

        this.vehicle = new VehicleResponse();
        this.vehicle.setManufacturer(repair.getVehicle().getManufacturer());
        this.vehicle.setModel(repair.getVehicle().getModel());
        this.vehicle.setYear(repair.getVehicle().getYear());
        this.vehicle.setLicensePlate(repair.getVehicle().getLicensePlate());
        this.vehicle.setMileage(repair.getVehicle().getMileage());

        this.fault = new FaultResponse(repair.getFault());
        this.wasEngineOilLevelLow = repair.getWasEngineOilLevelLow();
        this.hasAftermarketPartsFitted = repair.getHasAftermarketPartsFitted();
        this.usedParts = repair.getUsedParts().stream().map(UsedCarPartResponse::new).collect(Collectors.toSet());
        this.totalPrice = repair.getTotalPrice();
        this.performedAt = repair.getPerformedAt().getName();
        this.performedOn = repair.getPerformedOn();
    }
}
