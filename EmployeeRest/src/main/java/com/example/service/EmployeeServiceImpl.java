package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee save(Employee e) {
		return employeeRepository.save(e);
	}
	@Override
	public int getEmployeeCount(String department) {
		return employeeRepository.countByDepartment(department);
	}
	@Override
	public Object getMaxEmployee() {
		return employeeRepository.getCitiwiseEmployee();
	}
		
}
