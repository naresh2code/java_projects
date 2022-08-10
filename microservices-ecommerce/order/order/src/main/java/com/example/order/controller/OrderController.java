package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.order.pojo.OrderPojo;
import com.example.product.pojo.ProductPojo;


@RestController
@RequestMapping(path="/order")
public class OrderController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping(path="/getOrder", produces="application/json")
	public OrderPojo getOrder() {
		OrderPojo orderPojo=new OrderPojo();
		
		orderPojo.setOrderId(11);
		
		ProductPojo productPojo = restTemplate.getForObject("http://Product-SERVICES/product/getProduct",
				ProductPojo.class);
		orderPojo.setOrderName(productPojo.getProductName());
		orderPojo.setOrderPrice(productPojo.getProductPrice());
		orderPojo.setProductPojo(productPojo);

		return orderPojo;
	}
}
