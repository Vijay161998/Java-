package com.example;

public class Poindrome {

	public static void main(String[] args) {
		
		int a=121;
		int temp = a;
		int rem=0;
		int value=0;
		
		while(temp>0) {


			rem = temp%10;
			value = (value*10)+rem;
			temp=temp/10;
		}
	
	    if (a==value)
	    	
	    	System.out.println("palindrome");
	    else
	    	System.out.println("not palindrome");
	}
	
}
