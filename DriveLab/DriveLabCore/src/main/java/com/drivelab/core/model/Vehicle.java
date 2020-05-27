package com.drivelab.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private VehicleManufacturer manufacturer;

    @NotEmpty
    private String model;

    @NotNull
    private Integer year;

    @NotNull
    private Integer mileage;

    @Enumerated(EnumType.STRING)
    private EngineType engineType;

    @NotEmpty
    private String licensePlate;

    @NotEmpty
    private String trafficLicenseNumber;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Repair> repairs;

    @ManyToOne
    @JoinColumn
    private Customer owner;
}
