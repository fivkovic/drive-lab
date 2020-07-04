package com.drivelab.core.dto;

import com.drivelab.core.model.Problem;
import com.drivelab.core.model.Vehicle;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiagnosticsRequest {

    @NotNull
    private Vehicle vehicle;

    @NotNull
    private List<Problem> problems;

    @NotNull
    @Min(0)
    @Max(100)
    // TODO: Integrate
    private Integer engineOilLevelPercentage;

    @NotNull
    @Min(0)
    @Max(10000000)
    // TODO: Integrate
    private Integer currentVehicleMileage;
}
