package com.eCommerce.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.product.request.bean.AddUpdateProductRequestBean;
import com.eCommerce.product.service.ProductService;

@RestController
@RequestMapping("/api/product-mgmt")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products/recommendations")
	public String getRecommendProducts() {
		productService.getRecommendProducts();
		return "MB_select";
	}
	
	@GetMapping("/fetch/products")
	public String getProduct() {
		productService.fetchProduct();
		return "MB_select";
	}
	
	@PostMapping("/add/products")
	public String addProducts(@RequestBody AddUpdateProductRequestBean addUpdateProductRequestBean) {
		productService.addProducts();
		return "MB_select";
	}
	
	@PutMapping("/update/products")
	public String updateProducts(@RequestBody AddUpdateProductRequestBean addUpdateProductRequestBean) {
		productService.updateProducts();
		return "MB_select";
	}

}
