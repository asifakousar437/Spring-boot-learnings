package com.example.demo.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.db2.entity.Person1Entity;

@Repository
public interface Person1Repository extends JpaRepository <Person1Entity, Long> {

}
