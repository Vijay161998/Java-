package com.emp;

import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) {
		
		System.out.println("enter the empolyee id");
		
		Scanner s = new Scanner(System.in);
		
		int empid = s.nextInt();
		
		s.nextLine();
		
		System.out.println("yoru emp id is "+empid);
		
		System.out.println("enter your name");
		
		String empname = s.nextLine();
		
         System.out.println("your name is"+empname);
          
          
		System.out.println("enter your numer");
		
		int phone = s.nextInt();
		
		System.out.println("your ph numer is"+phone);
		
		System.out.println("enter your mark ");
		int mark1 = s.nextInt();
		
		System.out.println("mark is "+mark1);
		
		int avg = empid/mark1;
		
		System.out.println("your average is "+avg);
		
		
		}
	

}

      
