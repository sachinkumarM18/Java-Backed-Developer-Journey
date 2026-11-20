package com.mini_ecommerce_jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mini_ecommerce_jdbc.config.DBConnection;
import com.mini_ecommerce_jdbc.model.Cart;

public class CartRepository {

	// Add item to cart Table
	public boolean addToCart(Cart cart) throws SQLException {
		String query = "insert into cart (customerId , productId , quantity) values (? , ? , ?)";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, cart.getCustomerId());
			ps.setInt(2, cart.getProductId());
			ps.setInt(3, cart.getQuantity());
			return ps.executeUpdate() > 0;
		}
	}

	// 2. Delete from Cart 
	public boolean deleteFromCart(int customerId, int productId) throws SQLException {
		String query = "delete from cart where customerId = ? and productId = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, customerId);
			ps.setInt(2, productId);
			return ps.executeUpdate() > 0;
		}
	}

	// 3. View Total Items in Cart
	public List<Cart> viewCart(int customerId) throws SQLException {
		List<Cart> cart = new ArrayList<>();
		String query = "SELECT c.cartId, c.customerId, c.productId, c.quantity, p.price "
				+ "FROM cart c JOIN product p ON c.productId = p.productId WHERE c.customerId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, customerId);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					cart.add(new Cart(rs.getInt("cartId"), rs.getInt("customerId"), rs.getInt("productId"),
							rs.getInt("quantity")));
				}
			}
		}
		return cart;
	}

	public boolean updateCartQuantity(int customerId, int productId, int quantity) throws SQLException {
		String query = "update cart set quantity = ?" + " where customerId = ? and productId = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, quantity);
			ps.setInt(2, customerId);
			ps.setInt(3, productId);

			int rowUpdated = ps.executeUpdate();
			return rowUpdated > 0;
		}
	}

	// Find product in customer's cart
	public Cart getCartItem(int customerId, int productId) throws SQLException {

		String query = "SELECT * FROM cart WHERE customerId = ? AND productId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, customerId);
			ps.setInt(2, productId);

			try (ResultSet rs = ps.executeQuery()) {

				if (rs.next()) {
					return new Cart(rs.getInt("cartId"), rs.getInt("customerId"), rs.getInt("productId"),
							rs.getInt("quantity"));
				}
			}
		}

		return null;
	}
}
