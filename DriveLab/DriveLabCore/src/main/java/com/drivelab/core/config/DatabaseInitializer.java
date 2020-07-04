package com.drivelab.core.config;

import com.drivelab.core.model.*;
import com.drivelab.core.repository.*;
import com.drivelab.core.util.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer implements ApplicationRunner {

    private final VehicleManufacturerRepository vehicleManufacturerRepository;
    private final CarPartRepository carPartRepository;
    private final RepairShopRepository repairShopRepository;

    private final ProblemRepository problemRepository;
    private final FaultRepository faultRepository;

    private final CustomerRepository customerRepository;
    private final VehicleRepository vehicleRepository;

    private final RepairRepository repairRepository;

    private final PasswordEncoder passwordEncoder;

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

        // ============================================================================================================
        // Car parts initialization
        // ============================================================================================================
        final CarPart carPart1 = this.carPartRepository.save(new CarPart(null, "Hood", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(150), new BigDecimal(75), 0, 0));
        final CarPart carPart2 = this.carPartRepository.save(new CarPart(null, "Bumper", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(100), new BigDecimal(50), 0, 0));
        final CarPart carPart3 = this.carPartRepository.save(new CarPart(null, "Trunk door", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(150), new BigDecimal(75), 0, 0));
        final CarPart carPart4 = this.carPartRepository.save(new CarPart(null, "Mudguard", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(40), new BigDecimal(20), 0, 0));
        final CarPart carPart5 = this.carPartRepository.save(new CarPart(null, "Grill mask", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(40), new BigDecimal(20), 0, 0));
        final CarPart carPart6 = this.carPartRepository.save(new CarPart(null, "Pillar", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(200), new BigDecimal(100), 0, 0));
        final CarPart carPart7 = this.carPartRepository.save(new CarPart(null, "Quarter wing panel", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(80), new BigDecimal(40), 0, 0));
        final CarPart carPart8 = this.carPartRepository.save(new CarPart(null, "Roof rack", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(120), new BigDecimal(60), 0, 0));
        final CarPart carPart9 = this.carPartRepository.save(new CarPart(null, "Spoiler", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(150), new BigDecimal(75), 0, 0));
        final CarPart carPart10 = this.carPartRepository.save(new CarPart(null, "Rim", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(20), new BigDecimal(10), 20, 4));
        final CarPart carPart11 = this.carPartRepository.save(new CarPart(null, "Hubcap", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(10), new BigDecimal(5), 20, 4));
        final CarPart carPart12 = this.carPartRepository.save(new CarPart(null, "Welded assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(300), new BigDecimal(150), 0, 0));
        final CarPart carPart13 = this.carPartRepository.save(new CarPart(null, "Anti-intrusion bar", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(50), new BigDecimal(25), 2, 0));
        final CarPart carPart14 = this.carPartRepository.save(new CarPart(null, "Outer door handle", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(15), new BigDecimal(7.5), 4, 1));
        final CarPart carPart15 = this.carPartRepository.save(new CarPart(null, "Inner door handle", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(15), new BigDecimal(7.5), 4, 1));
        final CarPart carPart16 = this.carPartRepository.save(new CarPart(null, "Window motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(40), new BigDecimal(20), 1, 0));
        final CarPart carPart17 = this.carPartRepository.save(new CarPart(null, "Door control module", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(50), new BigDecimal(25), 1, 0));
        final CarPart carPart18 = this.carPartRepository.save(new CarPart(null, "Door seal", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart19 = this.carPartRepository.save(new CarPart(null, "Door water-shield", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart20 = this.carPartRepository.save(new CarPart(null, "Door Hinge", CarPartType.UNIVERSAL, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart21 = this.carPartRepository.save(new CarPart(null, "Door latch", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart22 = this.carPartRepository.save(new CarPart(null, "Door lock", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(30), new BigDecimal(15), 5, 1));
        final CarPart carPart23 = this.carPartRepository.save(new CarPart(null, "Central locking", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(100), new BigDecimal(50), 1, 0));
        final CarPart carPart24 = this.carPartRepository.save(new CarPart(null, "Fuel tank door", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(15), new BigDecimal(7.5), 5, 1));
        final CarPart carPart25 = this.carPartRepository.save(new CarPart(null, "Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(50), new BigDecimal(25), 0, 0));
        final CarPart carPart26 = this.carPartRepository.save(new CarPart(null, "Front Right Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(80), new BigDecimal(40), 0, 0));
        final CarPart carPart27 = this.carPartRepository.save(new CarPart(null, "Front Left Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(80), new BigDecimal(40), 0, 0));
        final CarPart carPart28 = this.carPartRepository.save(new CarPart(null, "Rear Right Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(60), new BigDecimal(30), 0, 0));
        final CarPart carPart29 = this.carPartRepository.save(new CarPart(null, "Rear Left Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(60), new BigDecimal(30), 0, 0));
        final CarPart carPart30 = this.carPartRepository.save(new CarPart(null, "Sunroof Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(400), new BigDecimal(200), 0, 0));
        final CarPart carPart31 = this.carPartRepository.save(new CarPart(null, "Trunk door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(180), new BigDecimal(90), 0, 0));
        final CarPart carPart32 = this.carPartRepository.save(new CarPart(null, "Windshield", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(250), new BigDecimal(125), 0, 0));
        final CarPart carPart33 = this.carPartRepository.save(new CarPart(null, "Alternator", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(177), new BigDecimal(88.5), 3, 1));
        final CarPart carPart34 = this.carPartRepository.save(new CarPart(null, "Battery", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(135), new BigDecimal(67.5), 2, 0));
        final CarPart carPart35 = this.carPartRepository.save(new CarPart(null, "Performance Battery", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(72), new BigDecimal(36), 0, 0));
        final CarPart carPart36 = this.carPartRepository.save(new CarPart(null, "Battery Box", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(17), new BigDecimal(8.5), 2, 0));
        final CarPart carPart37 = this.carPartRepository.save(new CarPart(null, "Battery Cable terminal", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(127), new BigDecimal(63.5), 4, 1));
        final CarPart carPart38 = this.carPartRepository.save(new CarPart(null, "Battery Cable", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(64), new BigDecimal(32), 4, 1));
        final CarPart carPart39 = this.carPartRepository.save(new CarPart(null, "Battery Control system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(50), new BigDecimal(25), 2, 0));
        final CarPart carPart40 = this.carPartRepository.save(new CarPart(null, "Battery Plate", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(182), new BigDecimal(91), 0, 0));
        final CarPart carPart41 = this.carPartRepository.save(new CarPart(null, "Battery tray", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(101), new BigDecimal(50.5), 2, 0));
        final CarPart carPart42 = this.carPartRepository.save(new CarPart(null, "Battery Cap", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(123), new BigDecimal(61.5), 0, 0));
        final CarPart carPart43 = this.carPartRepository.save(new CarPart(null, "Sulphuric Acid (H2SO4)", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(57), new BigDecimal(28.5), 3, 1));
        final CarPart carPart44 = this.carPartRepository.save(new CarPart(null, "Distilled Water", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(71), new BigDecimal(35.5), 1, 0));
        final CarPart carPart45 = this.carPartRepository.save(new CarPart(null, "Voltage regulator", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(257), new BigDecimal(128.5), 5, 1));
        final CarPart carPart46 = this.carPartRepository.save(new CarPart(null, "Door switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(232), new BigDecimal(116), 3, 1));
        final CarPart carPart47 = this.carPartRepository.save(new CarPart(null, "Ignition switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(66), new BigDecimal(33), 0, 0));
        final CarPart carPart48 = this.carPartRepository.save(new CarPart(null, "Power window switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(40), new BigDecimal(20), 0, 0));
        final CarPart carPart49 = this.carPartRepository.save(new CarPart(null, "Steering column switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(91), new BigDecimal(45.5), 5, 1));
        final CarPart carPart50 = this.carPartRepository.save(new CarPart(null, "Switch cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(147), new BigDecimal(73.5), 4, 1));
        final CarPart carPart51 = this.carPartRepository.save(new CarPart(null, "Switch panel", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(66), new BigDecimal(33), 1, 0));
        final CarPart carPart52 = this.carPartRepository.save(new CarPart(null, "Thermostat", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(232), new BigDecimal(116), 0, 0));
        final CarPart carPart53 = this.carPartRepository.save(new CarPart(null, "Frame switch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(15), new BigDecimal(7.5), 3, 1));
        final CarPart carPart54 = this.carPartRepository.save(new CarPart(null, "Fan ditch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(85), new BigDecimal(42.5), 4, 1));
        final CarPart carPart55 = this.carPartRepository.save(new CarPart(null, "Parts and functions of starter system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(196), new BigDecimal(98), 2, 0));
        final CarPart carPart56 = this.carPartRepository.save(new CarPart(null, "Neutral Safety Switch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(275), new BigDecimal(137.5), 0, 0));
        final CarPart carPart57 = this.carPartRepository.save(new CarPart(null, "Wiring harness", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(127), new BigDecimal(63.5), 4, 1));
        final CarPart carPart58 = this.carPartRepository.save(new CarPart(null, "Air bag control module", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(72), new BigDecimal(36), 2, 0));
        final CarPart carPart59 = this.carPartRepository.save(new CarPart(null, "Alarm and siren", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(40), new BigDecimal(20), 1, 0));
        final CarPart carPart60 = this.carPartRepository.save(new CarPart(null, "Central locking system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(113), new BigDecimal(56.5), 1, 0));
        final CarPart carPart61 = this.carPartRepository.save(new CarPart(null, "Chassis control computer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(156), new BigDecimal(78), 0, 0));
        final CarPart carPart62 = this.carPartRepository.save(new CarPart(null, "Cruise control computer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(113), new BigDecimal(56.5), 5, 1));
        final CarPart carPart63 = this.carPartRepository.save(new CarPart(null, "Door contact", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(29), new BigDecimal(14.5), 4, 1));
        final CarPart carPart64 = this.carPartRepository.save(new CarPart(null, "Engine computer and management system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(205), new BigDecimal(102.5), 0, 0));
        final CarPart carPart65 = this.carPartRepository.save(new CarPart(null, "Engine control unit", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(204), new BigDecimal(102), 0, 0));
        final CarPart carPart66 = this.carPartRepository.save(new CarPart(null, "Fuse", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(128), new BigDecimal(64), 2, 0));
        final CarPart carPart67 = this.carPartRepository.save(new CarPart(null, "Fuse box", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(181), new BigDecimal(90.5), 5, 1));
        final CarPart carPart68 = this.carPartRepository.save(new CarPart(null, "Ground strap", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(138), new BigDecimal(69), 5, 1));
        final CarPart carPart69 = this.carPartRepository.save(new CarPart(null, "Grab Handle", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(294), new BigDecimal(147), 1, 0));
        final CarPart carPart70 = this.carPartRepository.save(new CarPart(null, "Performance chip", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(282), new BigDecimal(141), 2, 0));
        final CarPart carPart71 = this.carPartRepository.save(new CarPart(null, "Relay connector", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(81), new BigDecimal(40.5), 0, 0));
        final CarPart carPart72 = this.carPartRepository.save(new CarPart(null, "Remote lock", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(169), new BigDecimal(84.5), 4, 1));
        final CarPart carPart73 = this.carPartRepository.save(new CarPart(null, "Speed controller", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(290), new BigDecimal(145), 2, 0));
        final CarPart carPart74 = this.carPartRepository.save(new CarPart(null, "Transmission computer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(201), new BigDecimal(100.5), 0, 0));
        final CarPart carPart75 = this.carPartRepository.save(new CarPart(null, "Wiring connector", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(218), new BigDecimal(109), 0, 0));
        final CarPart carPart76 = this.carPartRepository.save(new CarPart(null, "Ammeter", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart77 = this.carPartRepository.save(new CarPart(null, "Clinometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart78 = this.carPartRepository.save(new CarPart(null, "Dynamometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart79 = this.carPartRepository.save(new CarPart(null, "Fuel gauge", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart80 = this.carPartRepository.save(new CarPart(null, "Manometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart81 = this.carPartRepository.save(new CarPart(null, "Hydrometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart82 = this.carPartRepository.save(new CarPart(null, "Odometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart83 = this.carPartRepository.save(new CarPart(null, "Speedometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart84 = this.carPartRepository.save(new CarPart(null, "Tachometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart85 = this.carPartRepository.save(new CarPart(null, "Temperature gauge", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart86 = this.carPartRepository.save(new CarPart(null, "Tire pressure gauge", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        final CarPart carPart87 = this.carPartRepository.save(new CarPart(null, "Sparking cable", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart88 = this.carPartRepository.save(new CarPart(null, "Distributor", CarPartType.MODEL_SPECIFIC, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart89 = this.carPartRepository.save(new CarPart(null, "Distributor Cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart90 = this.carPartRepository.save(new CarPart(null, "Electronic timing controller", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart91 = this.carPartRepository.save(new CarPart(null, "Ignition box", CarPartType.MODEL_SPECIFIC, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart92 = this.carPartRepository.save(new CarPart(null, "Ignition coil", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart93 = this.carPartRepository.save(new CarPart(null, "Ignition Coil Connector", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart94 = this.carPartRepository.save(new CarPart(null, "Ignition coil parts", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart95 = this.carPartRepository.save(new CarPart(null, "Ignition magneto", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart96 = this.carPartRepository.save(new CarPart(null, "Spark plug", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart97 = this.carPartRepository.save(new CarPart(null, "Glow Plug", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart98 = this.carPartRepository.save(new CarPart(null, "Engine bay lighting", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart99 = this.carPartRepository.save(new CarPart(null, "Fog light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart100 = this.carPartRepository.save(new CarPart(null, "Spotlight", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart101 = this.carPartRepository.save(new CarPart(null, "Headlight", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart102 = this.carPartRepository.save(new CarPart(null, "Headlight motor", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart103 = this.carPartRepository.save(new CarPart(null, "Interior light and lamp", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart104 = this.carPartRepository.save(new CarPart(null, "License plate lamp", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart105 = this.carPartRepository.save(new CarPart(null, "Side lighting", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart106 = this.carPartRepository.save(new CarPart(null, "Brake light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart107 = this.carPartRepository.save(new CarPart(null, "Tail light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart108 = this.carPartRepository.save(new CarPart(null, "Tail light cover", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart109 = this.carPartRepository.save(new CarPart(null, "Indicator light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart110 = this.carPartRepository.save(new CarPart(null, "Turn signal control", CarPartType.MODEL_SPECIFIC, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(100), new BigDecimal(50), 1, 0));
        final CarPart carPart111 = this.carPartRepository.save(new CarPart(null, "ABS Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(18), new BigDecimal(9), 0, 0));
        final CarPart carPart112 = this.carPartRepository.save(new CarPart(null, "Airbag sensors", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(73), new BigDecimal(36.5), 0, 0));
        final CarPart carPart113 = this.carPartRepository.save(new CarPart(null, "Automatic transmission speed sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(10), new BigDecimal(5), 0, 0));
        final CarPart carPart114 = this.carPartRepository.save(new CarPart(null, "Camshaft position sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(35), new BigDecimal(17.5), 0, 0));
        final CarPart carPart115 = this.carPartRepository.save(new CarPart(null, "Crankshaft position sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(39), new BigDecimal(19.5), 0, 0));
        final CarPart carPart116 = this.carPartRepository.save(new CarPart(null, "Coolant temperature sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(24), new BigDecimal(12), 0, 0));
        final CarPart carPart117 = this.carPartRepository.save(new CarPart(null, "Fuel level sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(15), new BigDecimal(7.5), 0, 0));
        final CarPart carPart118 = this.carPartRepository.save(new CarPart(null, "Fuel pressure sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(67), new BigDecimal(33.5), 0, 0));
        final CarPart carPart119 = this.carPartRepository.save(new CarPart(null, "Knock sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(36), new BigDecimal(18), 0, 0));
        final CarPart carPart120 = this.carPartRepository.save(new CarPart(null, "Light sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(25), new BigDecimal(12.5), 0, 0));
        final CarPart carPart121 = this.carPartRepository.save(new CarPart(null, "MAP sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(94), new BigDecimal(47), 0, 0));
        final CarPart carPart122 = this.carPartRepository.save(new CarPart(null, "Mass airflow sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(39), new BigDecimal(19.5), 0, 0));
        final CarPart carPart123 = this.carPartRepository.save(new CarPart(null, "Oil level sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(47), new BigDecimal(23.5), 0, 0));
        final CarPart carPart124 = this.carPartRepository.save(new CarPart(null, "Oil pressure sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(49), new BigDecimal(24.5), 0, 0));
        final CarPart carPart125 = this.carPartRepository.save(new CarPart(null, "Oxygen sensor (o2)", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(29), new BigDecimal(14.5), 0, 0));
        final CarPart carPart126 = this.carPartRepository.save(new CarPart(null, "Throttle position sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(83), new BigDecimal(41.5), 0, 0));
        final CarPart carPart127 = this.carPartRepository.save(new CarPart(null, "Anti-lock braking system (ABS)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(183), new BigDecimal(91.5), 1, 0));
        final CarPart carPart128 = this.carPartRepository.save(new CarPart(null, "ABS steel pin", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(81), new BigDecimal(40.5), 9, 2));
        final CarPart carPart129 = this.carPartRepository.save(new CarPart(null, "FR Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        final CarPart carPart130 = this.carPartRepository.save(new CarPart(null, "FL Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(47), new BigDecimal(23.5), 5, 1));
        final CarPart carPart131 = this.carPartRepository.save(new CarPart(null, "RR Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(121), new BigDecimal(60.5), 5, 1));
        final CarPart carPart132 = this.carPartRepository.save(new CarPart(null, "RL Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(37), new BigDecimal(18.5), 8, 2));
        final CarPart carPart133 = this.carPartRepository.save(new CarPart(null, "ABS Motor Circuit", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(22), new BigDecimal(11), 8, 2));
        final CarPart carPart134 = this.carPartRepository.save(new CarPart(null, "Adjusting mechanism (adjuster star wheel)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(144), new BigDecimal(72), 7, 1));
        final CarPart carPart135 = this.carPartRepository.save(new CarPart(null, "Anchor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(130), new BigDecimal(65), 9, 2));
        final CarPart carPart136 = this.carPartRepository.save(new CarPart(null, "Bleed nipple", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(80), new BigDecimal(40), 10, 2));
        final CarPart carPart137 = this.carPartRepository.save(new CarPart(null, "Brake backing plate", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(196), new BigDecimal(98), 5, 1));
        final CarPart carPart138 = this.carPartRepository.save(new CarPart(null, "Brake backing pad", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(127), new BigDecimal(63.5), 0, 0));
        final CarPart carPart139 = this.carPartRepository.save(new CarPart(null, "Brake cooling duct", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(162), new BigDecimal(81), 8, 2));
        final CarPart carPart140 = this.carPartRepository.save(new CarPart(null, "Brake disc", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(51), new BigDecimal(25.5), 5, 1));
        final CarPart carPart141 = this.carPartRepository.save(new CarPart(null, "Brake fluid", CarPartType.UNIVERSAL, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(185), new BigDecimal(92.5), 0, 0));
        final CarPart carPart142 = this.carPartRepository.save(new CarPart(null, "Brake drum", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(124), new BigDecimal(62), 7, 1));
        final CarPart carPart143 = this.carPartRepository.save(new CarPart(null, "Brake lining", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(150), new BigDecimal(75), 8, 2));
        final CarPart carPart144 = this.carPartRepository.save(new CarPart(null, "Brake pad", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(51), new BigDecimal(25.5), 9, 2));
        final CarPart carPart145 = this.carPartRepository.save(new CarPart(null, "Brake pedal", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(189), new BigDecimal(94.5), 10, 2));
        final CarPart carPart146 = this.carPartRepository.save(new CarPart(null, "Brake piston", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(178), new BigDecimal(89), 1, 0));
        final CarPart carPart147 = this.carPartRepository.save(new CarPart(null, "Brake pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(71), new BigDecimal(35.5), 1, 0));
        final CarPart carPart148 = this.carPartRepository.save(new CarPart(null, "Brake roll", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(138), new BigDecimal(69), 5, 1));
        final CarPart carPart149 = this.carPartRepository.save(new CarPart(null, "Brake rotor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(42), new BigDecimal(21), 9, 2));
        final CarPart carPart150 = this.carPartRepository.save(new CarPart(null, "Brake servo", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(151), new BigDecimal(75.5), 0, 0));
        final CarPart carPart151 = this.carPartRepository.save(new CarPart(null, "Brake shoe", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(85), new BigDecimal(42.5), 10, 2));
        final CarPart carPart152 = this.carPartRepository.save(new CarPart(null, "Brake lining", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(17), new BigDecimal(8.5), 8, 2));
        final CarPart carPart153 = this.carPartRepository.save(new CarPart(null, "Shoe web", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(176), new BigDecimal(88), 9, 2));
        final CarPart carPart154 = this.carPartRepository.save(new CarPart(null, "Brake warning light", CarPartType.UNIVERSAL, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(23), new BigDecimal(11.5), 3, 1));
        final CarPart carPart155 = this.carPartRepository.save(new CarPart(null, "Calibrated friction brake", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(174), new BigDecimal(87), 8, 2));
        final CarPart carPart156 = this.carPartRepository.save(new CarPart(null, "Caliper", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(148), new BigDecimal(74), 1, 0));
        final CarPart carPart157 = this.carPartRepository.save(new CarPart(null, "Combination valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(94), new BigDecimal(47), 0, 0));
        final CarPart carPart158 = this.carPartRepository.save(new CarPart(null, "Dual circuit brake system", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(58), new BigDecimal(29), 3, 1));
        final CarPart carPart159 = this.carPartRepository.save(new CarPart(null, "Hold-down springs (retainer springs)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 2, 0));
        final CarPart carPart160 = this.carPartRepository.save(new CarPart(null, "Hose", CarPartType.UNIVERSAL, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(120), new BigDecimal(60), 6, 1));
        final CarPart carPart161 = this.carPartRepository.save(new CarPart(null, "Brake booster hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(127), new BigDecimal(63.5), 10, 2));
        final CarPart carPart162 = this.carPartRepository.save(new CarPart(null, "Air brake nylon hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(135), new BigDecimal(67.5), 10, 2));
        final CarPart carPart163 = this.carPartRepository.save(new CarPart(null, "Brake duct hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(57), new BigDecimal(28.5), 9, 2));
        final CarPart carPart164 = this.carPartRepository.save(new CarPart(null, "Hydraulic booster unit", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(78), new BigDecimal(39), 10, 2));
        final CarPart carPart165 = this.carPartRepository.save(new CarPart(null, "Load-sensing valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(31), new BigDecimal(15.5), 4, 1));
        final CarPart carPart166 = this.carPartRepository.save(new CarPart(null, "Master cylinder", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(137), new BigDecimal(68.5), 5, 1));
        final CarPart carPart167 = this.carPartRepository.save(new CarPart(null, "Metering valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(31), new BigDecimal(15.5), 7, 1));
        final CarPart carPart168 = this.carPartRepository.save(new CarPart(null, "Other braking system parts", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(139), new BigDecimal(69.5), 2, 0));
        final CarPart carPart169 = this.carPartRepository.save(new CarPart(null, "Park brake lever/handle (hand brake)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(25), new BigDecimal(12.5), 8, 2));
        final CarPart carPart170 = this.carPartRepository.save(new CarPart(null, "Pressure differential valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(177), new BigDecimal(88.5), 5, 1));
        final CarPart carPart171 = this.carPartRepository.save(new CarPart(null, "Proportioning valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(177), new BigDecimal(88.5), 5, 1));
        final CarPart carPart172 = this.carPartRepository.save(new CarPart(null, "Reservoir", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(181), new BigDecimal(90.5), 0, 0));
        final CarPart carPart173 = this.carPartRepository.save(new CarPart(null, "Shoe return spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(102), new BigDecimal(51), 5, 1));
        final CarPart carPart174 = this.carPartRepository.save(new CarPart(null, "Tyre", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(53), new BigDecimal(26.5), 1, 0));
        final CarPart carPart175 = this.carPartRepository.save(new CarPart(null, "Vacuum brake booster", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(147), new BigDecimal(73.5), 1, 0));
        final CarPart carPart176 = this.carPartRepository.save(new CarPart(null, "Wheel cylinder (slave cylinder)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(34), new BigDecimal(17), 10, 2));
        final CarPart carPart177 = this.carPartRepository.save(new CarPart(null, "Wheel stud", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(76), new BigDecimal(38), 8, 2));
        final CarPart carPart178 = this.carPartRepository.save(new CarPart(null, "Electric motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(21), new BigDecimal(10.5), 10, 2));
        final CarPart carPart179 = this.carPartRepository.save(new CarPart(null, "Induction motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        final CarPart carPart180 = this.carPartRepository.save(new CarPart(null, "Synchronous motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(27), new BigDecimal(13.5), 10, 2));
        final CarPart carPart181 = this.carPartRepository.save(new CarPart(null, "High voltage battery pack", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(11), new BigDecimal(5.5), 10, 2));
        final CarPart carPart182 = this.carPartRepository.save(new CarPart(null, "Battery management system", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        final CarPart carPart183 = this.carPartRepository.save(new CarPart(null, "Nickel–metal hydride battery", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        final CarPart carPart184 = this.carPartRepository.save(new CarPart(null, "Lithium-ion battery", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart185 = this.carPartRepository.save(new CarPart(null, "Fuel cell", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart186 = this.carPartRepository.save(new CarPart(null, "Hydrogen tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart187 = this.carPartRepository.save(new CarPart(null, "DC-DC converter", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart188 = this.carPartRepository.save(new CarPart(null, "Inverter", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart189 = this.carPartRepository.save(new CarPart(null, "Charge port", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart190 = this.carPartRepository.save(new CarPart(null, "SAE J1772 (Type 1 connector)", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart191 = this.carPartRepository.save(new CarPart(null, "Type 2 connector", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart192 = this.carPartRepository.save(new CarPart(null, "CHAdeMO", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart193 = this.carPartRepository.save(new CarPart(null, "CCS", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart194 = this.carPartRepository.save(new CarPart(null, "Thermal management system", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        final CarPart carPart195 = this.carPartRepository.save(new CarPart(null, "Radiator", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart196 = this.carPartRepository.save(new CarPart(null, "Fan", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        final CarPart carPart197 = this.carPartRepository.save(new CarPart(null, "Glycol", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        final CarPart carPart198 = this.carPartRepository.save(new CarPart(null, "Charger", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        final CarPart carPart199 = this.carPartRepository.save(new CarPart(null, "Diesel engine, petrol engine (gasoline engine)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(264), new BigDecimal(132), 4, 1));
        final CarPart carPart200 = this.carPartRepository.save(new CarPart(null, "Accessory belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(52), new BigDecimal(26), 1, 0));
        final CarPart carPart201 = this.carPartRepository.save(new CarPart(null, "Air duct", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(314), new BigDecimal(157), 5, 1));
        final CarPart carPart202 = this.carPartRepository.save(new CarPart(null, "Air intake housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(56), new BigDecimal(28), 4, 1));
        final CarPart carPart203 = this.carPartRepository.save(new CarPart(null, "Air intake manifold", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(257), new BigDecimal(128.5), 4, 1));
        final CarPart carPart204 = this.carPartRepository.save(new CarPart(null, "Camshaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(109), new BigDecimal(54.5), 3, 1));
        final CarPart carPart205 = this.carPartRepository.save(new CarPart(null, "Camshaft bearing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(98), new BigDecimal(49), 0, 0));
        final CarPart carPart206 = this.carPartRepository.save(new CarPart(null, "Camshaft fastener", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(151), new BigDecimal(75.5), 1, 0));
        final CarPart carPart207 = this.carPartRepository.save(new CarPart(null, "Camshaft follower", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(154), new BigDecimal(77), 2, 0));
        final CarPart carPart208 = this.carPartRepository.save(new CarPart(null, "Camshaft locking plate", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(165), new BigDecimal(82.5), 3, 1));
        final CarPart carPart209 = this.carPartRepository.save(new CarPart(null, "Camshaft pushrod", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(336), new BigDecimal(168), 5, 1));
        final CarPart carPart210 = this.carPartRepository.save(new CarPart(null, "Camshaft spacer ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(236), new BigDecimal(118), 5, 1));
        final CarPart carPart211 = this.carPartRepository.save(new CarPart(null, "Camshaft phase variator", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(123), new BigDecimal(61.5), 2, 0));
        final CarPart carPart212 = this.carPartRepository.save(new CarPart(null, "Connecting rod", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(144), new BigDecimal(72), 2, 0));
        final CarPart carPart213 = this.carPartRepository.save(new CarPart(null, "Connecting rod bearing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(69), new BigDecimal(34.5), 1, 0));
        final CarPart carPart214 = this.carPartRepository.save(new CarPart(null, "Connecting rod bolt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(263), new BigDecimal(131.5), 1, 0));
        final CarPart carPart215 = this.carPartRepository.save(new CarPart(null, "Connecting rod washer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(362), new BigDecimal(181), 2, 0));
        final CarPart carPart216 = this.carPartRepository.save(new CarPart(null, "Crank case", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(174), new BigDecimal(87), 0, 0));
        final CarPart carPart217 = this.carPartRepository.save(new CarPart(null, "Crank pulley", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(109), new BigDecimal(54.5), 1, 0));
        final CarPart carPart218 = this.carPartRepository.save(new CarPart(null, "Crankshaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(122), new BigDecimal(61), 3, 1));
        final CarPart carPart219 = this.carPartRepository.save(new CarPart(null, "Crankshaft oil seal (or rear main seal)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(339), new BigDecimal(169.5), 5, 1));
        final CarPart carPart220 = this.carPartRepository.save(new CarPart(null, "Cylinder head", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(118), new BigDecimal(59), 0, 0));
        final CarPart carPart221 = this.carPartRepository.save(new CarPart(null, "Cylinder head cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(275), new BigDecimal(137.5), 1, 0));
        final CarPart carPart222 = this.carPartRepository.save(new CarPart(null, "Other cylinder head cover parts", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(255), new BigDecimal(127.5), 1, 0));
        final CarPart carPart223 = this.carPartRepository.save(new CarPart(null, "Cylinder head gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(158), new BigDecimal(79), 3, 1));
        final CarPart carPart224 = this.carPartRepository.save(new CarPart(null, "Distributor", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(372), new BigDecimal(186), 2, 0));
        final CarPart carPart225 = this.carPartRepository.save(new CarPart(null, "Distributor cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(339), new BigDecimal(169.5), 0, 0));
        final CarPart carPart226 = this.carPartRepository.save(new CarPart(null, "Drive belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(350), new BigDecimal(175), 1, 0));
        final CarPart carPart227 = this.carPartRepository.save(new CarPart(null, "Engine block", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(272), new BigDecimal(136), 3, 1));
        final CarPart carPart228 = this.carPartRepository.save(new CarPart(null, "Engine cradle", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(53), new BigDecimal(26.5), 5, 1));
        final CarPart carPart229 = this.carPartRepository.save(new CarPart(null, "Engine shake damper and vibration absorber", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(74), new BigDecimal(37), 5, 1));
        final CarPart carPart230 = this.carPartRepository.save(new CarPart(null, "Engine valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(292), new BigDecimal(146), 1, 0));
        final CarPart carPart231 = this.carPartRepository.save(new CarPart(null, "Fan belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(184), new BigDecimal(92), 3, 1));
        final CarPart carPart232 = this.carPartRepository.save(new CarPart(null, "Gudgeon pin (wrist pin)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(328), new BigDecimal(164), 3, 1));
        final CarPart carPart233 = this.carPartRepository.save(new CarPart(null, "Harmonic balancer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(150), new BigDecimal(75), 0, 0));
        final CarPart carPart234 = this.carPartRepository.save(new CarPart(null, "Heater", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(378), new BigDecimal(189), 3, 1));
        final CarPart carPart235 = this.carPartRepository.save(new CarPart(null, "Mounting", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(99), new BigDecimal(49.5), 4, 1));
        final CarPart carPart236 = this.carPartRepository.save(new CarPart(null, "Piston", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(336), new BigDecimal(168), 3, 1));
        final CarPart carPart237 = this.carPartRepository.save(new CarPart(null, "Piston pin and crank pin", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(340), new BigDecimal(170), 3, 1));
        final CarPart carPart238 = this.carPartRepository.save(new CarPart(null, "Piston pin bush", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(71), new BigDecimal(35.5), 3, 1));
        final CarPart carPart239 = this.carPartRepository.save(new CarPart(null, "Piston ring and circlip", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(353), new BigDecimal(176.5), 3, 1));
        final CarPart carPart240 = this.carPartRepository.save(new CarPart(null, "Poppet valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(297), new BigDecimal(148.5), 2, 0));
        final CarPart carPart241 = this.carPartRepository.save(new CarPart(null, "Positive crankcase ventilation valve (PCV valve)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(297), new BigDecimal(148.5), 2, 0));
        final CarPart carPart242 = this.carPartRepository.save(new CarPart(null, "Pulley part", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(391), new BigDecimal(195.5), 2, 0));
        final CarPart carPart243 = this.carPartRepository.save(new CarPart(null, "Rocker arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(100), new BigDecimal(50), 4, 1));
        final CarPart carPart244 = this.carPartRepository.save(new CarPart(null, "Rocker cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(38), new BigDecimal(19), 0, 0));
        final CarPart carPart245 = this.carPartRepository.save(new CarPart(null, "Starter motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(193), new BigDecimal(96.5), 1, 0));
        final CarPart carPart246 = this.carPartRepository.save(new CarPart(null, "Starter pinion", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(244), new BigDecimal(122), 0, 0));
        final CarPart carPart247 = this.carPartRepository.save(new CarPart(null, "Starter ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(176), new BigDecimal(88), 0, 0));
        final CarPart carPart248 = this.carPartRepository.save(new CarPart(null, "Turbocharger and supercharger", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(387), new BigDecimal(193.5), 1, 0));
        final CarPart carPart249 = this.carPartRepository.save(new CarPart(null, "Tappet", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(372), new BigDecimal(186), 0, 0));
        final CarPart carPart250 = this.carPartRepository.save(new CarPart(null, "Timing tape", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(271), new BigDecimal(135.5), 0, 0));
        final CarPart carPart251 = this.carPartRepository.save(new CarPart(null, "Valve cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(31), new BigDecimal(15.5), 3, 1));
        final CarPart carPart252 = this.carPartRepository.save(new CarPart(null, "Valve housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(400), new BigDecimal(200), 3, 1));
        final CarPart carPart253 = this.carPartRepository.save(new CarPart(null, "Valve spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(211), new BigDecimal(105.5), 2, 0));
        final CarPart carPart254 = this.carPartRepository.save(new CarPart(null, "Valve stem seal", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(377), new BigDecimal(188.5), 1, 0));
        final CarPart carPart255 = this.carPartRepository.save(new CarPart(null, "Water pump pulley", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(384), new BigDecimal(192), 4, 1));
        final CarPart carPart256 = this.carPartRepository.save(new CarPart(null, "Air blower", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(21), new BigDecimal(10.5), 10, 2));
        final CarPart carPart257 = this.carPartRepository.save(new CarPart(null, "Coolant hose (clamp)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        final CarPart carPart258 = this.carPartRepository.save(new CarPart(null, "Cooling fan", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(27), new BigDecimal(13.5), 10, 2));
        final CarPart carPart259 = this.carPartRepository.save(new CarPart(null, "Fan blade", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(11), new BigDecimal(5.5), 10, 2));
        final CarPart carPart260 = this.carPartRepository.save(new CarPart(null, "Fan belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        final CarPart carPart261 = this.carPartRepository.save(new CarPart(null, "Fan clutch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        final CarPart carPart262 = this.carPartRepository.save(new CarPart(null, "Radiator", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart263 = this.carPartRepository.save(new CarPart(null, "Radiator bolt", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 11, 2));
        final CarPart carPart264 = this.carPartRepository.save(new CarPart(null, "Radiator (fan) shroud", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 12, 2));
        final CarPart carPart265 = this.carPartRepository.save(new CarPart(null, "Radiator gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 13, 3));
        final CarPart carPart266 = this.carPartRepository.save(new CarPart(null, "Radiator pressure cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 14, 3));
        final CarPart carPart267 = this.carPartRepository.save(new CarPart(null, "Overflow tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 15, 3));
        final CarPart carPart268 = this.carPartRepository.save(new CarPart(null, "Thermostat", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 16, 3));
        final CarPart carPart269 = this.carPartRepository.save(new CarPart(null, "Water neck", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 17, 3));
        final CarPart carPart270 = this.carPartRepository.save(new CarPart(null, "Water neck o-ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 18, 4));
        final CarPart carPart271 = this.carPartRepository.save(new CarPart(null, "Water pipe", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 19, 4));
        final CarPart carPart272 = this.carPartRepository.save(new CarPart(null, "Water pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(30), new BigDecimal(15), 20, 4));
        final CarPart carPart273 = this.carPartRepository.save(new CarPart(null, "Water pump gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 21, 4));
        final CarPart carPart274 = this.carPartRepository.save(new CarPart(null, "Water tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(30), new BigDecimal(15), 22, 4));
        final CarPart carPart275 = this.carPartRepository.save(new CarPart(null, "Oil filter", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(21), new BigDecimal(10.5), 10, 2));
        final CarPart carPart276 = this.carPartRepository.save(new CarPart(null, "Oil gasket", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        final CarPart carPart277 = this.carPartRepository.save(new CarPart(null, "Oil pan", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(27), new BigDecimal(13.5), 10, 2));
        final CarPart carPart278 = this.carPartRepository.save(new CarPart(null, "Oil pipe", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(11), new BigDecimal(5.5), 10, 2));
        final CarPart carPart279 = this.carPartRepository.save(new CarPart(null, "Oil pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        final CarPart carPart280 = this.carPartRepository.save(new CarPart(null, "Oil strainer", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        final CarPart carPart281 = this.carPartRepository.save(new CarPart(null, "Oil suction filter", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(18), new BigDecimal(9), 10, 2));
        final CarPart carPart282 = this.carPartRepository.save(new CarPart(null, "Catalytic converter", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(215), new BigDecimal(107.5), 2, 0));
        final CarPart carPart283 = this.carPartRepository.save(new CarPart(null, "Exhaust clamp and bracket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(157), new BigDecimal(78.5), 5, 1));
        final CarPart carPart284 = this.carPartRepository.save(new CarPart(null, "Exhaust flange gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(275), new BigDecimal(137.5), 2, 0));
        final CarPart carPart285 = this.carPartRepository.save(new CarPart(null, "Exhaust gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(112), new BigDecimal(56), 5, 1));
        final CarPart carPart286 = this.carPartRepository.save(new CarPart(null, "Exhaust manifold", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(258), new BigDecimal(129), 1, 0));
        final CarPart carPart287 = this.carPartRepository.save(new CarPart(null, "Exhaust manifold gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(159), new BigDecimal(79.5), 5, 1));
        final CarPart carPart288 = this.carPartRepository.save(new CarPart(null, "Exhaust pipe", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(201), new BigDecimal(100.5), 2, 0));
        final CarPart carPart289 = this.carPartRepository.save(new CarPart(null, "Heat shield", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(62), new BigDecimal(31), 1, 0));
        final CarPart carPart290 = this.carPartRepository.save(new CarPart(null, "Heat sleeving and tape", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(202), new BigDecimal(101), 13, 3));
        final CarPart carPart291 = this.carPartRepository.save(new CarPart(null, "Resonator", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(180), new BigDecimal(90), 10, 2));
        final CarPart carPart292 = this.carPartRepository.save(new CarPart(null, "Muffler (Silencer)", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(113), new BigDecimal(56.5), 7, 1));
        final CarPart carPart293 = this.carPartRepository.save(new CarPart(null, "Spacer ring", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(104), new BigDecimal(52), 6, 1));
        final CarPart carPart294 = this.carPartRepository.save(new CarPart(null, "Air filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(215), new BigDecimal(107.5), 2, 0));
        final CarPart carPart295 = this.carPartRepository.save(new CarPart(null, "Carburetor", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(157), new BigDecimal(78.5), 5, 1));
        final CarPart carPart296 = this.carPartRepository.save(new CarPart(null, "Carburetor parts", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(275), new BigDecimal(137.5), 2, 0));
        final CarPart carPart297 = this.carPartRepository.save(new CarPart(null, "Choke cable", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(112), new BigDecimal(56), 5, 1));
        final CarPart carPart298 = this.carPartRepository.save(new CarPart(null, "Exhaust gas recirculation valve (EGR valve)", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(258), new BigDecimal(129), 1, 0));
        final CarPart carPart299 = this.carPartRepository.save(new CarPart(null, "Fuel cap or fuel filler cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(159), new BigDecimal(79.5), 5, 1));
        final CarPart carPart300 = this.carPartRepository.save(new CarPart(null, "Fuel cell", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(201), new BigDecimal(100.5), 2, 0));
        final CarPart carPart301 = this.carPartRepository.save(new CarPart(null, "Fuel cell component", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(62), new BigDecimal(31), 1, 0));
        final CarPart carPart302 = this.carPartRepository.save(new CarPart(null, "Fuel cooler", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(202), new BigDecimal(101), 0, 0));
        final CarPart carPart303 = this.carPartRepository.save(new CarPart(null, "Fuel distributor", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(180), new BigDecimal(90), 10, 2));
        final CarPart carPart304 = this.carPartRepository.save(new CarPart(null, "Fuel filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(113), new BigDecimal(56.5), 7, 1));
        final CarPart carPart305 = this.carPartRepository.save(new CarPart(null, "Fuel filter seal", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(104), new BigDecimal(52), 6, 1));
        final CarPart carPart306 = this.carPartRepository.save(new CarPart(null, "Fuel injector", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(110), new BigDecimal(55), 7, 1));
        final CarPart carPart307 = this.carPartRepository.save(new CarPart(null, "Fuel injector nozzle", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(255), new BigDecimal(127.5), 6, 1));
        final CarPart carPart308 = this.carPartRepository.save(new CarPart(null, "Fuel line", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(47), new BigDecimal(23.5), 5, 1));
        final CarPart carPart309 = this.carPartRepository.save(new CarPart(null, "Fuel pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(232), new BigDecimal(116), 10, 2));
        final CarPart carPart310 = this.carPartRepository.save(new CarPart(null, "Fuel pump gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(223), new BigDecimal(111.5), 9, 2));
        final CarPart carPart311 = this.carPartRepository.save(new CarPart(null, "Fuel pressure regulator", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(76), new BigDecimal(38), 4, 1));
        final CarPart carPart312 = this.carPartRepository.save(new CarPart(null, "Fuel rail", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(220), new BigDecimal(110), 2, 0));
        final CarPart carPart313 = this.carPartRepository.save(new CarPart(null, "Fuel tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(35), new BigDecimal(17.5), 1, 0));
        final CarPart carPart314 = this.carPartRepository.save(new CarPart(null, "Fuel tank cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(289), new BigDecimal(144.5), 5, 1));
        final CarPart carPart315 = this.carPartRepository.save(new CarPart(null, "Fuel water separator", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(124), new BigDecimal(62), 3, 1));
        final CarPart carPart316 = this.carPartRepository.save(new CarPart(null, "Intake manifold", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(262), new BigDecimal(131), 9, 2));
        final CarPart carPart317 = this.carPartRepository.save(new CarPart(null, "Intake manifold gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(240), new BigDecimal(120), 9, 2));
        final CarPart carPart318 = this.carPartRepository.save(new CarPart(null, "LPG (Liquefied petroleum gas) system assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(269), new BigDecimal(134.5), 1, 0));
        final CarPart carPart319 = this.carPartRepository.save(new CarPart(null, "Throttle body", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(210), new BigDecimal(105), 4, 1));
        final CarPart carPart320 = this.carPartRepository.save(new CarPart(null, "Axle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(48), new BigDecimal(24), 0, 0));
        final CarPart carPart321 = this.carPartRepository.save(new CarPart(null, "Camber arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(249), new BigDecimal(124.5), 5, 1));
        final CarPart carPart322 = this.carPartRepository.save(new CarPart(null, "Control arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(227), new BigDecimal(113.5), 15, 3));
        final CarPart carPart323 = this.carPartRepository.save(new CarPart(null, "Beam axle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(291), new BigDecimal(145.5), 20, 4));
        final CarPart carPart324 = this.carPartRepository.save(new CarPart(null, "Idler arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(216), new BigDecimal(108), 5, 1));
        final CarPart carPart325 = this.carPartRepository.save(new CarPart(null, "Kingpin", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(197), new BigDecimal(98.5), 5, 1));
        final CarPart carPart326 = this.carPartRepository.save(new CarPart(null, "Lateral link", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(306), new BigDecimal(153), 13, 3));
        final CarPart carPart327 = this.carPartRepository.save(new CarPart(null, "Pan-hard rod", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(92), new BigDecimal(46), 14, 3));
        final CarPart carPart328 = this.carPartRepository.save(new CarPart(null, "Pit-man arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(120), new BigDecimal(60), 8, 2));
        final CarPart carPart329 = this.carPartRepository.save(new CarPart(null, "Power steering assembly and component", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(154), new BigDecimal(77), 13, 3));
        final CarPart carPart330 = this.carPartRepository.save(new CarPart(null, "Rack end", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(221), new BigDecimal(110.5), 12, 2));
        final CarPart carPart331 = this.carPartRepository.save(new CarPart(null, "Shock absorber", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(297), new BigDecimal(148.5), 14, 3));
        final CarPart carPart332 = this.carPartRepository.save(new CarPart(null, "Spindle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(227), new BigDecimal(113.5), 4, 1));
        final CarPart carPart333 = this.carPartRepository.save(new CarPart(null, "Spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(120), new BigDecimal(60), 7, 1));
        final CarPart carPart334 = this.carPartRepository.save(new CarPart(null, "Air spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(220), new BigDecimal(110), 14, 3));
        final CarPart carPart335 = this.carPartRepository.save(new CarPart(null, "Coil spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(298), new BigDecimal(149), 4, 1));
        final CarPart carPart336 = this.carPartRepository.save(new CarPart(null, "Leaf and parabolic leaf spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(288), new BigDecimal(144), 10, 2));
        final CarPart carPart337 = this.carPartRepository.save(new CarPart(null, "Ball joint", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(72), new BigDecimal(36), 8, 2));
        final CarPart carPart338 = this.carPartRepository.save(new CarPart(null, "Rubber spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(317), new BigDecimal(158.5), 6, 1));
        final CarPart carPart339 = this.carPartRepository.save(new CarPart(null, "Spiral spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(142), new BigDecimal(71), 12, 2));
        final CarPart carPart340 = this.carPartRepository.save(new CarPart(null, "Stabilizer bars and link", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(322), new BigDecimal(161), 18, 4));
        final CarPart carPart341 = this.carPartRepository.save(new CarPart(null, "Steering arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(121), new BigDecimal(60.5), 16, 3));
        final CarPart carPart342 = this.carPartRepository.save(new CarPart(null, "Steering box", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(325), new BigDecimal(162.5), 20, 4));
        final CarPart carPart343 = this.carPartRepository.save(new CarPart(null, "Steering pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(119), new BigDecimal(59.5), 0, 0));
        final CarPart carPart344 = this.carPartRepository.save(new CarPart(null, "Steering column assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(290), new BigDecimal(145), 3, 1));
        final CarPart carPart345 = this.carPartRepository.save(new CarPart(null, "Steering rack", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(71), new BigDecimal(35.5), 3, 1));
        final CarPart carPart346 = this.carPartRepository.save(new CarPart(null, "Steering shaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(222), new BigDecimal(111), 13, 3));
        final CarPart carPart347 = this.carPartRepository.save(new CarPart(null, "Steering wheel (driving wheel)", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(76), new BigDecimal(38), 8, 2));
        final CarPart carPart348 = this.carPartRepository.save(new CarPart(null, "Strut", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(199), new BigDecimal(99.5), 13, 3));
        final CarPart carPart349 = this.carPartRepository.save(new CarPart(null, "Stub axle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(215), new BigDecimal(107.5), 17, 3));
        final CarPart carPart350 = this.carPartRepository.save(new CarPart(null, "Suspension link and bolt", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(72), new BigDecimal(36), 7, 1));
        final CarPart carPart351 = this.carPartRepository.save(new CarPart(null, "Trailing arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(55), new BigDecimal(27.5), 2, 0));
        final CarPart carPart352 = this.carPartRepository.save(new CarPart(null, "Universal joint", CarPartType.UNIVERSAL, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(165), new BigDecimal(82.5), 15, 3));
        final CarPart carPart353 = this.carPartRepository.save(new CarPart(null, "Bell housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(167), new BigDecimal(83.5), 19, 4));
        final CarPart carPart354 = this.carPartRepository.save(new CarPart(null, "Carrier assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(155), new BigDecimal(77.5), 8, 2));
        final CarPart carPart355 = this.carPartRepository.save(new CarPart(null, "Chain wheel and sprocket", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(28), new BigDecimal(14), 15, 3));
        final CarPart carPart356 = this.carPartRepository.save(new CarPart(null, "Clutch assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(71), new BigDecimal(35.5), 14, 3));
        final CarPart carPart357 = this.carPartRepository.save(new CarPart(null, "Clutch cable", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(8), new BigDecimal(4), 20, 4));
        final CarPart carPart358 = this.carPartRepository.save(new CarPart(null, "Clutch disk", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(178), new BigDecimal(89), 20, 4));
        final CarPart carPart359 = this.carPartRepository.save(new CarPart(null, "Clutch fan", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(161), new BigDecimal(80.5), 8, 2));
        final CarPart carPart360 = this.carPartRepository.save(new CarPart(null, "Clutch fork", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(134), new BigDecimal(67), 16, 3));
        final CarPart carPart361 = this.carPartRepository.save(new CarPart(null, "Clutch hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(160), new BigDecimal(80), 18, 4));
        final CarPart carPart362 = this.carPartRepository.save(new CarPart(null, "Clutch lever", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(83), new BigDecimal(41.5), 1, 0));
        final CarPart carPart363 = this.carPartRepository.save(new CarPart(null, "Clutch lining", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(148), new BigDecimal(74), 11, 2));
        final CarPart carPart364 = this.carPartRepository.save(new CarPart(null, "Differential", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(16), new BigDecimal(8), 8, 2));
        final CarPart carPart365 = this.carPartRepository.save(new CarPart(null, "Flywheel", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(77), new BigDecimal(38.5), 6, 1));
        final CarPart carPart366 = this.carPartRepository.save(new CarPart(null, "Gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(191), new BigDecimal(95.5), 2, 0));
        final CarPart carPart367 = this.carPartRepository.save(new CarPart(null, "Gear coupling", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(44), new BigDecimal(22), 17, 3));
        final CarPart carPart368 = this.carPartRepository.save(new CarPart(null, "Gear pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(118), new BigDecimal(59), 19, 4));
        final CarPart carPart369 = this.carPartRepository.save(new CarPart(null, "Gear ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(55), new BigDecimal(27.5), 0, 0));
        final CarPart carPart370 = this.carPartRepository.save(new CarPart(null, "Gear stick ", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(171), new BigDecimal(85.5), 9, 2));
        final CarPart carPart371 = this.carPartRepository.save(new CarPart(null, "Gearbox", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(89), new BigDecimal(44.5), 19, 4));
        final CarPart carPart372 = this.carPartRepository.save(new CarPart(null, "Idler gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(167), new BigDecimal(83.5), 4, 1));
        final CarPart carPart373 = this.carPartRepository.save(new CarPart(null, "Knuckle", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        final CarPart carPart374 = this.carPartRepository.save(new CarPart(null, "Master cylinder", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(125), new BigDecimal(62.5), 3, 1));
        final CarPart carPart375 = this.carPartRepository.save(new CarPart(null, "Output shaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(40), new BigDecimal(20), 19, 4));
        final CarPart carPart376 = this.carPartRepository.save(new CarPart(null, "Planetary gear set", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(85), new BigDecimal(42.5), 16, 3));
        final CarPart carPart377 = this.carPartRepository.save(new CarPart(null, "Drive shaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(136), new BigDecimal(68), 17, 3));
        final CarPart carPart378 = this.carPartRepository.save(new CarPart(null, "Shift cable", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(119), new BigDecimal(59.5), 8, 2));
        final CarPart carPart379 = this.carPartRepository.save(new CarPart(null, "Shift fork", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(84), new BigDecimal(42), 4, 1));
        final CarPart carPart380 = this.carPartRepository.save(new CarPart(null, "Shift knob", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(189), new BigDecimal(94.5), 19, 4));
        final CarPart carPart381 = this.carPartRepository.save(new CarPart(null, "Shift lever", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(139), new BigDecimal(69.5), 10, 2));
        final CarPart carPart382 = this.carPartRepository.save(new CarPart(null, "Slave cylinder", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(135), new BigDecimal(67.5), 3, 1));
        final CarPart carPart383 = this.carPartRepository.save(new CarPart(null, "Speed reducer", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(13), new BigDecimal(6.5), 5, 1));
        final CarPart carPart384 = this.carPartRepository.save(new CarPart(null, "Speedometer gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(29), new BigDecimal(14.5), 15, 3));
        final CarPart carPart385 = this.carPartRepository.save(new CarPart(null, "Steering gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(86), new BigDecimal(43), 4, 1));
        final CarPart carPart386 = this.carPartRepository.save(new CarPart(null, "Torque converter", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(123), new BigDecimal(61.5), 17, 3));
        final CarPart carPart387 = this.carPartRepository.save(new CarPart(null, "Trans-axle housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(132), new BigDecimal(66), 11, 2));
        final CarPart carPart388 = this.carPartRepository.save(new CarPart(null, "Transfer case", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(126), new BigDecimal(63), 14, 3));
        final CarPart carPart389 = this.carPartRepository.save(new CarPart(null, "Transmission gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(69), new BigDecimal(34.5), 3, 1));
        final CarPart carPart390 = this.carPartRepository.save(new CarPart(null, "Transmission pan", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(39), new BigDecimal(19.5), 9, 2));
        final CarPart carPart391 = this.carPartRepository.save(new CarPart(null, "Transmission spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(164), new BigDecimal(82), 14, 3));
        final CarPart carPart392 = this.carPartRepository.save(new CarPart(null, "AC Refrigerant", CarPartType.UNIVERSAL, CarPartGroup.AIR_CONDITIONING, new BigDecimal(20), new BigDecimal(10), 30, 6));
        final CarPart carPart393 = this.carPartRepository.save(new CarPart(null, "AC Clutch", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(60), new BigDecimal(30), 6, 1));
        final CarPart carPart394 = this.carPartRepository.save(new CarPart(null, "AC Compressor", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(50), new BigDecimal(25), 6, 1));
        final CarPart carPart395 = this.carPartRepository.save(new CarPart(null, "AC Condenser", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(20), new BigDecimal(10), 6, 1));
        final CarPart carPart396 = this.carPartRepository.save(new CarPart(null, "AC Hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart397 = this.carPartRepository.save(new CarPart(null, "AC Kit", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(70), new BigDecimal(35), 10, 2));
        final CarPart carPart398 = this.carPartRepository.save(new CarPart(null, "AC Relay", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(5), new BigDecimal(2.5), 20, 4));
        final CarPart carPart399 = this.carPartRepository.save(new CarPart(null, "AC Valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(16), new BigDecimal(8), 20, 4));
        final CarPart carPart400 = this.carPartRepository.save(new CarPart(null, "AC Evaporator", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(30), new BigDecimal(15), 5, 1));
        final CarPart carPart401 = this.carPartRepository.save(new CarPart(null, "AC Pipe", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart402 = this.carPartRepository.save(new CarPart(null, "AC Gas Receiver", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(40), new BigDecimal(20), 5, 1));
        final CarPart carPart403 = this.carPartRepository.save(new CarPart(null, "AC Condenser filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(10), new BigDecimal(5), 30, 6));
        final CarPart carPart404 = this.carPartRepository.save(new CarPart(null, "AC Cabin filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(10), new BigDecimal(5), 30, 6));
        final CarPart carPart405 = this.carPartRepository.save(new CarPart(null, "Grooved ball bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart406 = this.carPartRepository.save(new CarPart(null, "Needle bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart407 = this.carPartRepository.save(new CarPart(null, "Roller bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart408 = this.carPartRepository.save(new CarPart(null, "Sleeve bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart409 = this.carPartRepository.save(new CarPart(null, "Wheel bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart410 = this.carPartRepository.save(new CarPart(null, "Fuel vapour hose", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart411 = this.carPartRepository.save(new CarPart(null, "Reinforced hose (high-pressure hose)", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart412 = this.carPartRepository.save(new CarPart(null, "Non-reinforced hose", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart413 = this.carPartRepository.save(new CarPart(null, "Radiator hose", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart414 = this.carPartRepository.save(new CarPart(null, "Adhesive tape", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart415 = this.carPartRepository.save(new CarPart(null, "Foil", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        final CarPart carPart416 = this.carPartRepository.save(new CarPart(null, "Air bag", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(30), new BigDecimal(15), 5, 1));
        final CarPart carPart417 = this.carPartRepository.save(new CarPart(null, "Cables", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 100, 20));
        final CarPart carPart418 = this.carPartRepository.save(new CarPart(null, "Fastener", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 20, 4));
        final CarPart carPart419 = this.carPartRepository.save(new CarPart(null, "Gasket", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 20, 4));
        final CarPart carPart420 = this.carPartRepository.save(new CarPart(null, "Horn", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(20), new BigDecimal(10), 3, 1));
        final CarPart carPart421 = this.carPartRepository.save(new CarPart(null, "Mirror", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(10), new BigDecimal(5), 10, 2));
        final CarPart carPart422 = this.carPartRepository.save(new CarPart(null, "Paint", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(50), new BigDecimal(25), 20, 4));
        final CarPart carPart423 = this.carPartRepository.save(new CarPart(null, "Rubber", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 5, 1));
        final CarPart carPart424 = this.carPartRepository.save(new CarPart(null, "Washer", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 5, 1));
        final CarPart carPart425 = this.carPartRepository.save(new CarPart(null, "Air Filter Change", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(118), new BigDecimal(0), 1000000, 0));
        final CarPart carPart426 = this.carPartRepository.save(new CarPart(null, "Clutch Assembly Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(281), new BigDecimal(0), 1000000, 0));
        final CarPart carPart427 = this.carPartRepository.save(new CarPart(null, "Drive Belt Tensioner Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(25), new BigDecimal(0), 1000000, 0));
        final CarPart carPart428 = this.carPartRepository.save(new CarPart(null, "Drive Belt(s) Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(154), new BigDecimal(0), 1000000, 0));
        final CarPart carPart429 = this.carPartRepository.save(new CarPart(null, "Engine Oil Pan Reseal", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(242), new BigDecimal(0), 1000000, 0));
        final CarPart carPart430 = this.carPartRepository.save(new CarPart(null, "Fuel Filter Change", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(286), new BigDecimal(0), 1000000, 0));
        final CarPart carPart431 = this.carPartRepository.save(new CarPart(null, "Fuel Injector Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(152), new BigDecimal(0), 1000000, 0));
        final CarPart carPart432 = this.carPartRepository.save(new CarPart(null, "Head Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(120), new BigDecimal(0), 1000000, 0));
        final CarPart carPart433 = this.carPartRepository.save(new CarPart(null, "Intake Manifold Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(195), new BigDecimal(0), 1000000, 0));
        final CarPart carPart434 = this.carPartRepository.save(new CarPart(null, "Mass Airflow (Air Flow) Sensor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(26), new BigDecimal(0), 1000000, 0));
        final CarPart carPart435 = this.carPartRepository.save(new CarPart(null, "Oil & Filter Change (Engine)", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(150), new BigDecimal(0), 1000000, 0));
        final CarPart carPart436 = this.carPartRepository.save(new CarPart(null, "Spark Plug Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(99), new BigDecimal(0), 1000000, 0));
        final CarPart carPart437 = this.carPartRepository.save(new CarPart(null, "Throttle Body Assembly Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(79), new BigDecimal(0), 1000000, 0));
        final CarPart carPart438 = this.carPartRepository.save(new CarPart(null, "Valve Cover Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(184), new BigDecimal(0), 1000000, 0));
        final CarPart carPart439 = this.carPartRepository.save(new CarPart(null, "Water Pump Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(147), new BigDecimal(0), 1000000, 0));
        final CarPart carPart440 = this.carPartRepository.save(new CarPart(null, "Brake Hose Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(273), new BigDecimal(0), 1000000, 0));
        final CarPart carPart441 = this.carPartRepository.save(new CarPart(null, "Brake Master Cylinder Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(158), new BigDecimal(0), 1000000, 0));
        final CarPart carPart442 = this.carPartRepository.save(new CarPart(null, "Brake Pads Replacement - Front", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(40), new BigDecimal(0), 1000000, 0));
        final CarPart carPart443 = this.carPartRepository.save(new CarPart(null, "Brake Pads Replacement - Rear", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(216), new BigDecimal(0), 1000000, 0));
        final CarPart carPart444 = this.carPartRepository.save(new CarPart(null, "Coolant Thermostat Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(136), new BigDecimal(0), 1000000, 0));
        final CarPart carPart445 = this.carPartRepository.save(new CarPart(null, "Radiator Hose Replacement - Lower", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(37), new BigDecimal(0), 1000000, 0));
        final CarPart carPart446 = this.carPartRepository.save(new CarPart(null, "Radiator Hose Replacement - Upper", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(182), new BigDecimal(0), 1000000, 0));
        final CarPart carPart447 = this.carPartRepository.save(new CarPart(null, "Radiator Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(83), new BigDecimal(0), 1000000, 0));
        final CarPart carPart448 = this.carPartRepository.save(new CarPart(null, "Catalytic Converter Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(222), new BigDecimal(0), 1000000, 0));
        final CarPart carPart449 = this.carPartRepository.save(new CarPart(null, "Exhaust Manifold Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(250), new BigDecimal(0), 1000000, 0));
        final CarPart carPart450 = this.carPartRepository.save(new CarPart(null, "Exhaust System Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(294), new BigDecimal(0), 1000000, 0));
        final CarPart carPart451 = this.carPartRepository.save(new CarPart(null, "Alternator Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(242), new BigDecimal(0), 1000000, 0));
        final CarPart carPart452 = this.carPartRepository.save(new CarPart(null, "Battery Cable Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(190), new BigDecimal(0), 1000000, 0));
        final CarPart carPart453 = this.carPartRepository.save(new CarPart(null, "Brake Light Switch Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(168), new BigDecimal(0), 1000000, 0));
        final CarPart carPart454 = this.carPartRepository.save(new CarPart(null, "ECU Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(71), new BigDecimal(0), 1000000, 0));
        final CarPart carPart455 = this.carPartRepository.save(new CarPart(null, "Fuel Pump Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(68), new BigDecimal(0), 1000000, 0));
        final CarPart carPart456 = this.carPartRepository.save(new CarPart(null, "Headlamp Bulb Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(126), new BigDecimal(0), 1000000, 0));
        final CarPart carPart457 = this.carPartRepository.save(new CarPart(null, "Headlight Alignment Adjustment", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(147), new BigDecimal(0), 1000000, 0));
        final CarPart carPart458 = this.carPartRepository.save(new CarPart(null, "Ignition Switch Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(223), new BigDecimal(0), 1000000, 0));
        final CarPart carPart459 = this.carPartRepository.save(new CarPart(null, "Oxygen Sensor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(166), new BigDecimal(0), 1000000, 0));
        final CarPart carPart460 = this.carPartRepository.save(new CarPart(null, "Starter Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(161), new BigDecimal(0), 1000000, 0));
        final CarPart carPart461 = this.carPartRepository.save(new CarPart(null, "Vent / Fan Blower Motor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(243), new BigDecimal(0), 1000000, 0));
        final CarPart carPart462 = this.carPartRepository.save(new CarPart(null, "Window Motor Replacement / Window Regulator Replacement - Front", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(147), new BigDecimal(0), 1000000, 0));
        final CarPart carPart463 = this.carPartRepository.save(new CarPart(null, "Window Motor Replacement / Window Regulator Replacement - Rear", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(242), new BigDecimal(0), 1000000, 0));
        final CarPart carPart464 = this.carPartRepository.save(new CarPart(null, "Windshield Wiper Motor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(232), new BigDecimal(0), 1000000, 0));
        final CarPart carPart465 = this.carPartRepository.save(new CarPart(null, "Inner Tie Rod Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(29), new BigDecimal(0), 1000000, 0));
        final CarPart carPart466 = this.carPartRepository.save(new CarPart(null, "Outer Tie Rod Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(213), new BigDecimal(0), 1000000, 0));
        final CarPart carPart467 = this.carPartRepository.save(new CarPart(null, "Power Steering Pump Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(300), new BigDecimal(0), 1000000, 0));
        final CarPart carPart468 = this.carPartRepository.save(new CarPart(null, "Shock Absorber Replacement - Rear", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(217), new BigDecimal(0), 1000000, 0));
        final CarPart carPart469 = this.carPartRepository.save(new CarPart(null, "Strut Assembly Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(218), new BigDecimal(0), 1000000, 0));
        final CarPart carPart470 = this.carPartRepository.save(new CarPart(null, "AC Compressor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(295), new BigDecimal(0), 1000000, 0));
        final CarPart carPart471 = this.carPartRepository.save(new CarPart(null, "AC Line Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(173), new BigDecimal(0), 1000000, 0));
        final CarPart carPart472 = this.carPartRepository.save(new CarPart(null, "Cabin Air Filter Change", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(109), new BigDecimal(0), 1000000, 0));
        final CarPart carPart473 = this.carPartRepository.save(new CarPart(null, "Wheel Alignment Adjustment", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(287), new BigDecimal(0), 1000000, 0));
        final CarPart carPart474 = this.carPartRepository.save(new CarPart(null, "Tire pressure regulation", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(0), 1000000, 0));
        final CarPart carPart475 = this.carPartRepository.save(new CarPart(null, "Tire mounting", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(10), new BigDecimal(0), 1000000, 0));
        final CarPart carPart476 = this.carPartRepository.save(new CarPart(null, "Tire balancing", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(15), new BigDecimal(0), 1000000, 0));
        final CarPart carPart477 = this.carPartRepository.save(new CarPart(null, "AC Cleaning", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(25), new BigDecimal(0), 1000000, 0));
        final CarPart carPart478 = this.carPartRepository.save(new CarPart(null, "Small service fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(80), new BigDecimal(0), 1000000, 0));
        final CarPart carPart479 = this.carPartRepository.save(new CarPart(null, "Big service fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(150), new BigDecimal(0), 1000000, 0));
        final CarPart carPart480 = this.carPartRepository.save(new CarPart(null, "Painting job fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(700), new BigDecimal(0), 1000000, 0));
        final CarPart carPart481 = this.carPartRepository.save(new CarPart(null, "Electronics inspection fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(25), new BigDecimal(0), 1000000, 0));
        final CarPart carPart482 = this.carPartRepository.save(new CarPart(null, "OBD2 Diagnostics fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(20), new BigDecimal(0), 1000000, 0));
        final CarPart carPart483 = this.carPartRepository.save(new CarPart(null, "General Part replacement fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(20), new BigDecimal(0), 1000000, 0));
        final CarPart carPart484 = this.carPartRepository.save(new CarPart(null, "Working hour", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(7), new BigDecimal(0), 1000000, 0));

        // ============================================================================================================
        // Repair shop initialization
        // ============================================================================================================
        final Set<VehicleManufacturer> allVehicleManufacturers = new HashSet<>(this.vehicleManufacturerRepository.findAll());
        final Set<CarPart> allCarParts = new HashSet<>(this.carPartRepository.findAll());

        final RepairShop repairShop0 = this.repairShopRepository.save(new RepairShop(null, "admin", this.passwordEncoder.encode("admin"), RepairShopRole.HEADQUARTER, "DriveLab NS Headquarters", "Trg Dositeja Obradovica 6, 21000 Novi Sad, Serbia", allVehicleManufacturers, allCarParts));
        final RepairShop repairShop1 = this.repairShopRepository.save(new RepairShop(null, "drivelab1", this.passwordEncoder.encode("123"), RepairShopRole.REPAIR_SHOP, "DriveLab NS #1", "Bulevar Oslobodjenja 1, 21000 Novi Sad, Serbia", allVehicleManufacturers, allCarParts));
        final RepairShop repairShop2 = this.repairShopRepository.save(new RepairShop(null,"drivelab2", this.passwordEncoder.encode("123"), RepairShopRole.REPAIR_SHOP, "DriveLab NS #2", "Narodnog Fronta 28, 21000 Novi Sad, Serbia", allVehicleManufacturers, allCarParts));

        // ============================================================================================================
        // Problems initialization
        // ============================================================================================================
        final Problem problemA = this.problemRepository.save(new Problem(null, "Steering wheel does not return to normal position", "Usually occurs on low or normal speed while turning in.", new HashSet<>()));
        final Problem problemB = this.problemRepository.save(new Problem(null, "Front end vibrations", "Uncomfortable vibrations on the front suspension that can be felt on the steering wheel.", new HashSet<>()));
        final Problem problemC = this.problemRepository.save(new Problem(null, "Rattling noise", "This noise usually can be heard on the front end of the vehicle when turning in or driving on a bumpy road.", new HashSet<>()));
        final Problem problemD = this.problemRepository.save(new Problem(null, "Steering wheel hard to turn", "It takes more effort to turn the steering wheel than usually.", new HashSet<>()));
        final Problem problemE = this.problemRepository.save(new Problem(null, "Clunking sound when driving over bumps", "This sound usually can be heard when driving on a bumpy road.", new HashSet<>()));
        final Problem problemF = this.problemRepository.save(new Problem(null, "Loose springs", "Check if the springs are stable and properly adjusted.", new HashSet<>()));
        final Problem problemG = this.problemRepository.save(new Problem(null, "Outside edge tire wear", "Visible difference in tire wear on the outside edge of a tire.", new HashSet<>()));
        final Problem problemH = this.problemRepository.save(new Problem(null, "Loose caliper bolts", "Check if the caliper bolts are properly adjusted.", new HashSet<>()));
        final Problem problemI = this.problemRepository.save(new Problem(null, "Inside edge tire wear", "Visible difference in tire wear on the inside edge of a tire.", new HashSet<>()));
        final Problem problemJ = this.problemRepository.save(new Problem(null, "Vehicle uncomfortable", "Vehicle feels uncomfortable when driving on higher speeds.", new HashSet<>()));
        final Problem problemK = this.problemRepository.save(new Problem(null, "Power steering fluid level low", "Check if the power steering fluid level is inside its limits.", new HashSet<>()));
        final Problem problemL = this.problemRepository.save(new Problem(null, "Abnormal steering when exiting a turn", "This problem usually occurs when exiting a turn where wheels don't behave in sync with the steering wheel.", new HashSet<>()));
        final Problem problemM = this.problemRepository.save(new Problem(null, "Car pulls to one side", "This can be checked by driving in normal speed and releasing your hands from the steering wheel.", new HashSet<>()));
        final Problem problemN = this.problemRepository.save(new Problem(null, "Low brake fluid level", "Check if the brake fluid level is inside its limits.", new HashSet<>()));
        final Problem problemO = this.problemRepository.save(new Problem(null, "Brake warning light on", "Dashboard indicator for brake warning turned on recently.", new HashSet<>()));
        final Problem problemP = this.problemRepository.save(new Problem(null, "Brake discs unevenly worn out", "Indicates that there is significant difference in brake discs wear on different sides of the suspension.", new HashSet<>()));
        final Problem problemQ = this.problemRepository.save(new Problem(null, "Extended brake pedal travel", "This can be tested when the vehicle is idle.", new HashSet<>()));
        final Problem problemR = this.problemRepository.save(new Problem(null, "Engine power loss occurring randomly", "If the engine loses power when driving normally, or accellerating, without being able to identify a behaviour pattern.", new HashSet<>()));
        final Problem problemS = this.problemRepository.save(new Problem(null, "Brakes make squealing noise when used", "If brakes make a squealing noise when braking harder.", new HashSet<>()));
        final Problem problemT = this.problemRepository.save(new Problem(null, "Vehicle shaking during normal driving", "Means that the vehicle is shaking when driving in low or normal speed.", new HashSet<>()));
        final Problem problemU = this.problemRepository.save(new Problem(null, "Engine backfiring", "If there is a strange noise synchronized with engine shaking when accellerating, then the engine is backfiring.", new HashSet<>()));
        final Problem problemV = this.problemRepository.save(new Problem(null, "Steering feels loose", "Means that the steering wheel does not transfer the steering to the wheels.", new HashSet<>()));
        final Problem problemW = this.problemRepository.save(new Problem(null, "Low engine oil level", "Check if the engine oil level is inside its limits.", new HashSet<>()));
        final Problem problemX = this.problemRepository.save(new Problem(null, "One wheel locking up", "Usually occurs when braking and turning in at the same time.", new HashSet<>()));
        final Problem problemY = this.problemRepository.save(new Problem(null, "Tires unevenly inflated", "Use a tyre pressure monitor and check all tires.", new HashSet<>()));
        final Problem problemZ = this.problemRepository.save(new Problem(null, "No consistency tire wear", "Visible difference in tire wear on random spots on a tire.", new HashSet<>()));

        final Problem problem1 = this.problemRepository.save(new Problem(null, "Repaired broken steering rack or fixed unbalanced tires in last 3 months", "", new HashSet<>()));
        final Problem problem2 = this.problemRepository.save(new Problem(null, "Low engine oil level occured more than 3 times in last 6 months", "", new HashSet<>()));
        final Problem problem3 = this.problemRepository.save(new Problem(null, "Vehicle has problem with bad cylinder head for more than 6 months", "", new HashSet<>()));
        final Problem problem4 = this.problemRepository.save(new Problem(null, "Vehicle has brake system leak", "You can be sure about this problem if the vehicle is constantly missing brake fluid over a short period of time.", new HashSet<>()));
        final Problem problem5 = this.problemRepository.save(new Problem(null, "Vehicle has aftermarket parts fitted", "Means that the vehicle has parts fitted, that may not be original and compatible with it.", new HashSet<>()));
        final Problem problem6 = this.problemRepository.save(new Problem(null, "Tire-wear related fault occured in the last 3 months", "", new HashSet<>()));
        final Problem problem7 = this.problemRepository.save(new Problem(null, "Performed repair in the last 4 months where universal parts were used", "", new HashSet<>()));

        // ============================================================================================================
        // Faults initialization
        // ============================================================================================================
        Fault brokenSteeringRack = new Fault(
                null,
                "Broken steering rack",
                "The entire steering rack unit will need to be replaced.",
                FaultGroup.SUSPENSION_AND_STEERING_SYSTEM,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> brokenSteeringRackProblems = new HashSet<>();
        brokenSteeringRackProblems.add(new ProblemAndFault(null, problemA, false, brokenSteeringRack));
        brokenSteeringRackProblems.add(new ProblemAndFault(null, problemB, false, brokenSteeringRack));
        brokenSteeringRackProblems.add(new ProblemAndFault(null, problemC, false, brokenSteeringRack));
        brokenSteeringRackProblems.add(new ProblemAndFault(null, problemD, false, brokenSteeringRack));
        brokenSteeringRackProblems.add(new ProblemAndFault(null, problemE, false, brokenSteeringRack));
        brokenSteeringRack.getProblems().addAll(brokenSteeringRackProblems);
        brokenSteeringRack = this.faultRepository.save(brokenSteeringRack);

        Fault unbalancedTires = new Fault(
                null,
                "Unbalanced tires",
                "There is a tire balancing issue. Have a mechanic balance the wheels in question and replace any overly worn tires.",
                FaultGroup.SUSPENSION_AND_STEERING_SYSTEM,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> unbalancedTiresProblems = new HashSet<>();
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemZ, false, unbalancedTires));
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemB, false, unbalancedTires));
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemE, false, unbalancedTires));
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemG, false, unbalancedTires));
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemA, false, unbalancedTires));
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemC, false, unbalancedTires));
        unbalancedTiresProblems.add(new ProblemAndFault(null, problemF, false, unbalancedTires));
        unbalancedTires.getProblems().addAll(unbalancedTiresProblems);
        unbalancedTires = this.faultRepository.save(unbalancedTires);

        Fault wornOutShocks = new Fault(
                null,
                "Worn out shocks",
                "Either your front or rear shocks or strut cartridges are worn/faulty. Have them inspected and replaced if needed.",
                FaultGroup.SUSPENSION_AND_STEERING_SYSTEM,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> wornOutShocksProblems = new HashSet<>();
        wornOutShocksProblems.add(new ProblemAndFault(null, problemB, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemH, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemC, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemI, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemF, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemJ, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemK, false, wornOutShocks));
        wornOutShocksProblems.add(new ProblemAndFault(null, problemL, false, wornOutShocks));
        wornOutShocks.getProblems().addAll(wornOutShocksProblems);
        wornOutShocks = this.faultRepository.save(wornOutShocks);

        Fault badWheelAlignment = new Fault(
                null,
                "Bad wheel alignment",
                "You'll need to have an alignment job done on your vehicle.",
                FaultGroup.SUSPENSION_AND_STEERING_SYSTEM,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> badWheelAlignmentProblems = new HashSet<>();
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemM, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemC, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemX, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemL, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemY, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemG, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problemA, false, badWheelAlignment));
        badWheelAlignmentProblems.add(new ProblemAndFault(null, problem1, false, badWheelAlignment));
        badWheelAlignment.getProblems().addAll(badWheelAlignmentProblems);
        badWheelAlignment = this.faultRepository.save(badWheelAlignment);

        Fault badCylinderHead = new Fault(
                null,
                "Bad cylinder head",
                "It seems like the engine cylinder head will need a repair or replacement.",
                FaultGroup.ENGINE,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> badCylinderHeadProblems = new HashSet<>();
        badCylinderHeadProblems.add(new ProblemAndFault(null, problemW, false, badCylinderHead));
        badCylinderHeadProblems.add(new ProblemAndFault(null, problem2, false, badCylinderHead));
        badCylinderHead.getProblems().addAll(badCylinderHeadProblems);
        badCylinderHead = this.faultRepository.save(badCylinderHead);

        Fault brakeSystemLeak = new Fault(
                null,
                "Brake system leak",
                "This is often caused by air bubbles forming in the brake lines. If the brakes were recently worked on, maybe the mechanic did not fully \"bleed\" the brake system. Or worse, there could be a leak somewhere in the system which is allowing air to enter.",
                FaultGroup.ENGINE,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> brakeSystemLeakProblems = new HashSet<>();
        brakeSystemLeakProblems.add(new ProblemAndFault(null, problemN, false, brakeSystemLeak));
        brakeSystemLeakProblems.add(new ProblemAndFault(null, problemO, false, brakeSystemLeak));
        brakeSystemLeakProblems.add(new ProblemAndFault(null, problemP, false, brakeSystemLeak));
        brakeSystemLeakProblems.add(new ProblemAndFault(null, problemQ, false, brakeSystemLeak));
        brakeSystemLeak.getProblems().addAll(brakeSystemLeakProblems);
        brakeSystemLeak = this.faultRepository.save(brakeSystemLeak);

        Fault problematicVehicleModel = new Fault(
                null,
                "Problematic vehicle model",
                "It seems that this vehicle has chronic and persistent issues. Please contact your dealership to seek for advice.",
                FaultGroup.OTHER,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> problematicVehicleModelProblems = new HashSet<>();
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problemP, false, problematicVehicleModel));
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problemR, false, problematicVehicleModel));
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problemS, false, problematicVehicleModel));
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problemT, false, problematicVehicleModel));
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problemU, false, problematicVehicleModel));
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problem3, true, problematicVehicleModel));
        problematicVehicleModelProblems.add(new ProblemAndFault(null, problem4, true, problematicVehicleModel));
        problematicVehicleModel.getProblems().addAll(problematicVehicleModelProblems);
        problematicVehicleModel = this.faultRepository.save(problematicVehicleModel);

        Fault faultySuspension = new Fault(
                null,
                "Faulty suspension",
                "Worn out steering and front suspension components are the issue. Have a mechanic inspect this vehicle and make any necessary repairs.",
                FaultGroup.OTHER,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> faultySuspensionProblems = new HashSet<>();
        faultySuspensionProblems.add(new ProblemAndFault(null, problemP, false, faultySuspension));
        faultySuspensionProblems.add(new ProblemAndFault(null, problemT, false, faultySuspension));
        faultySuspensionProblems.add(new ProblemAndFault(null, problemS, false, faultySuspension));
        faultySuspensionProblems.add(new ProblemAndFault(null, problemV, false, faultySuspension));
        faultySuspensionProblems.add(new ProblemAndFault(null, problem5, true, faultySuspension));
        faultySuspensionProblems.add(new ProblemAndFault(null, problem6, true, faultySuspension));
        faultySuspensionProblems.add(new ProblemAndFault(null, problem7, true, faultySuspension));
        faultySuspension.getProblems().addAll(faultySuspensionProblems);
        faultySuspension = this.faultRepository.save(faultySuspension);

        // ============================================================================================================
        // Customer and Vehicle initialization
        // ============================================================================================================

        Customer customer1 = new Customer(null, "John", "Smith", "+38163123123", "john@smith.com", new HashSet<>());
        Vehicle vehicle1 = new Vehicle(null, customer1, this.vehicleManufacturerRepository.findById(4L).get(), "A6", 2008, 143654, EngineType.DIESEL, "NS-001-JS", "A6NS001JS", new HashSet<>());
        Vehicle vehicle2 = new Vehicle(null, customer1, this.vehicleManufacturerRepository.findById(34L).get(), "CLK 200", 2014, 76345, EngineType.GASOLINE, "NS-002-JS", "CLKNS002JS", new HashSet<>());
        customer1.getOwnedVehicles().add(vehicle1);
        customer1.getOwnedVehicles().add(vehicle2);
        this.customerRepository.save(customer1);

        Customer customer2 = new Customer(null, "Alice", "McEnany", "+381644455123", "alice@mcenany.com", new HashSet<>());
        Vehicle vehicle3 = new Vehicle(null, customer2, this.vehicleManufacturerRepository.findById(42L).get(), "Clio", 2005, 250345, EngineType.GAS, "NS-001-AM", "CLIONS001AM", new HashSet<>());
        customer2.getOwnedVehicles().add(vehicle3);
        this.customerRepository.save(customer2);

        Customer customer3 = new Customer(null, "Mark", "Johnson", "+381601234567", "mark@johnson.com", new HashSet<>());
        Vehicle vehicle4 = new Vehicle(null, customer3, this.vehicleManufacturerRepository.findById(32L).get(), "6", 2009, 190563, EngineType.DIESEL, "NS-001-MJ", "6NS001MJ", new HashSet<>());
        customer3.getOwnedVehicles().add(vehicle4);
        this.customerRepository.save(customer3);

        // TODO: Finish customer and vehicle initialization

        // ============================================================================================================
        // Repair history initialization
        // ============================================================================================================
        // TODO: Add repair history for each vehicle

        final Set<Repair> vehicle1RepairHistory = new HashSet<>();
        // id, vehicle, fault, isEngineOilLevelLow, hasAftermarketPartsFitted, usedParts, totalPrice, performedAt, performedOn

        // TODO 1: A Repair Job Related To 'Broken steering rack' Fault Or 'Unbalanced tires' Fault In The Last 3 Months

        Repair vehicle1Repair = new Repair(
            null,
            vehicle1,
            brokenSteeringRack,
            new Boolean(false),
            new Boolean(false),
            new HashSet<>(),
            new BigDecimal(0),
            repairShop1,
            DateUtils.getDateInPast(111)
        );

        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart340, 1));
        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart341, 1));
        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart342, 1));
        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart343, 1));
        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart344, 1));
        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart345, 1));
        vehicle1Repair.getUsedParts().add(new UsedCarPart(null, vehicle1Repair, carPart346, 1));

        BigDecimal totalPrice = vehicle1Repair.getUsedParts().stream().reduce(new BigDecimal(0) , (partialSum, usedCarPart) ->
                partialSum.add(usedCarPart.getCarPart().getSalesPrice().multiply(new BigDecimal(usedCarPart.getCount()))), BigDecimal::add);

        vehicle1Repair.setTotalPrice(totalPrice);
        vehicle1RepairHistory.add(vehicle1Repair);

        Repair vehicle1Repair2 = new Repair(
                null,
                vehicle1,
                brokenSteeringRack,
                new Boolean(false),
                new Boolean(false),
                new HashSet<>(),
                new BigDecimal(0),
                repairShop1,
                DateUtils.getDateInPast(234)
        );

        vehicle1RepairHistory.add(vehicle1Repair2);


        // TODO 2: Low engine oil level occured more than 3 times in last 6 months

        // TODO 3: 'Bad cylinder head' Fault is present for more than 6 months
        vehicle1RepairHistory.add(new Repair(
                null,
                vehicle1,
                badCylinderHead,
                new Boolean(true),
                new Boolean(false),
                null, // TODO: Parts
                new BigDecimal(0), // TODO: Calculated price
                repairShop1,
                DateUtils.getDateInPast(252)
        ));


        // TODO 4: 'Brake system leak' Fault occured previously
        vehicle1RepairHistory.add(new Repair(
                null,
                vehicle1,
                brakeSystemLeak,
                new Boolean(false),
                new Boolean(false),
                null, // TODO: Parts
                new BigDecimal(0), // TODO: Calculated price
                repairShop1,
                DateUtils.getDateInPast(134)
        ));


        // TODO 5: aftermarket parts were fitted previously
        vehicle1RepairHistory.add(new Repair(
                null,
                vehicle1,
                brokenSteeringRack,
                new Boolean(false),
                new Boolean(true),
                null, // TODO: Parts
                new BigDecimal(0), // TODO: Calculated price
                repairShop1,
                DateUtils.getDateInPast(333)
        ));


        // TODO 6: Repaired fault that has problem 'Outside edge tire wear' or problem 'Inside edge tire wear' in last 3 months
        vehicle1RepairHistory.add(new Repair(
                null,
                vehicle1,
                unbalancedTires,
                new Boolean(false),
                new Boolean(false),
                null, // TODO: Parts
                new BigDecimal(0), // TODO: Calculated price
                repairShop2,
                DateUtils.getDateInPast(57)
        ));


        // TODO 7: universal parts were used in a previous repair in past 4 months
        vehicle1RepairHistory.add(new Repair(
                null,
                vehicle1,
                wornOutShocks,
                new Boolean(false),
                new Boolean(false),
                null, // TODO: Parts (universal)
                new BigDecimal(0), // TODO: Calculated price
                repairShop1,
                DateUtils.getDateInPast(111)
        ));

        Vehicle v1 = this.vehicleRepository.findByLicensePlate("NS-001-JS").get();
        v1.setRepairs(vehicle1RepairHistory);
        Vehicle v2 = this.vehicleRepository.save(v1);

        System.out.println("Initialized");
    }

}
