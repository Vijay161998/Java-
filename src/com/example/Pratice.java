package com.example;

public class Pratice    {
	
	
	private Pratice(int age) {
		
		System.out.println(age);
		
	}
	
	
public static void car() {
		
		System.out.println("BMW");
		
	}
	
	public void bike() {
	
		System.out.println("hero");

	}
	public static void main(String[] args) {
		
		Pratice a = new Pratice(20);
		a.bike();
		car();
		
	}
	


	
	}
	
