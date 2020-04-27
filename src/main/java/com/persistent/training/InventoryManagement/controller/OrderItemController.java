package com.persistent.training.InventoryManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.training.InventoryManagement.dao.OrderItemDAO;
import com.persistent.training.InventoryManagement.model.OrderItem;
@RestController
@RequestMapping("/")
public class OrderItemController {

	@Autowired
	OrderItemDAO orderItemDAO;

	@PostMapping("/order-item")
	public OrderItem createOrder(@Valid @RequestBody OrderItem orderItem) {
		System.out.println("Order-item create called");
		return orderItemDAO.save(orderItem);
	}

	@GetMapping("/order-item")
	public List<OrderItem> getAllOrderItems() {
		System.out.println("customers");
		return orderItemDAO.findAll();
	}
	@GetMapping("/order-item/{id}")
	public List<OrderItem> getOrdersByOrderId(@PathVariable(value = "id")long id) {
		return orderItemDAO.getOrdersByOrderId(id);
	}
}
