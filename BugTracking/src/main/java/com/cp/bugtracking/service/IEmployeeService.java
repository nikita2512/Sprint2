package com.cp.bugtracking.service;

import java.util.List;

import com.cp.bugtracking.entities.Employee;


public interface IEmployeeService {

	public Employee deleteEmployee(long id);

	public Employee getEmployee(long id);
	
	public  List<Employee> getAllEmployees();
	
	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployee(long id, Employee employee);
}
