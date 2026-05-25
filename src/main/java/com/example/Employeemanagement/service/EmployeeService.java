package com.example.Employeemanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.Employeemanagement.entity.EmployeeEntity;
import com.example.Employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }

    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(Long id) {

        return employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with id : " + id));
    }

    public EmployeeEntity updateEmployee(Long id, EmployeeEntity updatedEmployee) {

        EmployeeEntity employee = getEmployeeById(id);

        employee.setName(updatedEmployee.getName());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setAge(updatedEmployee.getAge());
        employee.setPhone(updatedEmployee.getPhone());
        employee.setAddress(updatedEmployee.getAddress());
        employee.setSalary(updatedEmployee.getSalary());

        return employeeRepository.save(employee);
    }
    public String deleteEmployee(Long id) {

        EmployeeEntity employee = getEmployeeById(id);

        employeeRepository.delete(employee);

        return "Employee deleted successfully";
    }

}
