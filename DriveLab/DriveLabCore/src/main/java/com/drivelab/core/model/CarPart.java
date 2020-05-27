package com.drivelab.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CarPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotEmpty
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private CarPartType carPartType;

    @Column
    @NotNull
    private BigDecimal salesPrice;

    @Column
    @NotNull
    // @JsonIgnore                      // TODO: Add JSON ignore if required
    private BigDecimal purchasePrice;

    @Column
    @NotNull
    // @JsonIgnore                      // TODO: Add JSON ignore if required
    private Integer stockCount;

    @Column
    @NotNull
    // @JsonIgnore                      // TODO: Add JSON ignore if required
    private Integer stockLowerBound;
}
