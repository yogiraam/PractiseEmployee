package com.service;

import java.util.List;

import com.entity.Employee;
import com.exceptions.ResourceNotFoundException;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee) throws ResourceNotFoundException;

	List<Employee> getAllEmployees();

	String deleteEmployee(int eid) throws ResourceNotFoundException;

}
