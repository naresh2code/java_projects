package com.example.shopcustomermanagement.pojo;

import com.example.order.pojo.OrderPojo;

public class CustomerPojo {
	private OrderPojo orderPojo;
	private String customerName;
	public OrderPojo getOrderPojo() {
		return orderPojo;
	}
	public void setOrderPojo(OrderPojo orderPojo) {
		this.orderPojo = orderPojo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
