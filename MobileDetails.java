package com.jery.Task1;
import java.util.Scanner;
public class MobileDetails extends DeliveryAddress {
	 public void getDataMobile(){
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Product Name");
	        String proname = scan.nextLine();
	        System.out.println("Product Code");
	        int code = scan.nextInt();
	        System.out.println("Product Value");
	        int pri = scan.nextInt();
	 }
}
