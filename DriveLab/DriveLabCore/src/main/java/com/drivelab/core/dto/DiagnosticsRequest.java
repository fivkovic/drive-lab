package com.drivelab.core.dto;

import com.drivelab.core.model.Symptom;
import com.drivelab.core.model.Vehicle;
import lombok.*;

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
    private List<Symptom> symptoms;
}
