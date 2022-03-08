package com.example.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestapi.model.Employee;
import com.example.springrestapi.service.EmployeeService;




@RestController
public class EmployeeController {
	

	@Autowired
	private EmployeeService eService;
	
	

	
	
	@GetMapping("employees")
	public List<Employee> getEmployees() {
		return eService.getEmployees();
	}
	
	
	@GetMapping("/employeesdt/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return eService.getSingleEmployee(id);
	}
	
	@GetMapping("dlt")
    public String dlt(@RequestParam("id") Long id) {
    	return "delete the employee id:"+ id;
    }
	
	@DeleteMapping("dlte")
	public String Dlte(@RequestParam("id") Long id) {
		return "Deleted the id:"+ id;
	}
	
	
	@PostMapping("createmep")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return eService.saveEmployee(employee);
	}
	
	@PutMapping("emp/{id}")
	public String updateemp(@PathVariable Long id, @RequestBody Employee employee){
		return "emp details created:"+ employee;
	}
	
	}
	

