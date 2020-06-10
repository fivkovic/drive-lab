package com.drivelab.core.controller;

import com.drivelab.core.model.Problem;
import com.drivelab.core.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.drivelab.core.common.Constants.API.PROBLEMS_ENDPOINT;

@RestController
@RequestMapping(PROBLEMS_ENDPOINT)
public class ProblemController extends BaseController<Problem, Long> {

    @Autowired
    public ProblemController(ProblemService problemService) { super(problemService); }
}
