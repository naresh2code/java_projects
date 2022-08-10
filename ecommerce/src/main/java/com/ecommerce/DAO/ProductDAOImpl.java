package com.ecommerce.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ecommerce.entity.Product;


public class ProductDAOImpl {

	public void saveProduct(Product product) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("onlineShopping");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity
			product.setProductname(product.getProductname());
			product.setProductPrice(product.getProductPrice());
			product.setProductRating(product.getProductRating());
			product.setProductQuantity(product.getProductQuantity());
			// save call
			entityManager.persist(product);

			transaction.commit();
			entityManager.close();

			System.out.println("--Product added successfully--");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}
}
