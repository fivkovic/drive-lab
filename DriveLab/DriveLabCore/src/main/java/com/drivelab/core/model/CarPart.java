package com.drivelab.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private CarPartType carPartType;

    @Column
    @Enumerated(EnumType.STRING)
    private CarPartGroup carPartGroup;

    @Column
    @NotNull
    @Min(0)
    private BigDecimal salesPrice;

    @Column
    @NotNull
    @Min(0)
    private BigDecimal purchasePrice;

    @Column
    @NotNull
    @Min(0)
    private Integer stockCount;

    @Column
    @NotNull
    @Min(0)
    private Integer stockLowerBound;
}
