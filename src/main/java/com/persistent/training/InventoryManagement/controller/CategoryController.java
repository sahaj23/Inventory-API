package com.persistent.training.InventoryManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.CategoryDAO;
import com.persistent.training.InventoryManagement.model.Category;

@RestController
@RequestMapping("/")
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@PostMapping("/categories")
	public Category createCustomer(@Valid @RequestBody Category cat) {
		return categoryDAO.save(cat);
	}
	
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return categoryDAO.findAll();
	}
}
