package com.eCommerce.product.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.product.entity.ProductEntity;
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
	public Serializable addProducts(@RequestBody ProductEntity productEntity) throws Exception {
		return productService.addProducts(productEntity);
//		return "MB_select";
	}
	
	@PutMapping("/update/products")
	public String updateProducts(@RequestBody AddUpdateProductRequestBean addUpdateProductRequestBean) {
		productService.updateProducts();
		return "MB_select";
	}

}
