package com.drivelab.core.controller;

import com.drivelab.core.model.Customer;
import com.drivelab.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.CUSTOMERS_ENDPOINT;

@RestController
@RequestMapping(CUSTOMERS_ENDPOINT)
public class CustomerController extends BaseController<Customer, Long> {

    @Autowired
    public CustomerController(CustomerService customerService) { super(customerService); }
}
