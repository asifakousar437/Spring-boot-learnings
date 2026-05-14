package com.example.jobsquartzscheduler.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class myJobs implements Job{
	
	@Override
	public void execute(JobExecutionContext Context) {
		System.out.println("Job Scheduled using Quartz scheduler");
	}

}
