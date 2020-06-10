package com.drivelab.core.model;

import lombok.Getter;

@Getter
public enum FaultGroup {
    SUSPENSION_AND_STEERING_SYSTEM(1, "Suspension and steering system"),
    ENGINE(2, "Engine"),
    OTHER(3, "Other");

    private final int code;
    private final String name;

    FaultGroup(int code, String name) {
        if (code < 1 || code > 3)
            throw new IllegalArgumentException("code");
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");

        this.code = code;
        this.name = name.trim();
    }

    public static FaultGroup parse(String name) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException("name");
        for (FaultGroup faultGroup : FaultGroup.values())
            if (faultGroup.getName().equalsIgnoreCase(name))
                return faultGroup;
        throw new IndexOutOfBoundsException("name");
    }

    public static FaultGroup fromValue(int value) throws IndexOutOfBoundsException {
        if (value < 1 || value > 3)
            throw new IndexOutOfBoundsException("value");
        for (FaultGroup faultGroup : FaultGroup.values())
            if (faultGroup.getCode() == value)
                return faultGroup;
        throw new IndexOutOfBoundsException("value");
    }
}