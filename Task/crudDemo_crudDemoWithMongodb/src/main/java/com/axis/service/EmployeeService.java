package com.axis.service;
import java.util.*;
import com.axis.entity.Employee;
import com.axis.repository.EmployeeRepository;
public interface EmployeeService {

	Employee addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployeeById(int id,Employee employee);
    String deleteEmployeeById(int id);
}
