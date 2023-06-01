package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Employee;
import com.exceptions.ResourceNotFoundException;
import com.repo.EmployeeRepo;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

//	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
//		this.employeeRepo = employeeRepo;
//	}
//
//	public EmployeeServiceImpl() {
//	}

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) throws ResourceNotFoundException {
		Employee e = employeeRepo.findById(employee.geteId())
				.orElseThrow(() -> new ResourceNotFoundException("Employee Not Fount with Id :" + employee.geteId()));
		employeeRepo.delete(e);
		return employeeRepo.save(employee);
		

	}

	@Override
	public String deleteEmployee(int eid) throws ResourceNotFoundException {
		Employee e = employeeRepo.findById(eid)
				.orElseThrow(() -> new ResourceNotFoundException("Employee Not Fount with Id :" + eid));
		employeeRepo.delete(e);
		return "employee with id " + eid + "has deleted";
	}

}
