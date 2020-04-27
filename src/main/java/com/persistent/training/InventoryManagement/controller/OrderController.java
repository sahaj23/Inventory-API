package com.persistent.training.InventoryManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.OrderDAO;
import com.persistent.training.InventoryManagement.model.Order;
@RestController
@RequestMapping("/")
public class OrderController {
	
	@Autowired
	OrderDAO orderDAO;

	@PostMapping("/orders")
	public Order createOrder(@Valid @RequestBody Order order) {
		System.out.println("Order create called");
		return orderDAO.save(order);
	}

	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		return orderDAO.findAll();
	}
}
