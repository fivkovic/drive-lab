package com.drivelab.core.controller;

import com.drivelab.core.dto.RepairResponse;
import com.drivelab.core.model.Repair;
import com.drivelab.core.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.REPAIRS_ENDPOINT;

@RestController
@RequestMapping(REPAIRS_ENDPOINT)
public class RepairController extends BaseController<Repair, Long> {

    @Autowired
    public RepairController(RepairService repairService) { super(repairService); }

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
