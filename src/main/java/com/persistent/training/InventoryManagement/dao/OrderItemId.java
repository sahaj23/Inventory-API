package com.persistent.training.InventoryManagement.dao;

import java.io.Serializable;

public class OrderItemId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long oid,pid;

	public OrderItemId(long oid, long pid) {
		super();
		this.oid = oid;
		this.pid = pid;
	}

	public OrderItemId() {
		super();
	}
	
}
