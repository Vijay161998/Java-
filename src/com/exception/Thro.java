package com.exception;


public class Thro {
	
	
	public void car(int side) throws Exception  {
		
		if (side>0) {
			
			int area = side*side;
			System.out.println(area);
			
		}
		else {
			
			throw new ArithmeticException("Please enter the Possitive Values");
		}
		
		

	}

	public static void main(String[] args) throws Exception  {
		
		Thro t = new Thro();
		t.car(6);
	}
}
