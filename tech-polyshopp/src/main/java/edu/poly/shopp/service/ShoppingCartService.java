package edu.poly.shopp.service;

import java.util.Collection;

import edu.poly.shopp.domain.CartItem;



public interface ShoppingCartService {

	int getCont();

	double getAmont();

	void update(Long productId, int quantity);

	void clear();

	Collection<CartItem> getCartItems();

	void remove(Long productId);

	void add(CartItem item);




}
