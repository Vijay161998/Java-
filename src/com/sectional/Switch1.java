package com.sectional;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		
		  for (int j = 1; j <=8; j++) {
				
		  System.out.println("Enter the Number");
		  
		Scanner s = new Scanner(System.in);
		
		  int i = s.nextInt();
		 
		  
		   
	switch (i) {
		
	   case 1:
			System.out.println("your enter  in Mmonday");
			break;
		case 2:
			System.out.println("your enter  in Tuesday");
			break;

		case 3:
			System.out.println("your enter  in Wednesday");
			break;
		case 4:
			System.out.println("your enter  in Thuresday");
			break;

		case 5:
			System.out.println("your enter  in Friday");
			break;

		case 6:
			System.out.println("your enter  in Saturday");
			break;

		case 7:
			System.out.println("your enter  in Sunday");
			break;
			

		default:
			System.out.println("your enter in invalied  number");
		break;
		 
		  }
		
		  }
	
		 
	
	}

}
