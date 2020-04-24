package com.persistent.training.InventoryManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.Order;
import com.persistent.training.InventoryManagement.repository.OrderRepository;
@Service
public class OrderDAO {
	@Autowired
	OrderRepository orderRepository;
	
	/*to save an customer*/
	
	public Order save(Order order) {
		return orderRepository.save(order);
	}
	
	
	/* search all customers*/
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
}
