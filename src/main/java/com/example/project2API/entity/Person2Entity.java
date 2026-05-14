package com.example.project2API.entity;

import jakarta.persistence.*;

@Entity
@Table(name="person2")
public class Person2Entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private String gender;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String country;
	private String status;
	
	
	//getters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getStatus() {
		return status;
	}
	
	//setters
	public void setId(long id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void setStatus(String status) {
		this.status=status;
	}	

}
