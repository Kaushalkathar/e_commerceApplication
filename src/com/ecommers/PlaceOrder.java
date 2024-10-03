package com.ecommers;

import java.util.Random;
import java.util.Scanner;
import com.ecommers.Validator;

public class PlaceOrder extends Invetory {

	public void placeOrder(String productName, int quantity) {

		if (productName.equals(Invetory.getProductName())) {
			System.out.println("available");
			int availableQuantity = Invetory.getQuantity();
			if (availableQuantity > quantity && quantity > 0) {
				String email = Invetory.getEmail();
				String address = Invetory.getAddress();

				if (email != null && address != null) {

					Random r = new Random();
					int otp = r.nextInt(10000);
					System.out.println("OTP = " + otp);

					System.out.println("PLease provide OTP to proceed further....!!!");
					Scanner scanner = new Scanner(System.in);
					int insertedOTP = scanner.nextInt();

					if (otp == insertedOTP) {
						System.out.println("Proceed");
						int rem_uantity = Invetory.getQuantity() - quantity;
						Invetory.setQuantity(rem_uantity);
						System.out.println("Remaining Q : " + rem_uantity);
					} else {
						System.err.println("Incorrect OTP");
					}

				} else {
					System.err.println("Something went wrong...!!!");
				}

			} else {
				System.err.println("Invalid Quantity");
			}
		} else {
			System.err.println("Not Available");
		}
	}

	public void placeOrder(int product_Id, int quantity) {

		if (product_Id == Invetory.getCust_Id()) {
			System.out.println("available");
			int availableQuantity = Invetory.getQuantity();
			if (availableQuantity > quantity && quantity > 0) {
				String email = Invetory.getEmail();
				String address = Invetory.getAddress();

				if (email != null && address != null) {

					Random r = new Random();
					int otp = r.nextInt(10000);
					System.out.println("OTP = " + otp);

					System.out.println("PLease provide OTP to proceed further....!!!");
					Scanner scanner = new Scanner(System.in);
					int insertedOTP = scanner.nextInt();

					if (otp == insertedOTP) {
						System.out.println("Proceed");
						int rem_uantity = Invetory.getQuantity() - quantity;
						Invetory.setQuantity(rem_uantity);
						System.out.println("Remaining Q : " + rem_uantity);
					} else {
						System.err.println("Incorrect OTP");
					}

				} else {
					System.err.println("Something went wrong...!!!");
				}

			} else {
				System.err.println("Invalid Quantity");
			}
		} else {
			System.err.println("Not Available");
		}

	}
}
