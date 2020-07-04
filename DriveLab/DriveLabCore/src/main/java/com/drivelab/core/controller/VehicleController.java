package com.drivelab.core.controller;

import com.drivelab.core.dto.VehicleResponse;
import com.drivelab.core.model.Vehicle;
import com.drivelab.core.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.VEHICLES_ENDPOINT;

@RestController
@RequestMapping(VEHICLES_ENDPOINT)
public class VehicleController extends BaseController<Vehicle, Long> {

    @Autowired
    public VehicleController(VehicleService vehicleService) { super(vehicleService); }

    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.service.findAll().stream().map(VehicleResponse::new));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<VehicleResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new VehicleResponse(this.service.findById(id)));
    }
}
