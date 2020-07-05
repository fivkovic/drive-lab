package com.drivelab.core.service;

import com.drivelab.core.model.Fault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FaultService extends BaseService<Fault, Long> {

    @Autowired
    protected FaultService(JpaRepository<Fault, Long> faultRepository) { super(faultRepository); }
}
