package com.mini_ecommerce_jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mini_ecommerce_jdbc.config.DBConnection;
import com.mini_ecommerce_jdbc.model.Customer;

public class CustomerRepository {

	// Add New Customer
	public boolean addCustomer(Customer customer) throws SQLException {
		String query = "insert into customer (customerId , customerName , email, mobile , address , password) values (? , ? , ? , ? , ? , ?)";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getCustomerName().trim());
			ps.setString(3, customer.getEmail().trim());
			ps.setString(4, customer.getMobile().trim());
			ps.setString(5, customer.getAddress().trim());  
			ps.setString(6, customer.getPassword().trim());
 
			int rowInserted = ps.executeUpdate();
			return rowInserted > 0;
		} 
	}

	// Find Customer By Email
	public Customer getCustomerByEmail(String email) throws SQLException {
		String query = "select * from customer where email = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, email);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					return new Customer(rs.getInt("customerId"), rs.getString("customerName"), rs.getString("email"),
							rs.getString("mobile"), rs.getString("address"), rs.getString("password"));
				}
			}
		}
		return null; // it will send null if no customer will match
	}

	// find Duplicate Customer
	public boolean existsById(int customerId) throws SQLException {
		String query = "select customerId from customer where customerId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, customerId);

			try (ResultSet rs = ps.executeQuery()) {
				return rs.next();
			}
		}
	}

	// Find customer By Id
	public Customer getCustomerById(int customerId) throws SQLException {
		String query = "select * from customer where customerId = ?";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, customerId);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Customer(rs.getInt("customerId"), rs.getString("customerName"), rs.getString("email"),
							rs.getString("mobile"), rs.getString("address"), rs.getString("password"));
				}
			}
		}
		return null;
	}

	// Get ALl Customer
	public List<Customer> getAllCustomers() throws SQLException {
		String query = "select * from customer";
		List<Customer> customers = new ArrayList<>();

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Customer customer = new Customer(rs.getInt("customerId"), rs.getString("customerName"),
						rs.getString("email"), rs.getString("mobile"), rs.getString("address"),
						rs.getString("password"));
				customers.add(customer);
			}
		}
		return customers;
	}

	// Update Customer Data
	public boolean updateCustomer(Customer customer) throws SQLException {
		String query = "UPDATE customer SET customerName = ?,email = ?,mobile = ?,address = ?,password = ? WHERE customerId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, customer.getCustomerName());
			ps.setString(2, customer.getEmail());
			ps.setString(3, customer.getMobile());
			ps.setString(4, customer.getAddress());
			ps.setString(5, customer.getPassword());
			ps.setInt(6, customer.getCustomerId());

			return ps.executeUpdate() > 0;
		}
	}

	// Delete Customer
	public boolean deleteCustomer(int customerId) throws SQLException {

		String query = "DELETE FROM customer WHERE customerId = ?";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setInt(1, customerId);

			int rowsDeleted = ps.executeUpdate(); 

			return rowsDeleted > 0;
		}
	}
}
