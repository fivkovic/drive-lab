package com.drivelab.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Customer owner;

    @ManyToOne
    @JoinColumn
    private VehicleManufacturer manufacturer;

    @NotEmpty
    private String model;

    @NotNull
    private Integer year;

    @NotNull
    private Integer mileage;

    @Column
    @Enumerated(EnumType.STRING)
    private EngineType engineType;

    @NotEmpty
    private String licensePlate;

    @NotEmpty
    private String trafficLicenseNumber;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Repair> repairs;

    public Vehicle(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.owner = vehicle.getOwner();
        this.manufacturer = vehicle.getManufacturer();
        this.model = vehicle.getModel();
        this.year = vehicle.getYear();
        this.mileage = vehicle.getMileage();
        this.engineType = vehicle.getEngineType();
        this.licensePlate = vehicle.getLicensePlate();
        this.trafficLicenseNumber = vehicle.getTrafficLicenseNumber();

        this.repairs = new HashSet<>();
        vehicle.getRepairs().forEach(repair -> this.repairs.add(new Repair(repair)));
    }
}
