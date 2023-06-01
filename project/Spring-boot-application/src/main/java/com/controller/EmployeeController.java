package com.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.exceptions.ResourceNotFoundException;
import com.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
     
	@PostMapping("/add")
	public Employee add(@Valid @RequestBody Employee employee) {
	
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/get-all")
	public List<Employee> getAll() {
		return employeeService.getAllEmployees();
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) throws ResourceNotFoundException  {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/delete/{eId}")
	public String deleteEmployee(@PathVariable int eId) throws ResourceNotFoundException {
		
		return employeeService.deleteEmployee(eId);
	}

}
