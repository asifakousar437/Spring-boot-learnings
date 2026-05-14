package com.example.localDB.entity;

import jakarta.persistence.*; 


@Entity
@Table (name="job")
public class JobEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="company_name")
	private String companyName;
	
	private String location;
	private double salary;
	
	public long getId() {
		return id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getLocation() {
		return location;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}

}
