package com.persistent.training.InventoryManagement.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.Customer;
import com.persistent.training.InventoryManagement.repository.CustomerRepository;
@Service
public class CustomerDAO {

	@Autowired
	CustomerRepository customerRepository;
	
	/*to save an customer*/
	
	public Customer save(Customer cust) {
		return customerRepository.save(cust);
	}
	
	
	/* search all customers*/
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
	
}
