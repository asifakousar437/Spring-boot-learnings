package com.example.demo.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.db1.entity.JobEntity;

@Repository
public interface JobRepository extends JpaRepository <JobEntity, Long> {

}
