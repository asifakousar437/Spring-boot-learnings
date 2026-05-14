package com.example.externalapicall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.externalapicall.entity.JobcacheEntity;

public interface JobcacheRepo extends JpaRepository<JobcacheEntity, Long> {
}
