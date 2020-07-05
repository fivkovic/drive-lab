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
@Expires("180m")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class CarPartPriceChangedEvent {

    private final CarPart carPart;
    private final BigDecimal newPrice;
    private final String supplier;
    private boolean processed;
}
