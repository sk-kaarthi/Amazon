package com.jery.Task1;

import java.util.Scanner;

public class Main {
static int entry;
	public static void main(String[] args) {
		System.out.println("WELCOME TO AMAZON");
		System.out.println("YOUR CART IS EAGER TO FULL....");
		Scanner scan = new Scanner(System.in);
		
		    ApplianceDetails obj1 = new ApplianceDetails();
	       do {
	    	    System.out.println("Enter The Category Of Product");
		        System.out.println("Enter 1 For Appliance");
		        System.out.println("Enter 2 For TV");
		        System.out.println("Enter 3 For Mobile");
		        entry = scan.nextInt();
	    	   if(entry<=3){
	       
	        switch (entry) {
	            case 1:
	                obj1.getDataAppliance();
	                obj1.getdeliverydata();
	                break;
	            case 2:
	                obj1.getDataTV();
	                obj1.getdeliverydata();
	                break;
	            case 3:
	                obj1.getDataMobile();
	                obj1.getdeliverydata();
	                break;
	            			}
	    	   	}
	       	}	    
	while(entry==0||entry>=4);
	}

}
