package com.persistent.training.InventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persistent.training.InventoryManagement.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
