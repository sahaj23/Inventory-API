package com.persistent.training.InventoryManagement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.CustomerDAO;
import com.persistent.training.InventoryManagement.model.Customer;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;
	//@CrossOrigin(origins = "*")
	@PostMapping("/customers")
	public Customer createCustomer(@Valid @RequestBody Customer cust) {
		System.out.println(cust);
		return customerDAO.save(cust);
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getProductById(@PathVariable(value = "id") Long custId) {
		System.out.println("Product getbyid called");
		Optional<Customer> cust = customerDAO.findOne(custId);

		if (cust == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(cust.get());

	}
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		System.out.println("customers");
		return customerDAO.findAll();
	}
}
