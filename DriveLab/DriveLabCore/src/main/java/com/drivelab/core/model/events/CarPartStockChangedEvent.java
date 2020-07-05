package com.drivelab.core.model.events;

import com.drivelab.core.model.CarPart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

import java.math.BigDecimal;

@Role(Role.Type.EVENT)
@Expires("10m")
@Getter
@Setter
@RequiredArgsConstructor
public class CarPartStockChangedEvent {

    private final CarPart carPart;
    private final Integer difference;
}
