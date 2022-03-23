package com.keywords;

public class Child extends KeywordsPratice {

	@Override
	public void num2() {
		
	  int t =23;
	  
	  System.out.println(t);
	    
		super.num2();
	}
	
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.num2();
		
		obj.num1();
	}

	
	
}
