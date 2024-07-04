package com.jery.Task1;

import java.util.Scanner;

import com.jery.PaymentDetails.PaymentMain;

public class DeliveryAddress extends PaymentMain {
	char loc;
	void getdeliverydata() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Address");
		String address = scan.nextLine();
		PaymentMain obj1 = new PaymentMain();
		obj1.payment();
	}
}
