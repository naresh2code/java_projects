package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.pojo.ProductPojo;



@RestController
@RequestMapping(path="/product")
public class ProductController {
	
	@GetMapping(path="/getProduct", produces="application/json")
	public ProductPojo getProduct() {
		ProductPojo productPojo=new ProductPojo();
		productPojo.setProductId(101);
		productPojo.setProductName("Vivo");
		productPojo.setProductPrice(32000);
		productPojo.setProductColor("black");
		productPojo.setProductQuantity(3);
		return productPojo;
	}
}
