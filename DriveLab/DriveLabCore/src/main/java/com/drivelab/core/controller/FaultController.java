package com.drivelab.core.controller;

import com.drivelab.core.dto.FaultResponse;
import com.drivelab.core.model.Fault;
import com.drivelab.core.service.FaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.FAULTS_ENDPOINT;

@RestController
@RequestMapping(FAULTS_ENDPOINT)
public class FaultController extends BaseController<Fault, Long>  {

    @Autowired
    public FaultController(FaultService faultService) { super(faultService); }

    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.service.findAll().stream().map(FaultResponse::new));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<FaultResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new FaultResponse(this.service.findById(id)));
    }
}
