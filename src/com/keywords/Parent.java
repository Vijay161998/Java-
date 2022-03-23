package com.keywords;

public class Parent {

	int a =23;
	int b;
	
	public void num1() {
	
		int c = 5;
	
		System.out.println(c+ " "+a+" "+b);
	}
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		
		obj.num1();
	}
	
}
