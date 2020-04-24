package com.persistent.training.InventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persistent.training.InventoryManagement.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
