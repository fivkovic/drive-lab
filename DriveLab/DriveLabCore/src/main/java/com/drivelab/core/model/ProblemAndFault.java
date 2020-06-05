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
public class ProblemAndFault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Problem problem;

    @Column
    private Boolean isCharacteristic;

    @ManyToOne
    @JoinColumn
    private Fault fault;

    public ProblemAndFault(ProblemAndFault problemAndFault) {
        this.id = problemAndFault.getId();
        this.problem = new Problem(problemAndFault.getProblem());
        this.isCharacteristic = problemAndFault.getIsCharacteristic();
        this.fault = null;
    }
}
