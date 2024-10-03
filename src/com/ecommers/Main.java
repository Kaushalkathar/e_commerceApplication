package com.ecommers;

import com.ecommers.Invetory;
import com.ecommers.PlaceOrder;

public class Main {

	public static void main(String[] args) {
		Invetory customer = new Invetory("Kaushal", 101, "Karve nagar , picode 411005", "kausalshinde@1323", "mobile", 2000);

		PlaceOrder p = new PlaceOrder();
		p.placeOrder("mobile", 100);
	}
}
