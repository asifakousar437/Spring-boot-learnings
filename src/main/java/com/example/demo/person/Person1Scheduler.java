package com.example.demo.person;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.Person1Service;

@Component
public class Person1Scheduler implements Job {
	@Autowired
	private Person1Service person1Service;
	@Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {

        System.out.println("Quartz Job Started");

        person1Service.processPersons();
	}

}
