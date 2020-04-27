package com.persistent.training.InventoryManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.training.InventoryManagement.model.OrderItem;
import com.persistent.training.InventoryManagement.repository.OrderItemRepository;
@Service
public class OrderItemDAO {
	@Autowired
	OrderItemRepository orderItemRepository;
	
	/*to save an customer*/
	
	public OrderItem save(OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}
	
	
	/* search all customers*/
	
	public List<OrderItem> getOrdersByOrderId(long id){
		return orderItemRepository.getOrdersByOrderId(id);
	}


	public List<OrderItem> findAll() {
		
		return orderItemRepository.findAll();
	}
}
