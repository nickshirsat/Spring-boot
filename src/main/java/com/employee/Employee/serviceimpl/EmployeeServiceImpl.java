package com.employee.Employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Employee.dao.EmployeeInterface;
import com.employee.Employee.model.Employee;
import com.employee.Employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeInterface employeeDAO;
	
	public Employee save(Employee employee) {
		Employee emp = employeeDAO.save(employee);
		return emp;
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> emp = employeeDAO.findAll();
		return emp;
	}
	
	public Employee getEmployeeById(Integer id) {
		Employee emp = employeeDAO.findById(id).get();
		return emp;
	}
	
}
