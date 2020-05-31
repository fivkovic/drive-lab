package com.drivelab.core.controller;

import com.drivelab.core.model.Vehicle;
import com.drivelab.core.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.VEHICLES_ENDPOINT;

@RestController
@RequestMapping(VEHICLES_ENDPOINT)
public class VehicleController extends BaseController<Vehicle, Long> {

    @Autowired
    public VehicleController(VehicleService vehicleService) { super(vehicleService); }
}
