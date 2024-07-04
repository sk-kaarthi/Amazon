package com.jery.Task1;
import java.util.Scanner;
public class TVDetails extends MobileDetails {
	 public void getDataTV(){
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Product Name");
	        String proname = scan.nextLine();
	        System.out.println("Product Code");
	        int code = scan.nextInt();
	        System.out.println("Product Value");
	        int pri = scan.nextInt();
	 }
}
