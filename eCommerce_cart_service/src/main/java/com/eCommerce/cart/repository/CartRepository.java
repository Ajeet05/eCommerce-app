package com.eCommerce.cart.repository;

import java.util.List;

import com.eCommerce.cart.entity.CartAddUpdate;
import com.eCommerce.cart.entity.CartEntity;

public interface CartRepository {
	
    List<CartEntity> fetchCart();
	
	CartAddUpdate createCart();
	
	CartAddUpdate updateCart();

}
