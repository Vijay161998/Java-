package com.example;

public class String_Pratice {
	
	public static void main(String[] args) {
		
		String s = "vijay";
		
		String temp ="";
		
		for (int i=s.length()-1; i>=0;i--) {
			
			char value =s.charAt(i);
			temp =temp +value;
			
		}
		
		System.out.println(temp);
		
		StringBuilder m = new StringBuilder();
		
		m.append(s);
		m.reverse();
		System.out.println(m);
		
	}

	
	
	
}
