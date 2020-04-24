package com.persistent.training.InventoryManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.Category;
import com.persistent.training.InventoryManagement.model.Customer;
import com.persistent.training.InventoryManagement.repository.CategoryRepository;

@Service
public class CategoryDAO {

	@Autowired
	CategoryRepository categoryRepository;
	
	public Category save(Category cat) {
		return categoryRepository.save(cat);
	}
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
}
