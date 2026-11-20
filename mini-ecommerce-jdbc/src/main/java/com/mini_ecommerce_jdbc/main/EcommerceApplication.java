package com.mini_ecommerce_jdbc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.mini_ecommerce_jdbc.model.Customer;
import com.mini_ecommerce_jdbc.model.Product;
import com.mini_ecommerce_jdbc.model.OrderItem;
import com.mini_ecommerce_jdbc.model.OrderStatus;
import com.mini_ecommerce_jdbc.model.Orders;
import com.mini_ecommerce_jdbc.service.CartService;
import com.mini_ecommerce_jdbc.service.CustomerService;
import com.mini_ecommerce_jdbc.service.OrderService;
import com.mini_ecommerce_jdbc.service.ProductService;

public class EcommerceApplication {

	static Scanner scanner = new Scanner(System.in);

	static ProductService productService = new ProductService();
	static CustomerService customerService = new CustomerService();
	static CartService cartService = new CartService();
	static OrderService orderService = new OrderService();

	public static void main(String[] args) throws SQLException {

		while (true) {

			System.out.println("\n=================================="); 
			System.out.println("       MINI E-COMMERCE APP");
			System.out.println("==================================");
			System.out.println("1. Admin");
			System.out.println("2. Customer"); 
			System.out.println("3. Exit");
			System.out.println("----------------------------------");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				adminMenu();
				break;

			case 2:
				customerMenu();
				break;

			case 3:
				System.out.println("Thank you for using Mini E-Commerce App!");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	// ============================================================
	// ADMIN MENU
	// ============================================================

	public static void adminMenu() throws SQLException {

		while (true) {

			System.out.println("\n==================================");
			System.out.println("           ADMIN MENU");
			System.out.println("==================================");
			System.out.println("1. Add Product");
			System.out.println("2. View All Products");
			System.out.println("3. Search Product By ID");
			System.out.println("4. Search Product By Name");
			System.out.println("5. Search Product By Category");
			System.out.println("6. Search Product By Brand");
			System.out.println("7. Search Product By Price Range");
			System.out.println("8. Update Product Price");
			System.out.println("9. Update Product Stock");
			System.out.println("10. Delete Product");
			System.out.println("11. View Available Products");
			System.out.println("12. Back");
			System.out.println("----------------------------------");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			try {

				switch (choice) {

				case 1:
					addProduct();
					break;

				case 2:
					viewAllProducts();
					break;

				case 3:
					searchProductById();
					break;

				case 4:
					searchProductByName();
					break;

				case 5:
					searchProductByCategory();
					break;

				case 6:
					searchProductByBrand();
					break;

				case 7:
					searchProductByPriceRange();
					break;

				case 8:
					updateProductPrice();
					break;

				case 9:
					updateProductStock();
					break;

				case 10:
					deleteProduct();
					break;

				case 11:
					viewAvailableProducts();
					break;

				case 12:
					return;

				default:
					System.out.println("Invalid choice.");

				}

			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
	}

	// ============================================================
	// CUSTOMER MENU
	// ============================================================

	public static void customerMenu() throws SQLException {

		while (true) {

			System.out.println("\n==================================");
			System.out.println("         CUSTOMER MENU");
			System.out.println("==================================");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Back");
			System.out.println("----------------------------------");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			try {

				switch (choice) {

				case 1:
					registerCustomer();
					break;

				case 2:
					Customer customer = loginCustomer();

					if (customer != null) {
						customerDashboard(customer);
					}

					break;

				case 3:
					return;

				default:
					System.out.println("Invalid choice.");
				}

			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
	}

	// ============================================================
	// CUSTOMER DASHBOARD
	// ============================================================

	public static void customerDashboard(Customer customer) throws SQLException {

		while (true) {

			System.out.println("\n==================================");
			System.out.println("        CUSTOMER DASHBOARD");
			System.out.println("==================================");
			System.out.println("Welcome, " + customer.getCustomerName());
			System.out.println("----------------------------------");
			System.out.println("1. View All Products");
			System.out.println("2. Search Product");
			System.out.println("3. Add Product To Cart");
			System.out.println("4. View Cart");
			System.out.println("5. Update Cart Quantity");
			System.out.println("6. Remove Product From Cart");
			System.out.println("7. Place Order");
			System.out.println("8. View Order History");
			System.out.println("9. View Order Details");
			System.out.println("10. Cancel Order");
			System.out.println("11. Process Payment");
			System.out.println("12. Fail Payment");
			System.out.println("13. Refund Payment");
			System.out.println("14. Logout");
			System.out.println("----------------------------------");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			try {

				switch (choice) {

				case 1:
					viewAllProducts();
					break;

				case 2:
					customerSearchProduct();
					break;

				case 3:
					addProductToCart(customer);
					break;

				case 4:
					viewCart(customer);
					break;

				case 5:
					updateCartQuantity(customer);
					break;

				case 6:
					removeFromCart(customer);
					break;

				case 7:
					orderService.placeOrder(customer.getCustomerId());
					break;

				case 8:
					viewOrderHistory(customer);
					break;

				case 9:
					viewOrderDetails(customer);
					break;

				case 10:
					cancelOrder(customer);
					break;

				case 11:
					processPayment(customer);
					break;

				case 12:
					failPayment(customer);
					break;

				case 13:
					refundPayment(customer);
					break;

				case 14:
					System.out.println("Logged out successfully.");
					return;

				default:
					System.out.println("Invalid choice.");
				}

			} catch (Exception e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
	}

	// ============================================================
	// CUSTOMER REGISTRATION
	// ============================================================

	public static void registerCustomer() throws SQLException {

		System.out.println("\n========== CUSTOMER REGISTRATION ==========");

		System.out.print("Customer ID: ");
		int id = scanner.nextInt(); 
		scanner.nextLine();

		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Email: ");
		String email = scanner.nextLine();

		System.out.print("Mobile: ");
		String mobile = scanner.nextLine();

		System.out.print("Address: ");
		String address = scanner.nextLine();

		System.out.print("Password: ");
		String password = scanner.nextLine();

		Customer customer = new Customer(id, name, email, mobile, address, password);

		customerService.registerCustomer(customer);
	}

	// ============================================================
	// CUSTOMER LOGIN
	// ============================================================

	public static Customer loginCustomer() throws SQLException {

		System.out.println("\n========== CUSTOMER LOGIN ==========");

		scanner.nextLine();

		System.out.print("Email: ");
		String email = scanner.nextLine();

		System.out.print("Password: ");
		String password = scanner.nextLine();

		return customerService.loginCustomer(email, password);
	}

	// ============================================================
	// PRODUCT METHODS
	// ============================================================

	public static void addProduct() throws SQLException {

		System.out.println("\n========== ADD PRODUCT ==========");

		System.out.print("Product ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Product Name: ");
		String name = scanner.nextLine();

		System.out.print("Category: ");
		String category = scanner.nextLine();

		System.out.print("Price: ");
		int price = scanner.nextInt();

		System.out.print("Stock Quantity: ");
		int stock = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Brand: ");
		String brand = scanner.nextLine();

		Product product = new Product(id, name, category, price, stock, brand);

		productService.addProduct(product);
	}

	public static void viewAllProducts() throws SQLException {

		List<Product> products = productService.viewAllProducts();

		System.out.println("\n========== PRODUCTS ==========");

		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void searchProductById() throws SQLException {

		System.out.print("Enter Product ID: ");
		int id = scanner.nextInt();

		Product product = productService.getProductById(id);

		System.out.println(product);
	}

	public static void searchProductByName() throws SQLException {

		scanner.nextLine();

		System.out.print("Enter Product Name: ");
		String name = scanner.nextLine();

		Product product = productService.getProductByName(name);

		System.out.println(product);
	}

	public static void searchProductByCategory() throws SQLException {

		scanner.nextLine();

		System.out.print("Enter Category: ");
		String category = scanner.nextLine();

		List<Product> products = productService.getProductByCategory(category);

		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void searchProductByBrand() throws SQLException {

		scanner.nextLine();

		System.out.print("Enter Brand: ");
		String brand = scanner.nextLine();

		List<Product> products = productService.getProductsByBrand(brand);

		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void searchProductByPriceRange() throws SQLException {

		System.out.print("Minimum Price: ");
		int min = scanner.nextInt();

		System.out.print("Maximum Price: ");
		int max = scanner.nextInt();

		List<Product> products = productService.getProductByPriceRange(min, max);

		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void updateProductPrice() throws SQLException {

		System.out.print("Product ID: ");
		int id = scanner.nextInt();

		System.out.print("New Price: ");
		int price = scanner.nextInt();

		productService.updateProductPrice(id, price);
	}

	public static void updateProductStock() throws SQLException {

		System.out.print("Product ID: ");
		int id = scanner.nextInt();

		System.out.print("New Stock Quantity: ");
		int stock = scanner.nextInt();

		productService.updateProductStock(id, stock);
	}

	public static void deleteProduct() throws SQLException {

		System.out.print("Product ID: ");
		int id = scanner.nextInt();

		Product product = productService.deleteProductById(id);

		System.out.println("Deleted Product:");
		System.out.println(product);
	}

	public static void viewAvailableProducts() throws SQLException {

		List<Product> products = productService.getAvailableProducts();

		for (Product product : products) {
			System.out.println(product);
		}
	}

	// ============================================================
	// CUSTOMER PRODUCT SEARCH
	// ============================================================

	public static void customerSearchProduct() throws SQLException {

		System.out.println("\n========== SEARCH PRODUCT ==========");
		System.out.println("1. By ID");
		System.out.println("2. By Name");
		System.out.println("3. By Category");
		System.out.println("4. By Brand");
		System.out.println("5. By Price Range");

		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			searchProductById();
			break;

		case 2:
			searchProductByName();
			break;

		case 3:
			searchProductByCategory();
			break;

		case 4:
			searchProductByBrand();
			break;

		case 5:
			searchProductByPriceRange();
			break;

		default:
			System.out.println("Invalid choice.");
		}
	}

	// ============================================================
	// CART METHODS
	// ============================================================

	public static void addProductToCart(Customer customer) throws SQLException {

		System.out.print("Product ID: ");
		int productId = scanner.nextInt();

		System.out.print("Quantity: ");
		int quantity = scanner.nextInt();

		cartService.addProductToCart(customer.getCustomerId(), productId, quantity);
	}

	public static void viewCart(Customer customer) throws SQLException {

		List<com.mini_ecommerce_jdbc.model.Cart> cart = cartService.getCustomerCart(customer.getCustomerId());

		System.out.println("\n========== YOUR CART ==========");

		for (com.mini_ecommerce_jdbc.model.Cart item : cart) {
			System.out.println(item);
		}
	}

	public static void updateCartQuantity(Customer customer) throws SQLException {

		System.out.print("Product ID: ");
		int productId = scanner.nextInt();

		System.out.print("New Quantity: ");
		int quantity = scanner.nextInt();

		cartService.updateCartQuantity(customer.getCustomerId(), productId, quantity);
	}

	public static void removeFromCart(Customer customer) throws SQLException {

		System.out.print("Product ID: ");
		int productId = scanner.nextInt();

		cartService.deleteProductFromCart(customer.getCustomerId(), productId);
	}

	// ============================================================
	// ORDER METHODS
	// ============================================================

	public static void viewOrderHistory(Customer customer) throws SQLException {

		List<Orders> orders = orderService.getCustomerOrderHistory(customer.getCustomerId());

		System.out.println("\n========== ORDER HISTORY ==========");

		for (Orders order : orders) {
			System.out.println(order);
		}
	}

	public static void viewOrderDetails(Customer customer) throws SQLException {

		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();

		orderService.getOrderDetails(customer.getCustomerId(), orderId);
	}

	public static void cancelOrder(Customer customer) throws SQLException {

		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();

		orderService.cancelOrder(customer.getCustomerId(), orderId);
	}

	public static void processPayment(Customer customer) throws SQLException {

		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();

		orderService.processPayment(customer.getCustomerId(), orderId);
	}

	public static void failPayment(Customer customer) throws SQLException {

		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();

		orderService.failPayment(customer.getCustomerId(), orderId);
	}

	public static void refundPayment(Customer customer) throws SQLException {

		System.out.print("Enter Order ID: ");
		int orderId = scanner.nextInt();

		orderService.refundPayment(customer.getCustomerId(), orderId);
	}
}