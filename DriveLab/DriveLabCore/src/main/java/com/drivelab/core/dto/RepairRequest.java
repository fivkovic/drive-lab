package com.drivelab.core.dto;

import com.drivelab.core.model.CarPart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RepairRequest {

    private Long vehicleId;
    private Long faultId;
    private Integer currentVehicleMileage;
    private Boolean wasEngineOilLevelLow;
    private Boolean hasAftermarketPartsFitted;

    private Set<CarPart> usedParts;
    private Long repairShopId;
}
