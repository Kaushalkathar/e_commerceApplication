package com.ecommers;


import java.util.Iterator;

public class Validator {

	public static boolean validateEmail(String email) {

		boolean isValidated = email.contains("@");
		if (isValidated) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validatePinCode(String address) {
		boolean isValidated = address.contains("411005");
		if (isValidated) {
			return true;
		} else {
			return false;
		}
	}
}
