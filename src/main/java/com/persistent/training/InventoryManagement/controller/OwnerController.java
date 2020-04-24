package com.persistent.training.InventoryManagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.OwnerDAO;
import com.persistent.training.InventoryManagement.model.Owner;
@RestController
@RequestMapping("/")
public class OwnerController {

	@Autowired
	OwnerDAO ownerDAO;

	@PostMapping("/owner")
	public boolean login(@Valid @RequestBody Owner owner) {
		return ownerDAO.login(owner);
	}
}
