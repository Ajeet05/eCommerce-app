package com.eCommerce.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.cart.service.CartService;

@RestController
@RequestMapping("/api/cart-mgmt")
public class CartController {
	
	@Autowired
	CartService cartService;

	@GetMapping("/api/cart")
	public String getName() {
		return "cart1 & cart2";
	}

	@GetMapping("/fetch/cart")
	public String fetchCart() {
		cartService.fetchCart();
		return "MB_select";
	}
	
	@PostMapping("/create/cart")
	public String createCart() {
		cartService.createCart();
		return "MB_select";
	}
	
	@PutMapping("/update/cart")
	public String updateCartt() {
		cartService.updateCart();
		return "MB_select";
	}
}
