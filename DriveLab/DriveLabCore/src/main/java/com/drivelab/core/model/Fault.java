package com.drivelab.core.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@NoArgsConstructor
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
    private Integer faultGroup;

    @OneToMany(mappedBy = "fault", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<SymptomAndFault> symptoms;

}
