package com.drivelab.core.model;

import lombok.Getter;

@Getter
public enum CarPartGroup {
    CAR_BODY(0, "Car body components"),
    DOORS(1, "Doors"),
    WINDOWS(2, "Windows and glass"),
    ELECTRONICS(3, "Electronic components"),
    GAUGES(4, "Gauges and meters"),
    IGNITION_SYSTEM(5, "Ignition system"),
    LIGHTING_SYSTEM(6, "Lighting and signaling system"),
    SENSORS(7, "Sensors"),
    INTERIOR(8, "Interior components"),
    BRAKING_SYSTEM(9, "Braking system"),
    POWERTRAIN_COMPONENTS(10, "Powertrain components"),
    ENGINE(11, "Engine components and parts"),
    ENGINE_COOLING_SYSTEM(12, "Engine cooling system"),
    ENGINE_OIL_SYSTEM(13, "Engine oil system"),
    EXHAUST_SYSTEM(14, "Exhaust system"),
    FUEL_SUPPLY_SYSTEM(15, "Fuel supply system"),
    SUSPENSION_AND_STEERING_SYSTEM(16, "Suspension and steering system"),
    TRANSMISSION_SYSTEM(17, "Transmission system"),
    AIR_CONDITIONING(18, "Air conditioning system (AC)"),
    OTHER(19, "Other miscellaneous parts");

    private final int code;
    private final String name;

    CarPartGroup(int code, String name) {
        if (code < 0 || code > 19)
            throw new IllegalArgumentException("code");
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");

        this.code = code;
        this.name = name.trim();
    }

    public static CarPartGroup parse(String name) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");
        for (CarPartGroup carPartGroup : CarPartGroup.values())
            if (carPartGroup.getName().equalsIgnoreCase(name))
                return carPartGroup;
        throw new IndexOutOfBoundsException("name");
    }

    public static CarPartGroup fromValue(int value) throws IndexOutOfBoundsException {
        if (value < 0 || value > 19)
            throw new IndexOutOfBoundsException("value");
        for (CarPartGroup carPartGroup : CarPartGroup.values())
            if (carPartGroup.getCode() == value)
                return carPartGroup;
        throw new IndexOutOfBoundsException("value");
    }
}
