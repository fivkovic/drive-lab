package com.drivelab.core.service;

import com.drivelab.core.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, Long> {

    @Autowired
    protected CustomerService(JpaRepository<Customer, Long> customerRepository) { super(customerRepository); }
}