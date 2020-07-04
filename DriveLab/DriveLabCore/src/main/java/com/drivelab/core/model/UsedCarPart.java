package com.drivelab.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsedCarPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Repair repair;

    @ManyToOne
    @JoinColumn
    private CarPart carPart;

    @Column
    @NotNull
    @Min(1)
    private Integer count;

    @SuppressWarnings("unused")
    public UsedCarPart(CarPart carPart, Integer count) {
        this.carPart = carPart;
        this.count = count;
    }
}
