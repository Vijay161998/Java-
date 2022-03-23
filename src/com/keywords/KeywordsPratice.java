package com.keywords;

public class KeywordsPratice { 
	
	public final void num1() { // we donot Over ride the  Method because we mentint final 
		
		System.out.println("final keywords");

	}

	 public void num2() {
		
		 int  s=12;
		 System.out.println(s);
	}
	public static void main(String[] args) {
		
		
		System.out.println("vijay");
		
		
		 int a = 12;
		
		int b =3;
		
		a=b;
		
		System.out.println(a);
		System.out.println(b);
		
		KeywordsPratice obj = new KeywordsPratice();
		
		obj.num1();
	}
	
}
