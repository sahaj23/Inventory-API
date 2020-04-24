package com.persistent.training.InventoryManagement.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.persistent.training.InventoryManagement.dao.OrderItemId;

@Entity
@Table(name="Order_items")
@EntityListeners(AuditingEntityListener.class)
@IdClass(OrderItemId.class)
public class OrderItem implements Serializable {
	@Id
	private Long oid;
	@Id
	private Long pid;
	//Denormalize to reduce network calls
	private String pName;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	private int quantity;
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	private float total;
}
