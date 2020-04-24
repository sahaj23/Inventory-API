package com.persistent.training.InventoryManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.Employee;
import com.persistent.training.InventoryManagement.repository.EmployeeRepository;


@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*to save an employee*/
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	
	/* search all employees*/
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Employee findOne(Long empid) {
		return null;
//		return employeeRepository.findById(empid);
	}
	public List<Employee> getAllEmployeesWithSameId(String name){
		return employeeRepository.getAllEmployeesWithSameId(name);
	}
	
	/*delete an employee*/
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	

}
