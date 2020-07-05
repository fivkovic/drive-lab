package com.drivelab.core.service;

import com.drivelab.core.model.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProblemService extends BaseService<Problem, Long> {

    @Autowired
    protected ProblemService(JpaRepository<Problem, Long> problemRepository) { super(problemRepository); }
}
