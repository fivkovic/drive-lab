package com.drivelab.core.controller;

import com.drivelab.core.dto.CarPartResponse;
import com.drivelab.core.model.CarPart;
import com.drivelab.core.model.CarPartGroup;
import com.drivelab.core.model.CarPartType;
import com.drivelab.core.service.CarPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.CAR_PARTS_ENDPOINT;

@RestController
@RequestMapping(CAR_PARTS_ENDPOINT)
public class CarPartController extends BaseController<CarPart, Long> {

    @Autowired
    public CarPartController(CarPartService carPartService) { super(carPartService); }

    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.service.findAll().stream().map(CarPartResponse::new));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new CarPartResponse(this.service.findById(id)));
    }

    @GetMapping("/type/{carPartType}")
    public ResponseEntity<?> findAllByGroup(@PathVariable CarPartType carPartType)  {
        return ResponseEntity.ok(((CarPartService)this.service).findAllByType(carPartType));
    }

    @GetMapping("/group/{carPartGroup}")
    public ResponseEntity<?> findAllByGroup(@PathVariable CarPartGroup carPartGroup)  {
        return ResponseEntity.ok(((CarPartService)this.service).findAllByGroup(carPartGroup));
    }
}
