package com.jsp.Controller;

import com.jsp.Service.ProductService;

public class TestDeleteProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		
		productService.deleteProduct();
		
	}

}
