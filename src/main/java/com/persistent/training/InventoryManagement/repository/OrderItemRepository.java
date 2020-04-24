package com.persistent.training.InventoryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.persistent.training.InventoryManagement.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	@Query(value = "SELECT * FROM order_items WHERE oid = :id", nativeQuery = true)
	List<OrderItem> getOrdersByOrderId(Long id);
}
