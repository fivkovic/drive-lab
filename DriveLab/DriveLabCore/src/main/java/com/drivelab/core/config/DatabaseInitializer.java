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
    private final CarPartRepository carPartRepository;
    private final RepairShopRepository repairShopRepository;

    private final ProblemRepository problemRepository;
    private final FaultRepository faultRepository;

    private final CustomerRepository customerRepository;
    private final VehicleRepository vehicleRepository;


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
        this.carPartRepository.save(new CarPart(null, "Hood", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(150), new BigDecimal(75), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Bumper", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(100), new BigDecimal(50), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Trunk door", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(150), new BigDecimal(75), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Mudguard", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(40), new BigDecimal(20), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Grill mask", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(40), new BigDecimal(20), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Pillar", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(200), new BigDecimal(100), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Quarter wing panel", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(80), new BigDecimal(40), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Roof rack", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(120), new BigDecimal(60), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Spoiler", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(150), new BigDecimal(75), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Rim", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(20), new BigDecimal(10), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Hubcap", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(10), new BigDecimal(5), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Welded assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.CAR_BODY, new BigDecimal(300), new BigDecimal(150), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Anti-intrusion bar", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(50), new BigDecimal(25), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Outer door handle", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(15), new BigDecimal(7.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Inner door handle", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(15), new BigDecimal(7.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Window motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(40), new BigDecimal(20), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Door control module", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(50), new BigDecimal(25), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Door seal", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Door water-shield", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Door Hinge", CarPartType.UNIVERSAL, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Door latch", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Door lock", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(30), new BigDecimal(15), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Central locking", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(100), new BigDecimal(50), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel tank door", CarPartType.MODEL_SPECIFIC, CarPartGroup.DOORS, new BigDecimal(15), new BigDecimal(7.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(50), new BigDecimal(25), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Front Right Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(80), new BigDecimal(40), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Front Left Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(80), new BigDecimal(40), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Rear Right Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(60), new BigDecimal(30), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Rear Left Side Door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(60), new BigDecimal(30), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Sunroof Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(400), new BigDecimal(200), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Trunk door Glass", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(180), new BigDecimal(90), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Windshield", CarPartType.MODEL_SPECIFIC, CarPartGroup.WINDOWS, new BigDecimal(250), new BigDecimal(125), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Alternator", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(177), new BigDecimal(88.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Battery", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(135), new BigDecimal(67.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Performance Battery", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(72), new BigDecimal(36), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Battery Box", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(17), new BigDecimal(8.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Battery Cable terminal", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(127), new BigDecimal(63.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Battery Cable", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(64), new BigDecimal(32), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Battery Control system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(50), new BigDecimal(25), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Battery Plate", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(182), new BigDecimal(91), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Battery tray", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(101), new BigDecimal(50.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Battery Cap", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(123), new BigDecimal(61.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Sulphuric Acid (H2SO4)", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(57), new BigDecimal(28.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Distilled Water", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(71), new BigDecimal(35.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Voltage regulator", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(257), new BigDecimal(128.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Door switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(232), new BigDecimal(116), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Ignition switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(66), new BigDecimal(33), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Power window switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(40), new BigDecimal(20), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Steering column switch", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(91), new BigDecimal(45.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Switch cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(147), new BigDecimal(73.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Switch panel", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(66), new BigDecimal(33), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Thermostat", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(232), new BigDecimal(116), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Frame switch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(15), new BigDecimal(7.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Fan ditch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(85), new BigDecimal(42.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Parts and functions of starter system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(196), new BigDecimal(98), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Neutral Safety Switch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(275), new BigDecimal(137.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Wiring harness", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(127), new BigDecimal(63.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Air bag control module", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(72), new BigDecimal(36), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Alarm and siren", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(40), new BigDecimal(20), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Central locking system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(113), new BigDecimal(56.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Chassis control computer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(156), new BigDecimal(78), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Cruise control computer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(113), new BigDecimal(56.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Door contact", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(29), new BigDecimal(14.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Engine computer and management system", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(205), new BigDecimal(102.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Engine control unit", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(204), new BigDecimal(102), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Fuse", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(128), new BigDecimal(64), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Fuse box", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(181), new BigDecimal(90.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Ground strap", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(138), new BigDecimal(69), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Grab Handle", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(294), new BigDecimal(147), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Performance chip", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(282), new BigDecimal(141), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Relay connector", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(81), new BigDecimal(40.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Remote lock", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(169), new BigDecimal(84.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Speed controller", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(290), new BigDecimal(145), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Transmission computer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ELECTRONICS, new BigDecimal(201), new BigDecimal(100.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Wiring connector", CarPartType.UNIVERSAL, CarPartGroup.ELECTRONICS, new BigDecimal(218), new BigDecimal(109), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Ammeter", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Clinometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Dynamometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel gauge", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Manometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Hydrometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Odometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Speedometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Tachometer", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Temperature gauge", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Tire pressure gauge", CarPartType.MODEL_SPECIFIC, CarPartGroup.GAUGES, new BigDecimal(30), new BigDecimal(15), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Sparking cable", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Distributor", CarPartType.MODEL_SPECIFIC, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Distributor Cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Electronic timing controller", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Ignition box", CarPartType.MODEL_SPECIFIC, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Ignition coil", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Ignition Coil Connector", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Ignition coil parts", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Ignition magneto", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Spark plug", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Glow Plug", CarPartType.UNIVERSAL, CarPartGroup.IGNITION_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Engine bay lighting", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Fog light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Spotlight", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Headlight", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Headlight motor", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Interior light and lamp", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "License plate lamp", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Side lighting", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Brake light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Tail light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Tail light cover", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Indicator light", CarPartType.UNIVERSAL, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Turn signal control", CarPartType.MODEL_SPECIFIC, CarPartGroup.LIGHTING_SYSTEM, new BigDecimal(100), new BigDecimal(50), 1, 0));
        this.carPartRepository.save(new CarPart(null, "ABS Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(18), new BigDecimal(9), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Airbag sensors", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(73), new BigDecimal(36.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Automatic transmission speed sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(10), new BigDecimal(5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Camshaft position sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(35), new BigDecimal(17.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Crankshaft position sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(39), new BigDecimal(19.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Coolant temperature sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(24), new BigDecimal(12), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel level sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(15), new BigDecimal(7.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel pressure sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(67), new BigDecimal(33.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Knock sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(36), new BigDecimal(18), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Light sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(25), new BigDecimal(12.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "MAP sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(94), new BigDecimal(47), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Mass airflow sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(39), new BigDecimal(19.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Oil level sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(47), new BigDecimal(23.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Oil pressure sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(49), new BigDecimal(24.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Oxygen sensor (o2)", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(29), new BigDecimal(14.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Throttle position sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.SENSORS, new BigDecimal(83), new BigDecimal(41.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Anti-lock braking system (ABS)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(183), new BigDecimal(91.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "ABS steel pin", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(81), new BigDecimal(40.5), 9, 2));
        this.carPartRepository.save(new CarPart(null, "FR Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(10), new BigDecimal(5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "FL Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(47), new BigDecimal(23.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "RR Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(121), new BigDecimal(60.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "RL Side Sensor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(37), new BigDecimal(18.5), 8, 2));
        this.carPartRepository.save(new CarPart(null, "ABS Motor Circuit", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(22), new BigDecimal(11), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Adjusting mechanism (adjuster star wheel)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(144), new BigDecimal(72), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Anchor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(130), new BigDecimal(65), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Bleed nipple", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(80), new BigDecimal(40), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Brake backing plate", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(196), new BigDecimal(98), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Brake backing pad", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(127), new BigDecimal(63.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Brake cooling duct", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(162), new BigDecimal(81), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Brake disc", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(51), new BigDecimal(25.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Brake fluid", CarPartType.UNIVERSAL, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(185), new BigDecimal(92.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Brake drum", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(124), new BigDecimal(62), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Brake lining", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(150), new BigDecimal(75), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Brake pad", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(51), new BigDecimal(25.5), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Brake pedal", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(189), new BigDecimal(94.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Brake piston", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(178), new BigDecimal(89), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Brake pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(71), new BigDecimal(35.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Brake roll", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(138), new BigDecimal(69), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Brake rotor", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(42), new BigDecimal(21), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Brake servo", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(151), new BigDecimal(75.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Brake shoe", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(85), new BigDecimal(42.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Brake lining", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(17), new BigDecimal(8.5), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Shoe web", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(176), new BigDecimal(88), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Brake warning light", CarPartType.UNIVERSAL, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(23), new BigDecimal(11.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Calibrated friction brake", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(174), new BigDecimal(87), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Caliper", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(148), new BigDecimal(74), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Combination valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(94), new BigDecimal(47), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Dual circuit brake system", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(58), new BigDecimal(29), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Hold-down springs (retainer springs)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Hose", CarPartType.UNIVERSAL, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(120), new BigDecimal(60), 6, 1));
        this.carPartRepository.save(new CarPart(null, "Brake booster hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(127), new BigDecimal(63.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Air brake nylon hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(135), new BigDecimal(67.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Brake duct hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(57), new BigDecimal(28.5), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Hydraulic booster unit", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(78), new BigDecimal(39), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Load-sensing valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(31), new BigDecimal(15.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Master cylinder", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(137), new BigDecimal(68.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Metering valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(31), new BigDecimal(15.5), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Other braking system parts", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(139), new BigDecimal(69.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Park brake lever/handle (hand brake)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(25), new BigDecimal(12.5), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Pressure differential valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(177), new BigDecimal(88.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Proportioning valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(177), new BigDecimal(88.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Reservoir", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(181), new BigDecimal(90.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Shoe return spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(102), new BigDecimal(51), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Tyre", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(53), new BigDecimal(26.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Vacuum brake booster", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(147), new BigDecimal(73.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Wheel cylinder (slave cylinder)", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(34), new BigDecimal(17), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Wheel stud", CarPartType.MODEL_SPECIFIC, CarPartGroup.BRAKING_SYSTEM, new BigDecimal(76), new BigDecimal(38), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Electric motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(21), new BigDecimal(10.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Induction motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Synchronous motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(27), new BigDecimal(13.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "High voltage battery pack", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(11), new BigDecimal(5.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Battery management system", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Nickel–metal hydride battery", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Lithium-ion battery", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fuel cell", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Hydrogen tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "DC-DC converter", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Inverter", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Charge port", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "SAE J1772 (Type 1 connector)", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Type 2 connector", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "CHAdeMO", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "CCS", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Thermal management system", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Radiator", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fan", CarPartType.MODEL_SPECIFIC, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Glycol", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Charger", CarPartType.UNIVERSAL, CarPartGroup.POWERTRAIN_COMPONENTS, new BigDecimal(30), new BigDecimal(15), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Diesel engine, petrol engine (gasoline engine)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(264), new BigDecimal(132), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Accessory belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(52), new BigDecimal(26), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Air duct", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(314), new BigDecimal(157), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Air intake housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(56), new BigDecimal(28), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Air intake manifold", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(257), new BigDecimal(128.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Camshaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(109), new BigDecimal(54.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Camshaft bearing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(98), new BigDecimal(49), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Camshaft fastener", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(151), new BigDecimal(75.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Camshaft follower", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(154), new BigDecimal(77), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Camshaft locking plate", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(165), new BigDecimal(82.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Camshaft pushrod", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(336), new BigDecimal(168), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Camshaft spacer ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(236), new BigDecimal(118), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Camshaft phase variator", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(123), new BigDecimal(61.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Connecting rod", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(144), new BigDecimal(72), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Connecting rod bearing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(69), new BigDecimal(34.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Connecting rod bolt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(263), new BigDecimal(131.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Connecting rod washer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(362), new BigDecimal(181), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Crank case", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(174), new BigDecimal(87), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Crank pulley", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(109), new BigDecimal(54.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Crankshaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(122), new BigDecimal(61), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Crankshaft oil seal (or rear main seal)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(339), new BigDecimal(169.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Cylinder head", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(118), new BigDecimal(59), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Cylinder head cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(275), new BigDecimal(137.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Other cylinder head cover parts", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(255), new BigDecimal(127.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Cylinder head gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(158), new BigDecimal(79), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Distributor", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(372), new BigDecimal(186), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Distributor cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(339), new BigDecimal(169.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Drive belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(350), new BigDecimal(175), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Engine block", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(272), new BigDecimal(136), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Engine cradle", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(53), new BigDecimal(26.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Engine shake damper and vibration absorber", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(74), new BigDecimal(37), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Engine valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(292), new BigDecimal(146), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Fan belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(184), new BigDecimal(92), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Gudgeon pin (wrist pin)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(328), new BigDecimal(164), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Harmonic balancer", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(150), new BigDecimal(75), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Heater", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(378), new BigDecimal(189), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Mounting", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(99), new BigDecimal(49.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Piston", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(336), new BigDecimal(168), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Piston pin and crank pin", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(340), new BigDecimal(170), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Piston pin bush", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(71), new BigDecimal(35.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Piston ring and circlip", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(353), new BigDecimal(176.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Poppet valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(297), new BigDecimal(148.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Positive crankcase ventilation valve (PCV valve)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(297), new BigDecimal(148.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Pulley part", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(391), new BigDecimal(195.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Rocker arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(100), new BigDecimal(50), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Rocker cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(38), new BigDecimal(19), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Starter motor", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(193), new BigDecimal(96.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Starter pinion", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(244), new BigDecimal(122), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Starter ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(176), new BigDecimal(88), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Turbocharger and supercharger", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(387), new BigDecimal(193.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Tappet", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(372), new BigDecimal(186), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Timing tape", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(271), new BigDecimal(135.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Valve cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(31), new BigDecimal(15.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Valve housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(400), new BigDecimal(200), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Valve spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(211), new BigDecimal(105.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Valve stem seal", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(377), new BigDecimal(188.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Water pump pulley", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE, new BigDecimal(384), new BigDecimal(192), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Air blower", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(21), new BigDecimal(10.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Coolant hose (clamp)", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Cooling fan", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(27), new BigDecimal(13.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fan blade", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(11), new BigDecimal(5.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fan belt", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fan clutch", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Radiator", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Radiator bolt", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 11, 2));
        this.carPartRepository.save(new CarPart(null, "Radiator (fan) shroud", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 12, 2));
        this.carPartRepository.save(new CarPart(null, "Radiator gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 13, 3));
        this.carPartRepository.save(new CarPart(null, "Radiator pressure cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 14, 3));
        this.carPartRepository.save(new CarPart(null, "Overflow tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 15, 3));
        this.carPartRepository.save(new CarPart(null, "Thermostat", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 16, 3));
        this.carPartRepository.save(new CarPart(null, "Water neck", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 17, 3));
        this.carPartRepository.save(new CarPart(null, "Water neck o-ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 18, 4));
        this.carPartRepository.save(new CarPart(null, "Water pipe", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 19, 4));
        this.carPartRepository.save(new CarPart(null, "Water pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(30), new BigDecimal(15), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Water pump gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(18), new BigDecimal(9), 21, 4));
        this.carPartRepository.save(new CarPart(null, "Water tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_COOLING_SYSTEM, new BigDecimal(30), new BigDecimal(15), 22, 4));
        this.carPartRepository.save(new CarPart(null, "Oil filter", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(21), new BigDecimal(10.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Oil gasket", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Oil pan", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(27), new BigDecimal(13.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Oil pipe", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(11), new BigDecimal(5.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Oil pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Oil strainer", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(15), new BigDecimal(7.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Oil suction filter", CarPartType.UNIVERSAL, CarPartGroup.ENGINE_OIL_SYSTEM, new BigDecimal(18), new BigDecimal(9), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Catalytic converter", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(215), new BigDecimal(107.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Exhaust clamp and bracket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(157), new BigDecimal(78.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Exhaust flange gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(275), new BigDecimal(137.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Exhaust gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(112), new BigDecimal(56), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Exhaust manifold", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(258), new BigDecimal(129), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Exhaust manifold gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(159), new BigDecimal(79.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Exhaust pipe", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(201), new BigDecimal(100.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Heat shield", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(62), new BigDecimal(31), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Heat sleeving and tape", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(202), new BigDecimal(101), 13, 3));
        this.carPartRepository.save(new CarPart(null, "Resonator", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(180), new BigDecimal(90), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Muffler (Silencer)", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(113), new BigDecimal(56.5), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Spacer ring", CarPartType.UNIVERSAL, CarPartGroup.EXHAUST_SYSTEM, new BigDecimal(104), new BigDecimal(52), 6, 1));
        this.carPartRepository.save(new CarPart(null, "Air filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(215), new BigDecimal(107.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Carburetor", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(157), new BigDecimal(78.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Carburetor parts", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(275), new BigDecimal(137.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Choke cable", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(112), new BigDecimal(56), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Exhaust gas recirculation valve (EGR valve)", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(258), new BigDecimal(129), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel cap or fuel filler cap", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(159), new BigDecimal(79.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel cell", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(201), new BigDecimal(100.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel cell component", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(62), new BigDecimal(31), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel cooler", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(202), new BigDecimal(101), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel distributor", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(180), new BigDecimal(90), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fuel filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(113), new BigDecimal(56.5), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel filter seal", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(104), new BigDecimal(52), 6, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel injector", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(110), new BigDecimal(55), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel injector nozzle", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(255), new BigDecimal(127.5), 6, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel line", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(47), new BigDecimal(23.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(232), new BigDecimal(116), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Fuel pump gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(223), new BigDecimal(111.5), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Fuel pressure regulator", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(76), new BigDecimal(38), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel rail", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(220), new BigDecimal(110), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel tank", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(35), new BigDecimal(17.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel tank cover", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(289), new BigDecimal(144.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Fuel water separator", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(124), new BigDecimal(62), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Intake manifold", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(262), new BigDecimal(131), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Intake manifold gasket", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(240), new BigDecimal(120), 9, 2));
        this.carPartRepository.save(new CarPart(null, "LPG (Liquefied petroleum gas) system assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(269), new BigDecimal(134.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Throttle body", CarPartType.MODEL_SPECIFIC, CarPartGroup.FUEL_SUPPLY_SYSTEM, new BigDecimal(210), new BigDecimal(105), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Axle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(48), new BigDecimal(24), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Camber arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(249), new BigDecimal(124.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Control arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(227), new BigDecimal(113.5), 15, 3));
        this.carPartRepository.save(new CarPart(null, "Beam axle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(291), new BigDecimal(145.5), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Idler arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(216), new BigDecimal(108), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Kingpin", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(197), new BigDecimal(98.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Lateral link", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(306), new BigDecimal(153), 13, 3));
        this.carPartRepository.save(new CarPart(null, "Pan-hard rod", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(92), new BigDecimal(46), 14, 3));
        this.carPartRepository.save(new CarPart(null, "Pit-man arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(120), new BigDecimal(60), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Power steering assembly and component", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(154), new BigDecimal(77), 13, 3));
        this.carPartRepository.save(new CarPart(null, "Rack end", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(221), new BigDecimal(110.5), 12, 2));
        this.carPartRepository.save(new CarPart(null, "Shock absorber", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(297), new BigDecimal(148.5), 14, 3));
        this.carPartRepository.save(new CarPart(null, "Spindle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(227), new BigDecimal(113.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(120), new BigDecimal(60), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Air spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(220), new BigDecimal(110), 14, 3));
        this.carPartRepository.save(new CarPart(null, "Coil spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(298), new BigDecimal(149), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Leaf and parabolic leaf spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(288), new BigDecimal(144), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Ball joint", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(72), new BigDecimal(36), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Rubber spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(317), new BigDecimal(158.5), 6, 1));
        this.carPartRepository.save(new CarPart(null, "Spiral spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(142), new BigDecimal(71), 12, 2));
        this.carPartRepository.save(new CarPart(null, "Stabilizer bars and link", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(322), new BigDecimal(161), 18, 4));
        this.carPartRepository.save(new CarPart(null, "Steering arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(121), new BigDecimal(60.5), 16, 3));
        this.carPartRepository.save(new CarPart(null, "Steering box", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(325), new BigDecimal(162.5), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Steering pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(119), new BigDecimal(59.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Steering column assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(290), new BigDecimal(145), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Steering rack (a form of steering gear; see also rack and pinion and recirculating ball)", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(71), new BigDecimal(35.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Steering shaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(222), new BigDecimal(111), 13, 3));
        this.carPartRepository.save(new CarPart(null, "Steering wheel (driving wheel)", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(76), new BigDecimal(38), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Strut", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(199), new BigDecimal(99.5), 13, 3));
        this.carPartRepository.save(new CarPart(null, "Stub axle", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(215), new BigDecimal(107.5), 17, 3));
        this.carPartRepository.save(new CarPart(null, "Suspension link and bolt", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(72), new BigDecimal(36), 7, 1));
        this.carPartRepository.save(new CarPart(null, "Trailing arm", CarPartType.MODEL_SPECIFIC, CarPartGroup.SUSPENSION_AND_STEERING_SYSTEM, new BigDecimal(55), new BigDecimal(27.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Universal joint", CarPartType.UNIVERSAL, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(165), new BigDecimal(82.5), 15, 3));
        this.carPartRepository.save(new CarPart(null, "Bell housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(167), new BigDecimal(83.5), 19, 4));
        this.carPartRepository.save(new CarPart(null, "Carrier assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(155), new BigDecimal(77.5), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Chain wheel and sprocket", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(28), new BigDecimal(14), 15, 3));
        this.carPartRepository.save(new CarPart(null, "Clutch assembly", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(71), new BigDecimal(35.5), 14, 3));
        this.carPartRepository.save(new CarPart(null, "Clutch cable", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(8), new BigDecimal(4), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Clutch disk", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(178), new BigDecimal(89), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Clutch fan", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(161), new BigDecimal(80.5), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Clutch fork", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(134), new BigDecimal(67), 16, 3));
        this.carPartRepository.save(new CarPart(null, "Clutch hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(160), new BigDecimal(80), 18, 4));
        this.carPartRepository.save(new CarPart(null, "Clutch lever", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(83), new BigDecimal(41.5), 1, 0));
        this.carPartRepository.save(new CarPart(null, "Clutch lining", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(148), new BigDecimal(74), 11, 2));
        this.carPartRepository.save(new CarPart(null, "Differential", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(16), new BigDecimal(8), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Flywheel", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(77), new BigDecimal(38.5), 6, 1));
        this.carPartRepository.save(new CarPart(null, "Gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(191), new BigDecimal(95.5), 2, 0));
        this.carPartRepository.save(new CarPart(null, "Gear coupling", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(44), new BigDecimal(22), 17, 3));
        this.carPartRepository.save(new CarPart(null, "Gear pump", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(118), new BigDecimal(59), 19, 4));
        this.carPartRepository.save(new CarPart(null, "Gear ring", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(55), new BigDecimal(27.5), 0, 0));
        this.carPartRepository.save(new CarPart(null, "Gear stick ", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(171), new BigDecimal(85.5), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Gearbox", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(89), new BigDecimal(44.5), 19, 4));
        this.carPartRepository.save(new CarPart(null, "Idler gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(167), new BigDecimal(83.5), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Knuckle", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(45), new BigDecimal(22.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Master cylinder", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(125), new BigDecimal(62.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Output shaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(40), new BigDecimal(20), 19, 4));
        this.carPartRepository.save(new CarPart(null, "Planetary gear set", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(85), new BigDecimal(42.5), 16, 3));
        this.carPartRepository.save(new CarPart(null, "Drive shaft", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(136), new BigDecimal(68), 17, 3));
        this.carPartRepository.save(new CarPart(null, "Shift cable", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(119), new BigDecimal(59.5), 8, 2));
        this.carPartRepository.save(new CarPart(null, "Shift fork", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(84), new BigDecimal(42), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Shift knob", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(189), new BigDecimal(94.5), 19, 4));
        this.carPartRepository.save(new CarPart(null, "Shift lever", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(139), new BigDecimal(69.5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Slave cylinder", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(135), new BigDecimal(67.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Speed reducer", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(13), new BigDecimal(6.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Speedometer gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(29), new BigDecimal(14.5), 15, 3));
        this.carPartRepository.save(new CarPart(null, "Steering gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(86), new BigDecimal(43), 4, 1));
        this.carPartRepository.save(new CarPart(null, "Torque converter", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(123), new BigDecimal(61.5), 17, 3));
        this.carPartRepository.save(new CarPart(null, "Trans-axle housing", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(132), new BigDecimal(66), 11, 2));
        this.carPartRepository.save(new CarPart(null, "Transfer case", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(126), new BigDecimal(63), 14, 3));
        this.carPartRepository.save(new CarPart(null, "Transmission gear", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(69), new BigDecimal(34.5), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Transmission pan", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(39), new BigDecimal(19.5), 9, 2));
        this.carPartRepository.save(new CarPart(null, "Transmission spring", CarPartType.MODEL_SPECIFIC, CarPartGroup.TRANSMISSION_SYSTEM, new BigDecimal(164), new BigDecimal(82), 14, 3));
        this.carPartRepository.save(new CarPart(null, "AC Refrigerant", CarPartType.UNIVERSAL, CarPartGroup.AIR_CONDITIONING, new BigDecimal(20), new BigDecimal(10), 30, 6));
        this.carPartRepository.save(new CarPart(null, "AC Clutch", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(60), new BigDecimal(30), 6, 1));
        this.carPartRepository.save(new CarPart(null, "AC Compressor", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(50), new BigDecimal(25), 6, 1));
        this.carPartRepository.save(new CarPart(null, "AC Condenser", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(20), new BigDecimal(10), 6, 1));
        this.carPartRepository.save(new CarPart(null, "AC Hose", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "AC Kit", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(70), new BigDecimal(35), 10, 2));
        this.carPartRepository.save(new CarPart(null, "AC Relay", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(5), new BigDecimal(2.5), 20, 4));
        this.carPartRepository.save(new CarPart(null, "AC Valve", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(16), new BigDecimal(8), 20, 4));
        this.carPartRepository.save(new CarPart(null, "AC Evaporator", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(30), new BigDecimal(15), 5, 1));
        this.carPartRepository.save(new CarPart(null, "AC Pipe", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "AC Gas Receiver", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(40), new BigDecimal(20), 5, 1));
        this.carPartRepository.save(new CarPart(null, "AC Condenser filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(10), new BigDecimal(5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "AC Cabin filter", CarPartType.MODEL_SPECIFIC, CarPartGroup.AIR_CONDITIONING, new BigDecimal(10), new BigDecimal(5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Grooved ball bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Needle bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Roller bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Sleeve bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Wheel bearing", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Fuel vapour hose", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Reinforced hose (high-pressure hose)", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Non-reinforced hose", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Radiator hose", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Adhesive tape", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Foil", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 30, 6));
        this.carPartRepository.save(new CarPart(null, "Air bag", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(30), new BigDecimal(15), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Cables", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 100, 20));
        this.carPartRepository.save(new CarPart(null, "Fastener", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Gasket", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Horn", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(20), new BigDecimal(10), 3, 1));
        this.carPartRepository.save(new CarPart(null, "Mirror", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(10), new BigDecimal(5), 10, 2));
        this.carPartRepository.save(new CarPart(null, "Paint", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(50), new BigDecimal(25), 20, 4));
        this.carPartRepository.save(new CarPart(null, "Rubber", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Washer", CarPartType.UNIVERSAL, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(2.5), 5, 1));
        this.carPartRepository.save(new CarPart(null, "Air Filter Change", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(118), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Clutch Assembly Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(281), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Drive Belt Tensioner Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(25), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Drive Belt(s) Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(154), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Engine Oil Pan Reseal", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(242), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel Filter Change", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(286), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel Injector Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(152), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Head Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(120), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Intake Manifold Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(195), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Mass Airflow (Air Flow) Sensor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(26), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Oil & Filter Change (Engine)", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(150), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Spark Plug Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(99), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Throttle Body Assembly Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(79), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Valve Cover Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(184), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Water Pump Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(147), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Brake Hose Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(273), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Brake Master Cylinder Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(158), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Brake Pads Replacement - Front", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(40), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Brake Pads Replacement - Rear", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(216), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Coolant Thermostat Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(136), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Radiator Hose Replacement - Lower", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(37), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Radiator Hose Replacement - Upper", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(182), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Radiator Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(83), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Catalytic Converter Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(222), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Exhaust Manifold Gasket Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(250), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Exhaust System Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(294), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Alternator Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(242), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Battery Cable Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(190), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Brake Light Switch Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(168), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "ECU Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(71), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Fuel Pump Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(68), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Headlamp Bulb Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(126), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Headlight Alignment Adjustment", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(147), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Ignition Switch Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(223), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Oxygen Sensor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(166), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Starter Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(161), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Vent / Fan Blower Motor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(243), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Window Motor Replacement / Window Regulator Replacement - Front", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(147), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Window Motor Replacement / Window Regulator Replacement - Rear", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(242), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Windshield Wiper Motor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(232), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Inner Tie Rod Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(29), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Outer Tie Rod Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(213), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Power Steering Pump Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(300), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Shock Absorber Replacement - Rear", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(217), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Strut Assembly Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(218), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "AC Compressor Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(295), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "AC Line Replacement", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(173), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Cabin Air Filter Change", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(109), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Wheel Alignment Adjustment", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(287), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Tire pressure regulation", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(5), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Tire mounting", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(10), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Tire balancing", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(15), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "AC Cleaning", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(25), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Small service fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(80), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Big service fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(150), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Painting job fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(700), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Electronics inspection fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(25), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "OBD2 Diagnostics fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(20), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "General Part replacement fee", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(20), new BigDecimal(0), 1000000, 0));
        this.carPartRepository.save(new CarPart(null, "Working hour", CarPartType.LABOR, CarPartGroup.OTHER, new BigDecimal(7), new BigDecimal(0), 1000000, 0));

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
        final Problem problemA = this.problemRepository.save(new Problem(null, "Steering wheel does not return to normal position", "TODO", new HashSet<>()));
        final Problem problemB = this.problemRepository.save(new Problem(null, "Front end vibrations", "TODO", new HashSet<>()));
        final Problem problemC = this.problemRepository.save(new Problem(null, "Rattling noise", "TODO", new HashSet<>()));
        final Problem problemD = this.problemRepository.save(new Problem(null, "Steering wheel hard to turn", "TODO", new HashSet<>()));
        final Problem problemE = this.problemRepository.save(new Problem(null, "Clunking sound when driving over bumps", "TODO", new HashSet<>()));
        final Problem problemF = this.problemRepository.save(new Problem(null, "Loose springs", "TODO", new HashSet<>()));
        final Problem problemG = this.problemRepository.save(new Problem(null, "Outside edge tire wear", "TODO", new HashSet<>()));
        final Problem problemH = this.problemRepository.save(new Problem(null, "Loose caliper bolts", "TODO", new HashSet<>()));
        final Problem problemI = this.problemRepository.save(new Problem(null, "Inside edge tire wear", "TODO", new HashSet<>()));
        final Problem problemJ = this.problemRepository.save(new Problem(null, "Vehicle uncomfortable", "TODO", new HashSet<>()));
        final Problem problemK = this.problemRepository.save(new Problem(null, "Power steering fluid level low", "TODO", new HashSet<>()));
        final Problem problemL = this.problemRepository.save(new Problem(null, "Abnormal steering when exiting a turn", "TODO", new HashSet<>()));
        final Problem problemM = this.problemRepository.save(new Problem(null, "Car pulls to one side", "TODO", new HashSet<>()));
        final Problem problemN = this.problemRepository.save(new Problem(null, "Low brake fluid level", "TODO", new HashSet<>()));
        final Problem problemO = this.problemRepository.save(new Problem(null, "Brake warning light on", "TODO", new HashSet<>()));
        final Problem problemP = this.problemRepository.save(new Problem(null, "Brake discs unevenly worn out", "TODO", new HashSet<>()));
        final Problem problemQ = this.problemRepository.save(new Problem(null, "Extended brake pedal travel", "TODO", new HashSet<>()));
        final Problem problemR = this.problemRepository.save(new Problem(null, "Engine power loss occurring randomly", "TODO", new HashSet<>()));
        final Problem problemS = this.problemRepository.save(new Problem(null, "Brakes make squealing noise when used", "TODO", new HashSet<>()));
        final Problem problemT = this.problemRepository.save(new Problem(null, "Vehicle shaking during normal driving", "TODO", new HashSet<>()));
        final Problem problemU = this.problemRepository.save(new Problem(null, "Engine backfiring", "TODO", new HashSet<>()));
        final Problem problemV = this.problemRepository.save(new Problem(null, "Steering feels loose", "TODO", new HashSet<>()));
        // final Problem problemW = this.problemRepository.save(new Problem(null, "", "", new HashSet<>()));
        final Problem problemX = this.problemRepository.save(new Problem(null, "One wheel locking up", "TODO", new HashSet<>()));
        final Problem problemY = this.problemRepository.save(new Problem(null, "Tires unevenly inflated", "TODO", new HashSet<>()));
        final Problem problemZ = this.problemRepository.save(new Problem(null, "No consistency tire wear", "TODO", new HashSet<>()));

        final Problem problem1 = this.problemRepository.save(new Problem(null, "Repaired broken steering rack or fixed unbalanced tires in last 3 months", "TODO", new HashSet<>()));
        final Problem problem2 = this.problemRepository.save(new Problem(null, "Low engine oil level occured more than 3 times in last 6 months", "TODO", new HashSet<>()));
        final Problem problem3 = this.problemRepository.save(new Problem(null, "Vehicle has problem with bad cylinder head for more than 6 months", "TODO", new HashSet<>()));
        final Problem problem4 = this.problemRepository.save(new Problem(null, "Vehicle has brake system leak", "TODO", new HashSet<>()));
        final Problem problem5 = this.problemRepository.save(new Problem(null, "Vehicle has aftermarket parts fitted", "TODO", new HashSet<>()));
        final Problem problem6 = this.problemRepository.save(new Problem(null, "Tire-wear related fault occured in the last 3 months", "TODO", new HashSet<>()));
        final Problem problem7 = this.problemRepository.save(new Problem(null, "Performed repair in the last 4 months where universal parts were used", "TODO", new HashSet<>()));

        // ============================================================================================================
        // Faults initialization
        // ============================================================================================================
        Fault brokenSteeringRack = new Fault(
                null,
                "Broken steering rack",
                "The entire steering rack unit will need to be replaced.",
                FaultGroup.FIRST,
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
                FaultGroup.FIRST,
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
                FaultGroup.FIRST,
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
                FaultGroup.FIRST,
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
                FaultGroup.SECOND,
                new HashSet<ProblemAndFault>());
        final Set<ProblemAndFault> badCylinderHeadProblems = new HashSet<>();
        badCylinderHeadProblems.add(new ProblemAndFault(null, problem2, false, badCylinderHead));
        badCylinderHead.getProblems().addAll(badCylinderHeadProblems);
        badCylinderHead = this.faultRepository.save(badCylinderHead);

        Fault brakeSystemLeak = new Fault(
                null,
                "Brake system leak",
                "This is often caused by air bubbles forming in the brake lines. If the brakes were recently worked on, maybe the mechanic did not fully \"bleed\" the brake system. Or worse, there could be a leak somewhere in the system which is allowing air to enter.",
                FaultGroup.SECOND,
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
                FaultGroup.THIRD,
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
                FaultGroup.THIRD,
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
    }

}
