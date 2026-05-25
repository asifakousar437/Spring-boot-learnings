package com.example.Employeemanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="employees")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="name is required")
	private String name;
	
	@NotBlank(message="email is required")
	@Email(message="Enter a valid email")
	private String email;
	
	@Column(nullable=false)
	@Min(value=18,message="age must be atleast greater than 18")
	@Max(value=60,message="age must be less than 60")
	private int age;
	
	@NotBlank(message="Phone number is required")
	@Pattern(regexp = "^[0-9]{10}$",
	        message = "Phone number must contain exactly 10 digits")
	private String phone;
	
	@Column(nullable=false)
	@NotBlank(message="Address is required")
	@Size(min = 5, max = 200, message = "Address must be between 5 and 200 characters")
	private String address;
	
	@Positive(message = "Salary must be positive")
    private double salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
