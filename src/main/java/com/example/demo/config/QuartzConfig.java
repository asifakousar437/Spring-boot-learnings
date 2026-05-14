package com.example.demo.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.person.Person1Scheduler;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail jobDetail() {

        return JobBuilder.newJob(Person1Scheduler.class)
                .withIdentity("personJob")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger trigger(JobDetail jobDetail) {

        return TriggerBuilder.newTrigger()
                .forJob(jobDetail)
                .withIdentity("personTrigger")
                .withSchedule(
                        CronScheduleBuilder
                        .cronSchedule("0 0 * * * ?")
                )
                .build();
    }
}
