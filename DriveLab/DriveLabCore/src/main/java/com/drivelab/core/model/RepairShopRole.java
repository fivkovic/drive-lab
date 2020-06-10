package com.drivelab.core.model;

import lombok.Getter;

@Getter
public enum RepairShopRole {
    HEADQUARTER(0, "Headquarter"),
    REPAIR_SHOP(1, "Repair shop");

    private final int code;
    private final String name;

    RepairShopRole(int code, String name) {
        if (code < 0 || code > 1)
            throw new IllegalArgumentException("code");
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");

        this.code = code;
        this.name = name.trim();
    }

    public static RepairShopRole parse(String name) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");
        for (RepairShopRole repairShopRole : RepairShopRole.values())
            if (repairShopRole.getName().equalsIgnoreCase(name))
                return repairShopRole;
        throw new IndexOutOfBoundsException("name");
    }

    public static RepairShopRole fromValue(int value) throws IndexOutOfBoundsException {
        if (value < 0 || value > 1)
            throw new IndexOutOfBoundsException("value");
        for (RepairShopRole repairShopRole : RepairShopRole.values())
            if (repairShopRole.getCode() == value)
                return repairShopRole;
        throw new IndexOutOfBoundsException("value");
    }
}
