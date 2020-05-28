package com.drivelab.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SymptomAndFault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Symptom symptom;

    @ManyToOne
    @JoinColumn
    private Fault fault;

    public SymptomAndFault(SymptomAndFault symptomAndFault) {
        this.id = symptomAndFault.getId();
        this.symptom = new Symptom(symptomAndFault.getSymptom());
        this.fault = null;
    }
}
