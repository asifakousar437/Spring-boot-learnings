package com.example.externalapicall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.externalapicall.entity.JobcacheEntity;
import com.example.externalapicall.service.JobcacheService;

@RestController
@RequestMapping("/jobs")
public class JobcacheController {
	@Autowired
    private JobcacheService service;

    // Add Job
    @PostMapping
    public JobcacheEntity addJob(@RequestBody JobcacheEntity job) {
        return service.addJob(job);
    }

    // Get Job By Id
    @GetMapping("/{id}")
    public JobcacheEntity getJob(@PathVariable Long id) {
        return service.getJobById(id);
    }

    // Get All Jobs
    @GetMapping
    public List<JobcacheEntity> getAllJobs() {
        return service.getAllJobs();
    }

    // Update Job
    @PutMapping
    public JobcacheEntity updateJob(@RequestBody JobcacheEntity job) {
        return service.updateJob(job);
    }

    // Delete Job
    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) {
        return service.deleteJob(id);
    }
	
}
