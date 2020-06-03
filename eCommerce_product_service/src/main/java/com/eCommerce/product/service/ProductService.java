package com.eCommerce.product.service;

import java.util.List;

import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;

public interface ProductService {
	
	 List<ProductEntity> getRecommendProducts();

	 ProductEntity fetchProduct();
	 
	 ProductAddUpdate addProducts();
	 
	 ProductAddUpdate updateProducts();
}
