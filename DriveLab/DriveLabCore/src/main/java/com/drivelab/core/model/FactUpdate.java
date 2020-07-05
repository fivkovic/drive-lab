package com.drivelab.core.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class FactUpdate {

    private final UUID requestId;
    private final Problem problem;
    private boolean processed;
}
