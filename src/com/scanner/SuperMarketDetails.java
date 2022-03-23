package com.scanner;

import java.util.Scanner;

public class SuperMarketDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Which Day Give the Special Offers to Coustomers:");
			 
		  String day = sc.next();
		
		  sc.nextLine();
			
		System.out.println("Ther Secial Offer Gives the Day is:"+ day);
		
		
		System.out.println("Enter the Supermarket name:");
		
		String name = sc.nextLine();
		
		System.out.println("The  Supermarket Name  is:"+name);
		
		
		System.out.println("Enter the Contact Number:");
		
		int number =sc.nextInt();
		
		System.out.println("The Contact Number is:"+number);
		
		System.out.println("Enter the Discount Percentage of The Products:");
		
		float discount =sc.nextFloat();
	
		System.out.println("The Discount Persentage is:"+discount);
		
	     System.out.println("Enter The Icon Symbol of SuperMarket:");
		
		char symbol = sc.next().charAt(0);
		
		System.out.println("The Icon Symbol is:"+symbol);
		
	}
		
	}
	
