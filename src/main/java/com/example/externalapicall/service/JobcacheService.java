package com.example.externalapicall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;

import com.example.externalapicall.entity.JobcacheEntity;
import com.example.externalapicall.repository.JobcacheRepo;

@Service
public class JobcacheService {
	@Autowired
    private JobcacheRepo repository;

    // Add Job
    public JobcacheEntity addJob(JobcacheEntity job) {
        return repository.save(job);
    }

    // Get Job By Id
    @Cacheable(value = "jobs", key = "#id")
    public JobcacheEntity getJobById(Long id) {

        System.out.println("Fetching from Database...");

        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job Not Found"));
    }

    // Get All Jobs
    public List<JobcacheEntity> getAllJobs() {
        return repository.findAll();
    }

    // Update Job
    @CachePut(value = "jobs", key = "#job.id")
    public JobcacheEntity updateJob(JobcacheEntity job) {

        System.out.println("Updating Database...");

        return repository.save(job);
    }

    // Delete Job
    @CacheEvict(value = "jobs", key = "#id")
    public String deleteJob(Long id) {

        repository.deleteById(id);

        return "Job Deleted Successfully";
    }


}
