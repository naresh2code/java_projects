package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue
	private int productId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private float productPrice;

	@Column(name = "product_rating")
	private String productRating;
	
	@Column(name = "product_quantity")
	private int productQuantity;

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Product(String productName, float productPrice, String productRating,int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productRating = productRating;
		this.productQuantity=productQuantity;
	}

	public String getProductname() {
		return productName;
	}

	public void setProductname(String productname) {
		this.productName = productname;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductRating() {
		return productRating;
	}

	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}

	@Override
	public String toString() {
		return "Product { productId=" + productId + ", productname=" + productName + ", productPrice=" + productPrice
				+ ", productRating=" + productRating + "productQuantity= "+productQuantity+"]";
	}

}
