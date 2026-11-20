package com.kodewala.exception2;

class User {
	private static final String userName =null;

	public void createUserId(String name, String password) {
		String userId = "sachin";
		
		try {
			String country = "Ind";
			System.out.println("User.createUserId .......country is " + country);
			userId = userName.substring(0,5) + "123";
			System.out.println("Driver.createUser()....and generate user id: " + userId + "End");
		}
		
		
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Number cant be Div by Zero");
		}
		
		
//		catch(NullPointerException e) {
//			e.printStackTrace();
//			System.out.println("user name is not found");
//		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unknown Exception ...");
			e.printStackTrace();
		}
			
		finally {
			System.out.println("User.createUser()........ Closing the connection");
		}
		
		System.out.println("driver.createUser() End");
	}
}
