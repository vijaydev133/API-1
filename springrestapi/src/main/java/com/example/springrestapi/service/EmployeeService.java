package com.example.springrestapi.service;

import java.util.List;

import com.example.springrestapi.model.Employee;

public interface EmployeeService {
	
	 public List<Employee> getEmployees(); //for get list of emp
	 
	 public Employee saveEmployee(Employee employee); // for creating a new employee (post)
	 
	public Employee getSingleEmployee(Long id);

}
