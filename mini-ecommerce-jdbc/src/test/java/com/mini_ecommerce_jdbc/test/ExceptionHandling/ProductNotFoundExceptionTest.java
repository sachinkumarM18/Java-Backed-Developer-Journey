package com.mini_ecommerce_jdbc.test.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.exception.ProductNotFoundException;
import com.mini_ecommerce_jdbc.repository.CartRepository;
import com.mini_ecommerce_jdbc.repository.ProductRepository;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.ProductService;

public class ProductNotFoundExceptionTest {
	CartService cartService = new CartService();
	ProductService productService = new ProductService();

	@Test
	void shouldThrowProductNotFoundWhenCartIsEmpty() throws SQLException {

		CartRepository cartRepository = mock(CartRepository.class);
		ProductRepository productRepository = mock(ProductRepository.class);

		CartService cartService = new CartService(cartRepository, productRepository);

		when(cartRepository.viewCart(101)).thenReturn(Collections.emptyList());

		assertThrows(ProductNotFoundException.class, () -> cartService.getCustomerCart(101));
	}

	@Test
	void shouldThrowProductNotFoundWhenProductIsNull() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.addProduct(null));
	}

	@Test
	void shouldThrowProductNotFoundWhenBrandDoesNotExist() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.getProductsByBrand("UnknownBrandXYZ"));
	}

	@Test
	void shouldThrowProductNotFoundWhenNoProductExistsInPriceRange() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.getProductByPriceRange(9999999, 10000000));
	}

	@Test
	void shouldThrowProductNotFoundWhenUpdatingPriceOfUnknownProduct() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.updateProductPrice(999999, 50000));
	}

	@Test
	void shouldThrowProductNotFoundWhenUpdatingStockWithInvalidId() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.updateProductStock(0, 10));
	}

	@Test
	void shouldThrowProductNotFoundWhenUpdatingStockOfUnknownProduct() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.updateProductStock(999999, 10));
	}

	@Test
	void shouldThrowProductNotFoundWhenDeletingUnknownProduct() throws SQLException {

		assertThrows(ProductNotFoundException.class, () -> productService.deleteProductById(999999));
	}
}
