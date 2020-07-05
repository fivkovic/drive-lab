package com.drivelab.core.controller;

import com.drivelab.core.dto.RepairRequest;
import com.drivelab.core.dto.RepairResponse;
import com.drivelab.core.model.Repair;
import com.drivelab.core.service.RepairService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.drivelab.core.common.Constants.API.REPAIRS_ENDPOINT;

@RestController
@RequestMapping(REPAIRS_ENDPOINT)
public class RepairController extends BaseController<Repair, Long> {

    @Autowired
    public RepairController(RepairService repairService) { super(repairService); }

    @PostMapping("/new")
    public ResponseEntity<?> create(@RequestBody @Valid RepairRequest repairRequest) {
        return new ResponseEntity<>(((RepairService)this.service).createNewRepair(repairRequest), HttpStatus.CREATED);
    }

    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.service.findAll().stream().map(RepairResponse::new));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<RepairResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new RepairResponse(this.service.findById(id)));
    }
}
