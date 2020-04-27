package com.persistent.training.InventoryManagement.dao;
import java.util.List;
import java.util.Optional;

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
	
	public Optional<Customer> findOne(Long custId) {
		// return null;
		return customerRepository.findById(custId);
	}
	/* search all customers*/
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	
	
}
