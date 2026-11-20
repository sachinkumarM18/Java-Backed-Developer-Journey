package com.mini_ecommerce_jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mini_ecommerce_jdbc.config.DBConnection;
import com.mini_ecommerce_jdbc.exception.DatabaseOperationException;
import com.mini_ecommerce_jdbc.model.Product;

public class ProductRepository {

	// Adding Product Into the Database 

	public void addProduct(Product product) {
		String query = "insert into product " + "(productId, productName , category , price , stockQuantity, brand)"
				+ "values (?, ? ,? ,? ,? ,?)";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setString(3, product.getCategory());
			ps.setInt(4, product.getPrice());
			ps.setInt(5, product.getStockQuantity());
			ps.setString(6, product.getBrand());

			ps.executeUpdate();
 
			System.out.println("Product Added Successfully");
		} catch (SQLException e) {
			throw new DatabaseOperationException("Database Connection Failed.");
		}
	}

	// View all Products
	public List<Product> viewAllProducts() {

		String query = "SELECT * FROM product";

		List<Product> products = new ArrayList<>();

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {

				Product product = new Product(rs.getInt("productId"), rs.getString("productName"),
						rs.getString("category"), rs.getInt("price"), rs.getInt("stockQuantity"),
						rs.getString("brand"));

				products.add(product);
			}

		} catch (SQLException e) {
			throw new DatabaseOperationException("Failed to fetch products from database");
		}

		return products;
	}

	// Get Product by Id

	public Product getProductById(int productId) {
		String query = "select * from product where productId = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, productId);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Product(rs.getInt("productId"), rs.getString("productName"), rs.getString("category"),
							rs.getInt("price"), rs.getInt("stockQuantity"), rs.getString("brand"));
				}
			}
		} catch (SQLException e) {
			throw new DatabaseOperationException("Database connection failed!");
		}
		return null;
	}

	// Get Product by Name

	public Product getProductbyName(String productName) throws SQLException {
		String query = "select * from product where productName = ?";
		try (Connection connnection = DBConnection.getConnection();
				PreparedStatement ps = connnection.prepareStatement(query)) {
			ps.setString(1, productName);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Product(rs.getInt("productId"), rs.getString("productName"), rs.getString("category"),
							rs.getInt("price"), rs.getInt("stockQuantity"), rs.getString("brand"));
				}
			}
		}
		return null;
	}

	// Get Product By Category

	public List<Product> getProductbyCategory(String category) throws SQLException {
		String query = "select * from product where category = ?";
		List<Product> products = new ArrayList<>();

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, category);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					Product product = new Product(rs.getInt("productId"), rs.getString("productName"),
							rs.getString("category"), rs.getInt("price"), rs.getInt("stockQuantity"),
							rs.getString("brand"));
					products.add(product);
				}
			}
		}

		return products;
	}

	// Update Product Price

	public boolean updateProductPrice(int productId, int newPrice) throws SQLException {
		String query = "update product set price = ? where productId = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, newPrice);
			ps.setInt(2, productId);

			int rowsUpdated = ps.executeUpdate();
			return rowsUpdated > 0;
		}

	}

	// Update Product Stock
	public boolean updateProductStock(int productId, int newStockQuantity) throws SQLException {
		String query = "update product set stockQuantity = ? where productId = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, newStockQuantity);
			ps.setInt(2, productId);

			int rowsUpdated = ps.executeUpdate();
			return rowsUpdated > 0;

		}

	}

	// Transaction operation — used by OrderService
	public boolean updateProductStock(int productId, int newStockQuantity, Connection connection) throws SQLException {

		String query = "UPDATE product SET stockQuantity = ? WHERE productId = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, newStockQuantity);
			ps.setInt(2, productId);

			return ps.executeUpdate() > 0;
		}
	}

	// Delete Product by Id
	public boolean deleteProductById(int productId) throws SQLException {
		String query = "delete from product where productId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, productId);

			int rowsDeleted = ps.executeUpdate();
			return rowsDeleted > 0;
		}

	}

	// Get Product By Price Range
	public List<Product> getProductByPriceRange(int minPrice, int maxPrice) throws SQLException {
		String query = "select * from product where price between ? and ?";
		List<Product> products = new ArrayList<Product>();

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, minPrice);
			ps.setInt(2, maxPrice);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					Product product = new Product(rs.getInt("productId"), rs.getString("productName"),
							rs.getString("category"), rs.getInt("price"), rs.getInt("stockQuantity"),
							rs.getString("brand"));
					products.add(product);
				}
			}
		}
		return products;
	}

	// Get Product By Brand
	public List<Product> getProductsByBrand(String brand) throws SQLException {
		String query = "select * from product where brand = ?";
		List<Product> products = new ArrayList<>();
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, brand);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					Product product = new Product(rs.getInt("productId"), rs.getString("productName"),
							rs.getString("category"), rs.getInt("price"), rs.getInt("stockQuantity"),
							rs.getString("brand"));

					products.add(product);
				}
			}
		}
		return products;
	}

	// Get Available Products

	public List<Product> getAvailableProducts() throws SQLException {
		String query = "select * from product where stockQuantity > 0";

		List<Product> products = new ArrayList<>();
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Product product = new Product(rs.getInt("productId"), rs.getString("productName"),
						rs.getString("category"), rs.getInt("price"), rs.getInt("stockQuantity"),
						rs.getString("brand"));
				products.add(product);
			}
		}
		return products;
	}
}
