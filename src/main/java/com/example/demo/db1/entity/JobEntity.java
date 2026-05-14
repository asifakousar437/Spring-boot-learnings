package com.example.demo.db1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jobs")
public class JobEntity {
	
	@Id
	private Long id;
	
	private String company;
	
	private double salary;
	
	private String title;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company=company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}

}
