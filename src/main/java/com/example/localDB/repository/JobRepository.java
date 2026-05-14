package com.example.localDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.localDB.entity.JobEntity;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {

}
