package com.drivelab.core.model;

import lombok.Getter;

@Getter
public enum EngineType {
    DIESEL(0, "Diesel"),
    GASOLINE(1, "Gasoline"),
    GAS(2, "Gas"),
    HYBRID(3, "Hybrid"),
    ELECTRIC(4, "Electric");

    private final int code;
    private final String name;

    EngineType(int code, String name) {
        if (code < 0 || code > 4)
            throw new IllegalArgumentException("code");
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");

        this.code = code;
        this.name = name.trim();
    }

    public static EngineType parse(String name) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");
        for (EngineType engineType : EngineType.values())
            if (engineType.getName().equalsIgnoreCase(name))
                return engineType;
        throw new IndexOutOfBoundsException("name");
    }

    public static EngineType fromValue(int value) throws IndexOutOfBoundsException {
        if (value < 0 || value > 4)
            throw new IndexOutOfBoundsException("value");
        for (EngineType engineType : EngineType.values())
            if (engineType.getCode() == value)
                return engineType;
        throw new IndexOutOfBoundsException("value");
    }
}
