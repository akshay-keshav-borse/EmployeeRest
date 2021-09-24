package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
	  int countByDepartment(String department);
	  @Query(value="SELECT city,count(city) FROM employee GROUP BY city ORDER BY count(city) desc LIMIT 1",nativeQuery=true)
	  Object getCitiwiseEmployee();
}
