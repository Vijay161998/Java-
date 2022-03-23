package com.abstraction;

public class Son implements Mother,Father {

	@Override
	public void watch() {
		System.out.println("Titan");
		
	}

	@Override
	public void bike() {
		System.out.println("Hhonda");
		
	}

	@Override
	public void car() {
		System.out.println("BMW");
		
	}
	
	public static void main(String[] args) {
		
		Son a = new Son();
		
		a.bike();
		a.car();
		a.watch();
			
	}

	}
	
	

