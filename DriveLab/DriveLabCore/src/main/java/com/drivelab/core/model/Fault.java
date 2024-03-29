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
    private Set<ProblemAndFault> problems;

    public Fault(Fault fault) {
        this.id = fault.getId();
        this.name = fault.getName();
        this.description = fault.getDescription();
        this.faultGroup = fault.getFaultGroup();
        this.problems = new HashSet<>();
        fault.getProblems().forEach(problemAndFault -> this.problems.add(new ProblemAndFault(problemAndFault)));
    }

    @SuppressWarnings("unused")
    public Fault(@NotEmpty String name, FaultGroup faultGroup) {
        this.name = name;
        this.faultGroup = faultGroup;
    }

    @SuppressWarnings("unused")
    public Fault(@NotEmpty String name, Set<ProblemAndFault> problems) {
        this.name = name;
        this.problems = problems;
    }
}
