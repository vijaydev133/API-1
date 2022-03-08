package com.example.springrestapi.service;

import java.util.List;

import com.example.springrestapi.model.Employee;

public interface EmployeeService {
	
	 public List<Employee> getEmployees();
	 
	 public Employee saveEmployee(Employee employee);

}
