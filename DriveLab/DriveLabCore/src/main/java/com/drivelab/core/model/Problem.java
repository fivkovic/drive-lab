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
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotEmpty
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "problem", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<ProblemAndFault> problemsAndFaults;

    public Problem(Problem problem) {
        this.id = problem.getId();
        this.name = problem.getName();
        this.description = problem.getDescription();
        this.problemsAndFaults = null;
    }

    @SuppressWarnings("unused")
    public Problem(@NotEmpty String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public Problem(@NotEmpty String name, Set<ProblemAndFault> problemsAndFaults) {
        this.name = name;
        this.problemsAndFaults = problemsAndFaults;
    }
}
