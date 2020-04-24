package com.persistent.training.InventoryManagement.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.persistent.training.InventoryManagement.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	@Query("SELECT * from employees where id=?1")
	@Query(value = "SELECT * FROM employees WHERE name = :name", nativeQuery = true)
	List<Employee> getAllEmployeesWithSameId(String name);
}