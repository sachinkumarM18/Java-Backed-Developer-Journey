package com.mini_ecommerce_jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.mini_ecommerce_jdbc.exception.CategoryNotFoundException;
import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.exception.InsufficientStockException;
import com.mini_ecommerce_jdbc.exception.InvalidProductIdException;
import com.mini_ecommerce_jdbc.exception.InvalidProductPriceException;
import com.mini_ecommerce_jdbc.exception.ProductNotFoundException;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.repository.ProductRepository;

public class ProductService {
	private ProductRepository productRepository = new ProductRepository();
	private Connection connection;

	// 1. Add Product
	public void addProduct(Product product) throws SQLException { // Added throws for repository consistency
		if (product == null) {
			throw new ProductNotFoundException("Product cannot be null"); // Changed from ProductNotFoundException to
																			// IllegalArgumentException
		}

		if (product.getPrice() <= 0) { // Changed to <= 0 as price shouldn't be zero either
			throw new InvalidProductPriceException("Price must be greater than 0");
		}

		if (product.getStockQuantity() < 0) {
			throw new IllegalArgumentException("Stock quantity cannot be negative");
		}

		productRepository.addProduct(product);
		System.out.println("Product Added Successfully");
	}

	// 2. Get Product by Id
	public Product getProductById(int productId) throws SQLException { // Added throws SQLException
		if (productId <= 0) {
			throw new InvalidProductIdException("Product ID must be greater than 0");
		}

		Product product = productRepository.getProductById(productId);

		if (product == null) {
			throw new ProductNotFoundException("Error: Product ID: " + productId + " Not found");
		}

		return product;
	}

	// 3. View all Products
	public List<Product> viewAllProducts() throws SQLException {
		List<Product> products = productRepository.viewAllProducts();
		if (products.isEmpty()) {
			throw new ProductNotFoundException("Database is empty. No products found.");
		}
		return products;
	}

	// 4. Search Product By Name
	public Product getProductByName(String productName) throws SQLException {
		if (productName == null || productName.isBlank()) {
			throw new ProductNotFoundException("Product name cannot be blank");
		}

		Product product = productRepository.getProductbyName(productName.trim());

		if (product == null) {
			throw new ProductNotFoundException("Error : Product '" + productName + "' Not found");
		}
		return product;
	}

	// 5. Get Product by Category
	public List<Product> getProductByCategory(String category) throws SQLException {
		if (category == null || category.trim().isEmpty()) {
			throw new CategoryNotFoundException("Category cannot be Blank or Null"); // Changed from
																						// CategoryNotFoundException for
																						// generic standard
		}

		List<Product> products = productRepository.getProductbyCategory(category.trim());
		if (products.isEmpty()) {
			throw new CategoryNotFoundException("Error : Category '" + category + "' Not found or has no products");
		}
		return products;
	}

	// 6. Search by Brand
	public List<Product> getProductsByBrand(String brand) throws SQLException {
		if (brand == null || brand.isBlank()) {
			throw new IllegalArgumentException("Brand cannot be blank");
		}

		List<Product> products = productRepository.getProductsByBrand(brand.trim());
		if (products.isEmpty()) {
			throw new ProductNotFoundException("Error : Brand '" + brand + "' Not found");
		}
		return products;
	}

	// 7. Search Product by PriceRange
	public List<Product> getProductByPriceRange(int minPrice, int maxPrice) throws SQLException {
		if (minPrice < 0 || maxPrice < 0) {
			throw new InvalidProductPriceException("Price cannot be negative");
		}

		if (minPrice > maxPrice) {
			throw new InvalidProductPriceException("Minimum price cannot be greater than maximum price");
		}

		List<Product> products = productRepository.getProductByPriceRange(minPrice, maxPrice);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(
					"No products found within the price range: " + minPrice + " to " + maxPrice);
		}
		return products;
	}

	// 8. Update product Price
	public void updateProductPrice(int productId, int newPrice) throws SQLException {
		if (productId <= 0) {
			throw new InvalidProductIdException("Product ID must be greater than 0");
		}

		if (newPrice <= 0) {
			throw new InvalidProductPriceException("Price must be greater than 0");
		}

		boolean isUpdated = productRepository.updateProductPrice(productId, newPrice);

		if (!isUpdated) {
			throw new ProductNotFoundException(
					"Product Price has not been Updated... Because Product Id " + productId + " can't be matched");
		}
	}

	// 9. Update Product Stock
	public void updateProductStock(int productId, int newStockQuantity) throws SQLException {
		if (productId <= 0) {
			throw new ProductNotFoundException("Product ID must be greater than 0");
		}

		if (newStockQuantity < 0) {
			throw new InsufficientStockException("Stock quantity cannot be negative");
		}

		// 1. Pehle check karein ki product sach me exist karta hai ya nahi
		Product existingProduct = productRepository.getProductById(productId);

		// 2. Agar product nahi mila, toh sahi exception throw karein
		if (existingProduct == null) {
			throw new ProductNotFoundException("Stock update failed: Product not found with ID: " + productId);
		}

		// 3. Agar product mil gaya, tab repository ka use karke stock update karein
		boolean isUpdated = productRepository.updateProductStock(productId, newStockQuantity);

		if (!isUpdated) {
			throw new RuntimeException("Failed to update stock in database due to a server error.");
		}

	}

	// 10. Delete Product (FIXED OBJECT CAPTURE BEFORE DELETE)
	public Product deleteProductById(int productId) throws SQLException {
		if (productId <= 0) {
			throw new InvalidProductIdException("Product ID must be greater than 0");
		}

		// 1. Delete karne se PEHLE product ka data database se fetch karein
		Product existingProduct = productRepository.getProductById(productId);

		// 2. Agar product mila hi nahi, toh exception throw kar dein
		if (existingProduct == null) {
			throw new ProductNotFoundException("Product not Found With Id :" + productId);
		}

		// 3. Ab Repository ka boolean method call karke delete karein
		boolean isDeleted = productRepository.deleteProductById(productId);

		if (!isDeleted) {
			throw new DatabaseOperationException("Failed to delete product from database.");
		}

		// 4. Purana data return kar dein taaki user ko pata chale kya delete hua hai
		return existingProduct;
	}

	// 11. Get Available Products
	public List<Product> getAvailableProducts() throws SQLException {
		List<Product> products = productRepository.getAvailableProducts();
		if (products.isEmpty()) {
			throw new ProductNotFoundException("No products are currently in stock.");
		}
		return products;
	}

}
