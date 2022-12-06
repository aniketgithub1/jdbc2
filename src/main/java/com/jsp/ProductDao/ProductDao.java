package com.jsp.ProductDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.ProductDto.Product;




public class ProductDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aniket");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
           //==========TO SAVE THE PRODUCT==========
	
	public Product saveProduct(Product product) {
		
	
		
		if(product !=null) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		System.out.println("product inserted");
	    }
		else {
			System.out.println("not inserted");
		}
		return product;
	}
	
//============TO *UPDATE* THE PRODUCT============  

	public void updateProduct() {
		
		Product product1=entityManager.find(Product.class, 6);
		product1.setName("watch");
		
		if(product1 !=null) {
		entityTransaction.begin();
		entityManager.merge(product1);
		entityTransaction.commit();
		System.out.println("VALUE UPDATED");
	    }
		else {
			System.out.println("VALUE NOT UPDATED");
		}
		
	}
	        
	
	//=========TO *DELETE* THE PRODUCT=========
	public void deleteProduct() {
				
		Product product1 = entityManager.find(Product.class,1);

		if(product1!= null) {
			entityTransaction.begin();
			entityManager.remove(product1);
			entityTransaction.commit();
			System.out.println(" object with above id deleted");
           }
		else {
			System.out.println("No found");
		}
		}
	//=========TO *GET PRODUCT* THE PRODUCT=========
	public Product getProductById() {
		
		Product product = entityManager.find(Product.class,1);
		if(product!=null) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getBrand());
			System.out.println(product.getPrice());
		}else {
			System.out.println("not found");
		}
		return product;
	}

	//=========TO *GETALL PRODUCT* THE PRODUCT=========
	
	
	public void getAllProduct() {
	String sql= "select p FROM Product p";
	Query query=entityManager.createQuery(sql);
	List<Product> products =query.getResultList();
	
	for(Product p: products) {
		System.out.println("===============");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
	}

}
}