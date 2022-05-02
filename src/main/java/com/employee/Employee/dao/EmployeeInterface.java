package com.employee.Employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Employee.model.Employee;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee, Integer>{

}
