package com.drivelab.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Role(Role.Type.EVENT)
@Timestamp("performedOn")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn
    private Fault fault;

    @Column
    private Boolean wasEngineOilLevelLow;

    @Column
    private Boolean hasAftermarketPartsFitted;

    @OneToMany(mappedBy = "repair", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UsedCarPart> usedParts;

    @NotNull
    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn
    private RepairShop performedAt;

    @Column
    @NotNull
    private Date performedOn;
}
