package com.kodewala.date27.interf1;

public class Driver {

	public static void main(String[] args) {
		IAuthentication iAuth = new GoogleLogin();
		iAuth.logOut();
		iAuth.login();
	}

}
