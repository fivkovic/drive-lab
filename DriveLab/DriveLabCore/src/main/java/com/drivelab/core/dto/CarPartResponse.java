package com.drivelab.core.dto;

import com.drivelab.core.model.CarPart;
import com.drivelab.core.model.CarPartGroup;
import com.drivelab.core.model.CarPartType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CarPartResponse {
    private Long id;
    private String name;
    private CarPartType carPartType;
    private CarPartGroup carPartGroup;
    private BigDecimal salesPrice;

    public CarPartResponse(CarPart carPart) {
        this.id = carPart.getId();
        this.name = carPart.getName();
        this.carPartType = carPart.getCarPartType();
        this.carPartGroup = carPart.getCarPartGroup();
        this.salesPrice = carPart.getSalesPrice();
    }
}
