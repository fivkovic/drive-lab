package com.drivelab.core.model;

import lombok.Getter;

@Getter
public enum CarPartType {
    UNIVERSAL(0, "Universal"),
    MODEL_SPECIFIC(1, "Model specific"),
    CUSTOM(2, "Custom");

    private final int code;
    private final String name;

    CarPartType(int code, String name) {
        if (code < 0 || code > 2)
            throw new IllegalArgumentException("code");
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");

        this.code = code;
        this.name = name.trim();
    }

    public static CarPartType parse(String name) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");
        for (CarPartType carPartType : CarPartType.values())
            if (carPartType.getName().equalsIgnoreCase(name))
                return carPartType;
        throw new IndexOutOfBoundsException("name");
    }

    public static CarPartType fromValue(int value) throws IndexOutOfBoundsException {
        if (value < 0 || value > 2)
            throw new IndexOutOfBoundsException("value");
        for (CarPartType carPartType : CarPartType.values())
            if (carPartType.getCode() == value)
                return carPartType;
        throw new IndexOutOfBoundsException("value");
    }
}
