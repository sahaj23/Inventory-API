package com.persistent.training.InventoryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.persistent.training.InventoryManagement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query(value = "SELECT * FROM products WHERE cid = :cid", nativeQuery = true)
	List<Product> getProdcutsByCategory(Long cid);
}
