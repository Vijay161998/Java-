package com.array;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the length of  Array");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b [] = new int[5];
		
		b[0]=10;
		b[1]=20;
		b[2]=45;
		b[3]=50;
		b[4]=60;
		System.out.println("The first two  Element Values is");
		for (int i = 0; i <=1; i++) {
			
			System.out.println(b[i]);
		}
		
	System.out.println("the length of Array is");
		
		int length =b.length;
		
		System.out.println(length);
		
		
		System.out.println("the 3rd element value is");
		
		System.out.println(b[2]);
			
			System.out.println("All Array Element Values is");
			
			for (int i : b) {
				
				System.out.println(i);
				
			}
		
		
	}

}
