package com.array;

import java.util.Scanner;

public class Array4 {
	
public static void main(String[] args) {
	
	   int a;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of  Array");
		
		
		a = s.nextInt();	
		
		int []b =new int[7];
	
		
		System.out.println("Enter the Array Elements");
		
		for (int i = 0; i <a; i++) {
			
			b[i]=s.nextInt();
			
		}
		
		System.out.println("The Array Element is");
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
			
		}
}

}
