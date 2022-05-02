package com.employee.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee.model.Employee;
import com.employee.Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//Save an Employee
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.save(employee);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	//Get all Employees
	@GetMapping("/getEmployees")
	public ResponseEntity<?> getEmployee() {
		List<Employee> emp = employeeService.getEmployee();
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	//Get Employee By ID
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable String id) {
		Employee emp = employeeService.getEmployeeById(Integer.parseInt(id));
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
}
