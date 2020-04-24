package com.persistent.training.InventoryManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.CustomerDAO;
import com.persistent.training.InventoryManagement.model.Customer;

@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;

	@PostMapping("/customers")
	public Customer createCustomer(@Valid @RequestBody Customer cust) {
		return customerDAO.save(cust);
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerDAO.findAll();
	}
}
