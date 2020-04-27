package com.persistent.training.InventoryManagement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.ProductDAO;
import com.persistent.training.InventoryManagement.model.Product;

@RestController
@RequestMapping("/")
public class ProductController {
	@Autowired
	ProductDAO productDAO;

	/* to save an employee */
	@PostMapping("/products")
	public Product createProduct(@Valid @RequestBody Product prod) {
		System.out.println("Product create called");
		return productDAO.save(prod);
	}

	/* get all employees */
	@GetMapping("/products")
	public List<Product> getAllProdcuts() {
		return productDAO.findAll();
	}

	/* get employee by empid */
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Long prodId) {
		System.out.println("Product getbyid called");
		Optional<Product> prod = productDAO.findOne(prodId);

		if (prod == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(prod.get());

	}
	
	@GetMapping("/products/category/{id}")
	public List<Product> getProdcutsByCategory(@PathVariable(value = "id") Long cid) {
		return productDAO.getProdcutsByCategory(cid);
	}

	
	

	/* Delete an employee */
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable(value = "id") Long prodId) {

		Optional<Product> prod = productDAO.findOne(prodId);
		if (prod == null) {
			return ResponseEntity.notFound().build();
		}
		productDAO.delete(prod.get());

		return ResponseEntity.ok().build();

	}

}
