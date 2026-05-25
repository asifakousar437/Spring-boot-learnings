package com.example.Employeemanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.example.Employeemanagement.entity.EmployeeEntity;
import com.example.Employeemanagement.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeService employeeService;
	
	 public EmployeeController(EmployeeService employeeService) {
	        this.employeeService = employeeService;
	    }

	    // CREATE
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public EmployeeEntity createEmployee(@Valid @RequestBody EmployeeEntity employee) {
	        return employeeService.createEmployee(employee);
	    }

	    // GET ALL
	    @GetMapping
	    public List<EmployeeEntity> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    // GET BY ID
	    @GetMapping("/{id}")
	    public EmployeeEntity getEmployeeById(@PathVariable Long id) {
	        return employeeService.getEmployeeById(id);
	    }

	    // UPDATE
	    @PutMapping("/{id}")
	    public EmployeeEntity updateEmployee(@PathVariable Long id,
	                                   @Valid @RequestBody EmployeeEntity employee) {

	        return employeeService.updateEmployee(id, employee);
	    }

	    // DELETE
	    @DeleteMapping("/{id}")
	    public String deleteEmployee(@PathVariable Long id) {

	    	employeeService.deleteEmployee(id);

	        return "Employee deleted successfully";
	    }
}
