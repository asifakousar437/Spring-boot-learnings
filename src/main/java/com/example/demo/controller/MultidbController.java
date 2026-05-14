package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db1.entity.JobEntity;
import com.example.demo.db1.repository.JobRepository;
import com.example.demo.db2.entity.Person1Entity;
import com.example.demo.db2.repository.Person1Repository;

@RestController
public class MultidbController {

    private final JobRepository jobRepository;

    private final Person1Repository person1Repository;

    // Constructor Injection
    public MultidbController(
            JobRepository jobRepository,
            Person1Repository person1Repository) {

        this.jobRepository = jobRepository;
        this.person1Repository = person1Repository;
    }

    @GetMapping("/jobs")
    public List<JobEntity> getJobs() {

        return jobRepository.findAll();
    }

    @GetMapping("/persons")
    public List<Person1Entity> getPersons() {

        return person1Repository.findAll();
    }
}