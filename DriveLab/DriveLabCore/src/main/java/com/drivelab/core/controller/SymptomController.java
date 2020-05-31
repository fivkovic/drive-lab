package com.drivelab.core.controller;

import com.drivelab.core.model.Symptom;
import com.drivelab.core.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.SYMPTOMS_ENDPOINT;

@RestController
@RequestMapping(SYMPTOMS_ENDPOINT)
public class SymptomController extends BaseController<Symptom, Long> {

    @Autowired
    public SymptomController(SymptomService symptomService) { super(symptomService); }
}
