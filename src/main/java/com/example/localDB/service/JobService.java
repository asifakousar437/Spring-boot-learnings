package com.example.localDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.localDB.entity.JobEntity;
import com.example.localDB.repository.JobRepository;

@Service
public class JobService {
	@Autowired
	public JobRepository jobRepository;
	
	public List <JobEntity> getAllJobs(){
		return jobRepository.findAll();
	}

}
