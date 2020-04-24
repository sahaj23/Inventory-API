package com.persistent.training.InventoryManagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.Product;
import com.persistent.training.InventoryManagement.repository.ProductRepository;
@Service
public class ProductDAO {

	@Autowired
	ProductRepository productRepository;

	public Product save(Product prod) {
		return productRepository.save(prod);
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Optional<Product> findOne(Long empid) {
		// return null;
		return productRepository.findById(empid);
	}

	public List<Product> getProdcutsByCategory(Long cid) {
		return productRepository.getProdcutsByCategory(cid);
	}

	public void delete(Product prod) {
		productRepository.delete(prod);
	}
}
