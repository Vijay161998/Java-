package com.keywords;

public class Daughter extends Parent {
	
	int t= 34;;
	
	public void num2() {
		
		System.out.println(this.t);// curennt class reference
		
		System.out.println(super.a + " "+b);// Parent Class Reference
		
	}

	public static void main(String[] args) {
		
		Daughter obj = new Daughter();
		
		obj.num2();
	}
}
