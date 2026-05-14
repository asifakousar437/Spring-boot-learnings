package com.example.project2API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project2API.dto.Person2Dto;
import com.example.project2API.service.Person2Service;

@RestController
@RequestMapping("/person")
public class Person2Controller {
	@Autowired
    private Person2Service service;

    @PostMapping("/save")
    public ResponseEntity<String> savePersons(
            @RequestBody List<Person2Dto> persons) {

        service.savePersons(persons);

        return ResponseEntity.ok(
                "Records Saved Successfully");
    }

}
