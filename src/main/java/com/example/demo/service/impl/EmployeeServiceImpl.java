package com.example.demo.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		
		return repo.save(e).getId();
	}
	
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	
	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}
	
	@Override
	public Employee getEmployeetById(Integer id) {
		
		return repo.getEmployeeById(id);
	}

}
