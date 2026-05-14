package com.example.project2API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project2API.entity.Person2Entity;

@Repository
public interface Person2Repository extends JpaRepository<Person2Entity, Long> {

}
