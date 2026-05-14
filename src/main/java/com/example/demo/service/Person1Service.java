package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.db2.entity.Person1Entity;
import com.example.demo.db2.repository.Person1Repository;

@Service
public class Person1Service {

	private final Person1Repository person1Repository;
	
	public Person1Service(Person1Repository person1Repository) {
		this.person1Repository=person1Repository;
	}
	public List<Person1Entity> getAllPersons(){
		return person1Repository.findAll();
	}
}
