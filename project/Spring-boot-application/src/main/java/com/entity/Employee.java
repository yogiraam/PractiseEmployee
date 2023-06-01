package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int eId;

	@NotBlank(message = "Employee Shouldn't be Null or Blank(' ') ")
	// @Pattern(regexp = "^[a-zA-Z]",message = "Employee Name Should be contains
	// only alphabets")
	private String eName;

	private double salary;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}

	public Employee(int eId, @NotBlank(message = "Employee Shouldn't be Null or Blank(' ') ") String eName,
			double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	
}
