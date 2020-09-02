package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	
	@GetMapping("/register")
	public String showPage(Model model) {
		model.addAttribute("employee", new Employee());
		return "RegisterPage";
		
		
	}
	
	
	
	@PostMapping("/create")
	public String saveEmployee(@ModelAttribute Employee e,Model model) {
		Integer id=service.saveEmployee(e);
		String message="Employee '"+id+"' saved";
		model.addAttribute("message", message);
		model.addAttribute("employee", new Employee());
		return "RegisterPage";
		
	}
	
	@GetMapping("/all")
	public String getAllEmployees(Model  model) {
		List<Employee>list=service.getAllEmployees();
		model.addAttribute("list",list );
		return "EmployeeData";
		
		
	}
	@RequestMapping("/delete")
	public String removeEmployeeById(@RequestParam Integer id) {
		service.deleteEmployee(id);
		return "redirect:all";
		
	}
	
	
	@RequestMapping("/edit")
	public String EditEmployee(@RequestParam Integer id,Model model) {
		Employee emp=service.getEmployeetById(id);
		model.addAttribute("emp", emp);
		model.addAttribute("Mode","EDIT");
		return "RegisterPage";
		
	}
}
