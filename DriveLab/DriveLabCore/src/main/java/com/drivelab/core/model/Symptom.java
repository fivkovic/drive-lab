package com.drivelab.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotEmpty
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "symptom", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<SymptomAndFault> symptomsAndFaults;

    public Symptom(Symptom symptom) {
        this.id = symptom.getId();
        this.name = symptom.getName();
        this.description = symptom.getDescription();
        this.symptomsAndFaults = null;
    }
}
