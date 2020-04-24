package com.persistent.training.InventoryManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.Owner;
import com.persistent.training.InventoryManagement.repository.OwnerRepository;
@Service
public class OwnerDAO {

	@Autowired
	OwnerRepository ownerRepository;
	
	
	public  boolean login(Owner owner) {
		return ownerRepository.ownerLogin(owner.getUserName(),owner.getPassword())==null?false:true;
	}
}

