package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person1Entity;

@Repository
public interface Person1Repository extends JpaRepository<Person1Entity, Long> {

}
