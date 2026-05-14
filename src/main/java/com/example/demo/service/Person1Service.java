package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Person1Dto;
import com.example.demo.entity.Person1Entity;
import com.example.demo.repository.Person1Repository;

@Service
public class Person1Service {
	@Autowired
	private Person1Repository person1Repository;
	@Autowired
    private RestTemplate restTemplate;
	
	public void processPersons() {
		List<Person1Entity> persons=person1Repository.findAll();
		
		 List<Person1Dto> payload =
	                persons.stream()
	                .map(person -> {

	                    Person1Dto dto =
	                            new Person1Dto();

	                    dto.setName(person.getName());
	                    dto.setAge(person.getAge());
	                    dto.setGender(person.getGender());
	                    dto.setEmail(person.getEmail());
	                    dto.setPhone(person.getPhone());
	                    dto.setCity(person.getCity());
	                    dto.setState(person.getState());
	                    dto.setCountry(person.getCountry());
	                    dto.setStatus(person.getStatus());

	                    return dto;
	                })
	                .toList();

	        // API URL
	        String url =
	          "http://localhost:8082/person/save";

	        ResponseEntity<String> response =
	                restTemplate.postForEntity(
	                        url,
	                        payload,
	                        String.class
	                );

	        System.out.println(response.getBody());
	}

}
