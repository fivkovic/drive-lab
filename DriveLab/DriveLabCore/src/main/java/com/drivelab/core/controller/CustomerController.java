package com.drivelab.core.controller;

import com.drivelab.core.dto.CustomerResponse;
import com.drivelab.core.model.Customer;
import com.drivelab.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.CUSTOMERS_ENDPOINT;

@RestController
@RequestMapping(CUSTOMERS_ENDPOINT)
public class CustomerController extends BaseController<Customer, Long> {

    @Autowired
    public CustomerController(CustomerService customerService) { super(customerService); }

    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.service.findAll().stream().map(CustomerResponse::new));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new CustomerResponse(this.service.findById(id)));
    }
}
