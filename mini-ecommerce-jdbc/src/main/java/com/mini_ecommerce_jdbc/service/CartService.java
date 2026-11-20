package com.mini_ecommerce_jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.exception.InsufficientStockException;
import com.mini_ecommerce_jdbc.exception.InvalidCustomerIdException;
import com.mini_ecommerce_jdbc.exception.InvalidProductIdException;
import com.mini_ecommerce_jdbc.exception.InvalidQuantityException;
import com.mini_ecommerce_jdbc.exception.ProductNotFoundException;
import com.mini_ecommerce_jdbc.model.Cart;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.repository.CartRepository;
import com.mini_ecommerce_jdbc.repository.ProductRepository;

public class CartService {
	private CartRepository cartRepository = new CartRepository();
	private ProductRepository productRepository = new ProductRepository();

	public CartService() {
		this.cartRepository = new CartRepository();
		this.productRepository = new ProductRepository();
	}

	public CartService(CartRepository cartRepository, ProductRepository productRepository) {

		this.cartRepository = cartRepository;
		this.productRepository = productRepository;
	}
	
	 

	// 1. Add Product to cart
	public void addProductToCart(int customerId, int productId, int quantity) throws SQLException {

		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		if (productId <= 0) {
			throw new InvalidProductIdException("Invalid Product ID");
		}

		if (quantity <= 0) {
			throw new InvalidQuantityException("Quantity Must be Greater than 0");
		}

		Product product = productRepository.getProductById(productId);

		if (product == null) {
			throw new ProductNotFoundException("Product Not Found");
		}

		if (product.getStockQuantity() < quantity) {
			throw new InsufficientStockException("Insufficient Stock! Available Stock: " + product.getStockQuantity());
		}

		// Check whether product already exists in cart
		Cart existingCart = cartRepository.getCartItem(customerId, productId);

		if (existingCart != null) {

			int newQuantity = existingCart.getQuantity() + quantity;

			if (newQuantity > product.getStockQuantity()) {
				throw new InsufficientStockException(
						"Insufficient Stock! Available Stock: " + product.getStockQuantity());
			}

			boolean updated = cartRepository.updateCartQuantity(customerId, productId, newQuantity);

			if (!updated) {
				throw new DatabaseOperationException("Failed to update cart");
			}

			System.out.println("Product quantity updated in cart successfully.");

		} else {

			boolean added = cartRepository.addToCart(new Cart(customerId, productId, quantity));

			if (!added) {
				throw new DatabaseOperationException("Failed to add product to cart");
			}

			System.out.println("Product added to cart successfully.");
		}
	}

	// 2. Delete Product from Cart
	public void deleteProductFromCart(int customerId, int productId) throws SQLException {
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		if (productId <= 0) {
			throw new InvalidProductIdException("Invalid Product ID");
		}

		boolean isDeleted = cartRepository.deleteFromCart(customerId, productId);
		if (!isDeleted) {
			throw new ProductNotFoundException("Product Not Found in Your Cart");
		}
		System.out.println("Product Successfully Delete From Cart");
	}

	// 3. View Customer Active Cart Processing
	public List<Cart> getCustomerCart(int customerId) throws SQLException {
		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		List<Cart> cart = cartRepository.viewCart(customerId);
		if (cart.isEmpty()) {
			throw new ProductNotFoundException("Product Not Found! , Cart is Empty");
		}
		return cart;
	}

	// update Product Quantity in Cart
	public void updateCartQuantity(int customerId, int productId, int quantity) throws SQLException {

		if (customerId <= 0) {
			throw new InvalidCustomerIdException("Invalid Customer ID");
		}

		if (productId <= 0) {
			throw new InvalidProductIdException("Invalid Product ID");
		}

		if (quantity <= 0) {
			throw new InvalidQuantityException("Quantity must be greater than 0");
		}

		Product product = productRepository.getProductById(productId);

		if (product == null) {
			throw new ProductNotFoundException("Product not found with ID: " + productId);
		}

		if (quantity > product.getStockQuantity()) {
			throw new InsufficientStockException("Insufficient Stock! Available Stock: " + product.getStockQuantity());
		}

		Cart existingCart = cartRepository.getCartItem(customerId, productId);

		if (existingCart == null) {
			throw new ProductNotFoundException("Product not found in your cart.");
		}

		boolean updated = cartRepository.updateCartQuantity(customerId, productId, quantity);

		if (!updated) {
			throw new DatabaseOperationException("Failed to update cart quantity.");
		}

		System.out.println("Cart quantity updated successfully.");
	}
}
