package com.example.springrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrestapi.model.Employee;
import com.example.springrestapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	 private EmployeeRepository eRepository;
	@Override
	public List<Employee> getEmployees() {
		
		return eRepository.findAll();
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return eRepository.save(employee);
	}
	
}
