package com.ecommerce.client;

import com.ecommerce.DAO.ProductDAOImpl;
import com.ecommerce.entity.Product;

public class ProductClient {

	public static void main(String[] args) {
		
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
		Product product = new Product("Oppo A18", 22000, "3.5",2);
		
		productDAOImpl.saveProduct(product);
	}

}
