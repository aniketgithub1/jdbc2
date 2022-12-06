package com.jsp.Controller;

import com.jsp.ProductDto.Product;
import com.jsp.Service.ProductService;

public class TestSaveProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		Product product =new Product();
		
		product.setName("fortuner");
		product.setBrand("toyota");
        
        product.setPrice(4000000);
		
        product.setType("SUV");
		
		
		
		productService.saveProduct(product);
		
	}

}
