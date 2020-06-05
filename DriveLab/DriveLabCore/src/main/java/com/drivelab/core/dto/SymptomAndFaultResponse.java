package com.drivelab.core.dto;

import com.drivelab.core.model.Symptom;
import com.drivelab.core.model.SymptomAndFault;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SymptomAndFaultResponse {

    private Long id;
    private String name;
    private Boolean isCharacteristic;

    public SymptomAndFaultResponse(Symptom symptom, Boolean isCharacteristic) {
        this.id = symptom.getId();
        this.name = symptom.getName();
        this.isCharacteristic = isCharacteristic;
    }
}
