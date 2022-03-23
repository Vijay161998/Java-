package com.example;

public class Amstrong_Number {

	public static void main(String[] args) {
		
		int a =1634;
		int temp =a;
		int rem=0;
		int value=0;
		
		while(temp>0) {
			
			rem = temp%10;
			System.out.println(rem);
			value = value+(rem*rem*rem*rem);
			System.out.println(value);
			temp =temp/10;
			System.out.println(temp);
			
			
		}
			
		if (a == value) {
	
	
			System.out.println("Amstrong");
		}
			else
			
			{
				System.out.println("not Amstrong");
			}
	}

	}
