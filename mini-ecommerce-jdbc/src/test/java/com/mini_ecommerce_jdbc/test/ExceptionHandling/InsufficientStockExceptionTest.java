package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.InsufficientStockException;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.repository.CartRepository;
import com.mini_ecommerce_jdbc.repository.ProductRepository;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.ProductService;

public class InsufficientStockExceptionTest {
	CartService cartService = new CartService();
	ProductService productService = new ProductService();

	@Test
	void shouldThrowInsufficientStockWhenAddingMoreThanAvailableStock() throws SQLException {

		ProductRepository productRepository = mock(ProductRepository.class);
		CartRepository cartRepository = mock(CartRepository.class);

		CartService cartService = new CartService(cartRepository, productRepository);

		Product product = new Product(501, "Laptop", "Electronics", 50000, 5, "Dell");

		when(productRepository.getProductById(501)).thenReturn(product);

		assertThrows(InsufficientStockException.class, () -> cartService.addProductToCart(101, 501, 10));
	}

	@Test
	void shouldThrowInsufficientStockWhenStockQuantityIsNegative() throws SQLException {

		assertThrows(InsufficientStockException.class, () -> productService.updateProductStock(101, -1));
	}
}
