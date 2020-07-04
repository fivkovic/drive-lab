package com.drivelab.core.dto;

import com.drivelab.core.model.CarPart;
import com.drivelab.core.model.CarPartGroup;
import com.drivelab.core.model.CarPartType;
import com.drivelab.core.model.UsedCarPart;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class UsedCarPartResponse {
    private Long id;
    private String name;
    private CarPartType carPartType;
    private CarPartGroup carPartGroup;
    private BigDecimal salesPrice;
    private Integer count;

    public UsedCarPartResponse(UsedCarPart usedCarPart) {
        this.id = usedCarPart.getId();
        this.name = usedCarPart.getCarPart().getName();
        this.carPartType = usedCarPart.getCarPart().getCarPartType();
        this.carPartGroup = usedCarPart.getCarPart().getCarPartGroup();
        this.salesPrice = usedCarPart.getCarPart().getSalesPrice();
        this.count = usedCarPart.getCount();
    }
}
