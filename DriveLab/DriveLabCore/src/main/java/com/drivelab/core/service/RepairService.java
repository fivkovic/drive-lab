package com.drivelab.core.service;

import com.drivelab.core.model.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RepairService extends BaseService<Repair, Long> {

    @Autowired
    protected RepairService(JpaRepository<Repair, Long> repairRepository) { super(repairRepository); }
}