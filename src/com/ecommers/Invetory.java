package com.ecommers;



import com.ecommers.Constants;
import com.ecommers.Validator;

public class Invetory {

	private static String cust_Name;
	private static int cust_Id;
	private static String address;
	private static String email;
	private static String productName;
	private static int quantity;

	public Invetory() {

	}

	public Invetory(String cust_Name, int cust_Id, String address, String email, String productName, int quantity) {
		Invetory.cust_Name = cust_Name;
		Invetory.cust_Id = cust_Id;
		if (Validator.validatePinCode(address)) {
			Invetory.address = address;
		} else {
			System.out.println(Constants.INVALID_ADDRESS);
		}

		if (Validator.validateEmail(email)) {
			Invetory.email = email;
		} else {
			System.out.println(Constants.INVALID_EMAIL);
		}

		Invetory.productName = productName;
		Invetory.quantity = quantity;
	}

	public static String getCust_Name() {
		return cust_Name;
	}

	public static void setCust_Name(String cust_Name) {
		Invetory.cust_Name = cust_Name;
	}

	public static int getCust_Id() {
		return cust_Id;
	}

	public static void setCust_Id(int cust_Id) {
		Invetory.cust_Id = cust_Id;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Invetory.address = address;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Invetory.email = email;
	}

	public static String getProductName() {
		return productName;
	}

	public static void setProductName(String productName) {
		Invetory.productName = productName;
	}

	public static int getQuantity() {
		return quantity;
	}

	public static void setQuantity(int quantity) {
		Invetory.quantity = quantity;
	}

}
