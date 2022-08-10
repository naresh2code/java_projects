package com.example.order.pojo;

import com.example.product.pojo.ProductPojo;

public class OrderPojo {
	private ProductPojo productPojo;
	public ProductPojo getProductPojo() {
		return productPojo;
	}
	public void setProductPojo(ProductPojo productPojo) {
		this.productPojo = productPojo;
	}
	private int orderId;
	private String orderName;
	private float orderPrice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}
}
