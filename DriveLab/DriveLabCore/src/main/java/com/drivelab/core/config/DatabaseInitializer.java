package com.drivelab.core.config;

import com.drivelab.core.model.*;
import com.drivelab.core.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer implements ApplicationRunner {

    private final VehicleManufacturerRepository vehicleManufacturerRepository;
    @Override
    public void run(ApplicationArguments args) {

        // ============================================================================================================
        // Vehicle manufacturer initialization
        // ============================================================================================================
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Acura"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Alfa-Romeo"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Aston-Martin"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Audi"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Bentley"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "BMW"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Bugatti"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Cadillac"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Chevrolet"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Chrysler"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Citroen"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Dodge"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Dacia"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Ferrari"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Fiat"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Ford"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "GMC"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Honda"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Hyundai"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Infiniti"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Jaguar"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Jeep"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Kia"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Lamborghini"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Lancia"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Land Rover"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Lexus"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Lincoln"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Lotus"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Maserati"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Maybach"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Mazda"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Mclaren"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Mercedes"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Mini"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Mitsubishi"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Nissan"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Opel"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Peugeot"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Pontiac"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Porsche"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Renault"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Rolls-Royce"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Saab"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Seat"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Skoda"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Smart"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Subaru"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Suzuki"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Tesla"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Toyota"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Volkswagen"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Volvo"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Yugo"));
        this.vehicleManufacturerRepository.save(new VehicleManufacturer(null, "Zastava"));

    }

}
