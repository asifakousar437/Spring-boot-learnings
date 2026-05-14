package com.example.jobsquartzscheduler.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.jobsquartzscheduler.jobs.*;

@Configuration
public class myJobsConfig {
	
	@Bean
	public JobDetail jobDetail(){
		return JobBuilder.newJob(myJobs.class)
				.withIdentity("myJobs")
				.storeDurably()
				.build();
		
	}
	
	@Bean
	public Trigger trigger(JobDetail jobDetail) {
		return TriggerBuilder.newTrigger()
				.forJob(jobDetail)
				.withIdentity("PrintTrigger")
				.withSchedule(
						CronScheduleBuilder.cronSchedule("0 0 * * * ?")
						)
				.build();
	}

}
