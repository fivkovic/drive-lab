package com.drivelab.core.service;

import com.drivelab.core.dto.RepairRequest;
import com.drivelab.core.exception.NotFoundException;
import com.drivelab.core.model.*;
import com.drivelab.core.repository.FaultRepository;
import com.drivelab.core.repository.RepairShopRepository;
import com.drivelab.core.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RepairService extends BaseService<Repair, Long> {

    private final VehicleRepository vehicleRepository;
    private final FaultRepository faultRepository;
    private final RepairShopRepository repairShopRepository;

    @Autowired
    protected RepairService(JpaRepository<Repair, Long> repairRepository,
                            VehicleRepository vehicleRepository,
                            FaultRepository faultRepository,
                            RepairShopRepository repairShopRepository) { super(repairRepository);
        this.vehicleRepository = vehicleRepository;
        this.faultRepository = faultRepository;
        this.repairShopRepository = repairShopRepository;
    }

    public Repair createNewRepair(RepairRequest repairRequest) {

        Optional<Vehicle> optionalVehicle = this.vehicleRepository.findById(repairRequest.getVehicleId());
        if (!optionalVehicle.isPresent())
            throw new NotFoundException("Vehicle not found.");

        Optional<Fault> optionalFault = this.faultRepository.findById(repairRequest.getFaultId());
        if (!optionalFault.isPresent())
            throw new NotFoundException("Fault not found.");

        Optional<RepairShop> optionalRepairShop = this.repairShopRepository.findById(repairRequest.getRepairShopId());
        if (!optionalRepairShop.isPresent())
            throw new NotFoundException("Fault not found.");

        Set<UsedCarPart> usedCarParts = repairRequest.getUsedParts().stream().map(carPart -> new UsedCarPart(carPart, 1)).collect(Collectors.toSet());
        BigDecimal totalPrice = usedCarParts.stream()
                .map(usedCarPart -> usedCarPart.getCarPart().getSalesPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Repair newRepair = new Repair(null, optionalVehicle.get(), optionalFault.get(), repairRequest.getWasEngineOilLevelLow(),
                repairRequest.getHasAftermarketPartsFitted(), usedCarParts, totalPrice, optionalRepairShop.get(), new Date());

        return super.create(newRepair);
    }
}