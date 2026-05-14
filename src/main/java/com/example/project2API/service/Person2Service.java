package com.example.project2API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project2API.dto.Person2Dto;
import com.example.project2API.entity.Person2Entity;
import com.example.project2API.repository.Person2Repository;

@Service
public class Person2Service {

    @Autowired
    private Person2Repository repository;

    public void savePersons(
            List<Person2Dto> dtos) {

        List<Person2Entity> persons =
                dtos.stream()
                .map(dto -> {

                    Person2Entity person =
                            new Person2Entity();

                    person.setName(dto.getName());
                    person.setAge(dto.getAge());
                    person.setGender(dto.getGender());
                    person.setEmail(dto.getEmail());
                    person.setPhone(dto.getPhone());
                    person.setCity(dto.getCity());
                    person.setState(dto.getState());
                    person.setCountry(dto.getCountry());
                    person.setStatus(dto.getStatus());

                    return person;
                })
                .toList();

        repository.saveAll(persons);
    }
}