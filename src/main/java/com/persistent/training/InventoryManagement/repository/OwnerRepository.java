package com.persistent.training.InventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.persistent.training.InventoryManagement.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

	@Query(value = "SELECT * FROM owner WHERE user_name = :name and password= :password", nativeQuery = true)
	Owner ownerLogin(String name,String password);
}
