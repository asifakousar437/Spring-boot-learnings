package com.example.localDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.localDB.entity.JobEntity;
import com.example.localDB.service.JobService;

@RestController
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping("/jobs")
	public List <JobEntity> getJobs(){
		return jobService.getAllJobs();
	}

}
