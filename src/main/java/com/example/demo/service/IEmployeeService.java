package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee e);
	List<Employee>getAllEmployees();
	void deleteEmployee(Integer id);
	public Employee getEmployeetById(Integer id);

}
