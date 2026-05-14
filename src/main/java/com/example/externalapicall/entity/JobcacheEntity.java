package com.example.externalapicall.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jobs")
public class JobcacheEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private String company;
	
	@Column(nullable=false)
	private double salary;
	
	public JobcacheEntity() {
		
	}
	public JobcacheEntity(Long id, String title, String company, double salary) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.salary = salary;
    }
	//getters and setters
	public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
	
	

}
