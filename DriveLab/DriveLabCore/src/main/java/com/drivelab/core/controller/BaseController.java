package com.drivelab.core.controller;

import com.drivelab.core.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
public abstract class BaseController<T, ID> {

    protected final BaseService<T, ID> service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid T payload) {
        return new ResponseEntity<>(this.service.create(payload), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable ID id) {
        return ResponseEntity.ok(this.service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid T payload, @PathVariable ID id) {
        return ResponseEntity.ok(this.service.update(id, payload));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable ID id) {
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }
}
