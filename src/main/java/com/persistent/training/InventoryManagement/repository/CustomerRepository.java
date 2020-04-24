package com.persistent.training.InventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persistent.training.InventoryManagement.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
