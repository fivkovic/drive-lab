package com.drivelab.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Fault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotEmpty
    private String name;

    @Column
    private String description;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private FaultGroup faultGroup;

    @OneToMany(mappedBy = "fault", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<SymptomAndFault> symptoms;

    public Fault(Fault fault) {
        this.id = fault.getId();
        this.name = fault.getName();
        this.description = fault.getDescription();
        this.faultGroup = fault.getFaultGroup();
        this.symptoms = new HashSet<>();
        fault.getSymptoms().forEach(symptomAndFault -> this.symptoms.add(new SymptomAndFault(symptomAndFault)));
    }
}
