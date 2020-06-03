package com.eCommerce.product.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.product.entity.ProductAddUpdate;
import com.eCommerce.product.entity.ProductEntity;
import com.eCommerce.product.repository.ProductMgmtRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMgmtRepo repo;

	@Override
	public List<ProductEntity> getRecommendProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity fetchProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable addProducts(ProductEntity productEntity) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(productEntity); 
//		return null;
	}

	@Override
	public ProductAddUpdate updateProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
