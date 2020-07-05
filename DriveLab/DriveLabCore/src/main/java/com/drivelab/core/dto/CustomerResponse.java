package com.drivelab.core.dto;

import com.drivelab.core.model.Customer;
import com.drivelab.core.model.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Set<Vehicle> ownedVehicles;

    public CustomerResponse(Customer customer) {
        this.id = customer.getId();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.phoneNumber = customer.getPhoneNumber();
        this.email = customer.getEmail();
        this.ownedVehicles = customer.getOwnedVehicles();
        this.ownedVehicles.forEach(vehicle -> {
            vehicle.setOwner(null);
            vehicle.setRepairs(null);
        });
    }
}
