package com.eCommerce.product.service;

import java.io.Serializable;
import java.util.List;

import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;

public interface ProductService {
	
	 List<ProductEntity> getRecommendProducts();

	 ProductEntity fetchProduct();
	 
	 Serializable addProducts(ProductEntity productEntity) throws Exception;
	 
	 ProductAddUpdate updateProducts();
}
