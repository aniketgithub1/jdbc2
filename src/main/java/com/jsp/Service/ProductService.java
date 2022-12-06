package com.jsp.Service;

import com.jsp.ProductDao.ProductDao;
import com.jsp.ProductDto.Product;

public class ProductService {

	public Product saveProduct(Product product) {
		ProductDao productDao = new ProductDao();
		Product product2 = productDao.saveProduct(product);
		
		return product2;
	}
	
	public void updateProduct() {
		
		ProductDao productDao = new ProductDao();
		productDao.updateProduct();
		
	}
	
	public void deleteProduct() {
		ProductDao productDao = new ProductDao();
		productDao.deleteProduct();
	}
	
	public void getProductById() {
		ProductDao productDao = new ProductDao();
		productDao.getProductById();
		
	}
	public void getAllProduct() {
		ProductDao productDao = new ProductDao();
		productDao.getAllProduct();
		
	}
}
