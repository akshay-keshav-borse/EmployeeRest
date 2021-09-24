package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeRestController {
  
	@Autowired
    private EmployeeService EmployeeService;
	
	@PostMapping("/saveEmployee")  
	private String saveEmployee(@RequestBody Employee employee)   
	{      
		Employee e=EmployeeService.save(employee);
	      return "Employee Save with "+e.getEmployee_id();
	}  
	
	@PutMapping("/updateEmployee")  
	private Employee update(@RequestBody Employee employee)   
	{  
		 return EmployeeService.save(employee);
	} 
	
	@GetMapping("/count/{department}")  
	private int getEmployeeCount(@PathVariable("department") String department)   
	{  
		return EmployeeService.getEmployeeCount(department);
 	}  
	
	@GetMapping("/getCitiwiseEmployee")  
	private Object getMaxEmployee()   
	{  
		Object ob=EmployeeService.getMaxEmployee();
	    return ob; 
 	}  
	
}
