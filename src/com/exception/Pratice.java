package com.exception;

public class Pratice {


	public static void main(String[] args) {

		try {

			int a = 12;

			System.out.println(a/0);	


		} catch (NullPointerException e) {

			System.out.println("Handle Null Pointer");

			
		}	catch (ArithmeticException e) {

			System.out.println("Exception Handleing");

			String s =null;
			
			System.out.println(s.toLowerCase());

			System.out.println("Execute Sucessfully");
		}
	}
}
