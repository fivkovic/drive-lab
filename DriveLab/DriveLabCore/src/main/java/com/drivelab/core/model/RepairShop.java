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
public class RepairShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotEmpty
    private String username;

    @NotEmpty
    @JsonIgnore
    private String password;

    @Column
    @NotEmpty
    @Enumerated(EnumType.STRING)
    private RepairShopRole repairShopRole;

    @Column
    @NotEmpty
    private String name;

    @Column
    @NotEmpty
    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
    @JsonIgnore
    private Set<VehicleManufacturer> authorizedFor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
    @JsonIgnore
    private Set<CarPart> partsStock;
}
