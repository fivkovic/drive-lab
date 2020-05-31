package com.drivelab.core.repository;

import com.drivelab.core.model.RepairShop;
import com.drivelab.core.model.RepairShopRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepairShopRepository extends JpaRepository<RepairShop, Long> {
    Optional<RepairShop> findByUsername(String username);
    List<RepairShop> findAllByRepairShopRole(RepairShopRole repairShopRole);
}
