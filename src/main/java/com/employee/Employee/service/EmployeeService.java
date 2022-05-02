package com.employee.Employee.service;

import java.util.List;

import com.employee.Employee.model.Employee;

public interface EmployeeService {

	public Employee save(Employee employee);

	public List<Employee> getEmployee();
	
	public Employee getEmployeeById(Integer id);
}
