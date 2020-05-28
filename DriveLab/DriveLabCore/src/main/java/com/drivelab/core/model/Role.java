package com.drivelab.core.model;

import lombok.Getter;

@Getter
public enum Role {
    HEADQUARTER(0, "Headquarter"),
    REPAIR_SHOP(1, "Repair shop");

    private final int code;
    private final String name;

    Role(int code, String name) {
        if (code < 0 || code > 1)
            throw new IllegalArgumentException("code");
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");

        this.code = code;
        this.name = name.trim();
    }

    public static Role parse(String name) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");
        for (Role role : Role.values())
            if (role.getName().equalsIgnoreCase(name))
                return role;
        throw new IndexOutOfBoundsException("name");
    }

    public static Role fromValue(int value) throws IndexOutOfBoundsException {
        if (value < 0 || value > 1)
            throw new IndexOutOfBoundsException("value");
        for (Role role : Role.values())
            if (role.getCode() == value)
                return role;
        throw new IndexOutOfBoundsException("value");
    }
}
