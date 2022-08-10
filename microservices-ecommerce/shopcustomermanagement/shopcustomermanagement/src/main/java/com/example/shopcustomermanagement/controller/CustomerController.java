package com.example.shopcustomermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.order.pojo.OrderPojo;
import com.example.shopcustomermanagement.pojo.CustomerPojo;

@RestController
@RequestMapping(path="/customer")
public class CustomerController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping(path="/getCustomer", produces="application/json")
	public CustomerPojo getCustomer() {
		CustomerPojo customerPojo=new CustomerPojo();
		customerPojo.setCustomerName("John");
		OrderPojo orderPojo = restTemplate.getForObject("http://ORDER-SERVICES/order/getOrder",
				OrderPojo.class);
		customerPojo.setOrderPojo(orderPojo);
		return customerPojo;
	}
}
