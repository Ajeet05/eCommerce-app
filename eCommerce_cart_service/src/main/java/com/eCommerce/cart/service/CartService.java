package com.eCommerce.cart.service;

import java.util.List;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartEntity;



public interface CartService {
	
	List<CartEntity> fetchCart();
	
	CartAddUpdate createCart();
	
	CartAddUpdate updateCart();

}
