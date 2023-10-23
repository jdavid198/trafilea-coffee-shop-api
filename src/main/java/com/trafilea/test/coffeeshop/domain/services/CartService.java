package com.trafilea.test.coffeeshop.domain.services;

import com.trafilea.test.coffeeshop.application.dtos.CartDto;
import com.trafilea.test.coffeeshop.domain.entities.Cart;

public interface CartService{
	public Long create(CartDto cartDto);
	public Cart findById(Long cartId);
}