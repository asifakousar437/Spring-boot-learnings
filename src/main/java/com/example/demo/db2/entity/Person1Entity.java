package com.example.demo.db2.entity;

import jakarta.persistence.*;

@Entity
@Table(name="person1")
public class Person1Entity {
	@Id
	private Long id;
	
	private int age;
	private String city;
	private String country;
	private String email;
	private String gender;
	private String name;
	private String phone;
	private String state;
	private String status;
	
	public Long getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getState() {
		return state;
	}
	public String getStatus() {
		return status;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setStatus(String status) {
		this.status=status;
	}

}
