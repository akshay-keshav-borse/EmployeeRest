package com.example.service;

import com.example.model.Employee;

public interface EmployeeService {
	public Employee save(Employee e);

	public int getEmployeeCount(String department);

	public Object getMaxEmployee();
}
