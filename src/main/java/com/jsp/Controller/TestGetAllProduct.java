package com.jsp.Controller;

import com.jsp.Service.ProductService;

public class TestGetAllProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.getAllProduct();
		
		
	}

}
