package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.db1.entity.JobEntity;
import com.example.demo.db1.repository.JobRepository;

@Service
public class JobService {
	
	private final JobRepository jobRepository;
	
	public JobService(JobRepository jobRepository) {
		this.jobRepository=jobRepository;
	}
	public List<JobEntity> getAllJobs() {
        return jobRepository.findAll();
    }

}
