package com.typecasting;

public class Child extends Parent  {
	
	public void watch() {
		
		System.out.println("titan");

	}
	
	
	
public static void main(String[] args) {
		
		Parent a = new Child ();
		
		a.bike();
		a.car();
		Child c = new Child();
		
		c.watch();
	}

}
