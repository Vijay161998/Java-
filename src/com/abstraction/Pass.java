package com.abstraction;

public class Pass extends AbstractionClass {

	@Override
	public void password() {
	
		System.out.println(23456);
		
	}

	@Override
	public void usernname() {
		
		super.usernname();
	}
	
	public void password2() {
		System.out.println("123765");

	}

	 public static void main(String[] args) {
		
		 Pass abc = new Pass();
		 abc.password();
		 abc.usernname();
		 abc.password2();
	}
	
}
