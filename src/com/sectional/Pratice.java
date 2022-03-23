package com.sectional;

import java.util.Scanner;

public class Pratice {
	
 public static void main(String[] args) {
	
	 System.out.println("Please enter the your mark");
	 
	Scanner s = new Scanner(System.in);
	
	int num =s.nextInt();
	
	if(num>=90)
	{
		System.out.println("Your Grade is A");
	}
	 
	else if(num>=75) {
		
		System.out.println("Your Grade is B");
	}


 else if(num>=60) {
		
		System.out.println("Your Grade is C");
	}
	
   else {
		
		System.out.println("Your Fail");
	}


}
}