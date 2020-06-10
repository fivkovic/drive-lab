package com.drivelab.core.controller;

import com.drivelab.core.model.VehicleManufacturer;
import com.drivelab.core.service.VehicleManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.VEHICLE_MANUFACTURERS_ENDPOINT;

@RestController
@RequestMapping(VEHICLE_MANUFACTURERS_ENDPOINT)
public class VehicleManufacturerController extends BaseController<VehicleManufacturer, Long> {

    @Autowired
    public VehicleManufacturerController(VehicleManufacturerService vehicleManufacturerService) { super(vehicleManufacturerService); }
}
