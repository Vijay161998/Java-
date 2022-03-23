package com.emp;

public class Empoyee {
	
	public void empid() {
		
		System.out.println("R14366");
	}

	public void empDob() {
		
		System.out.println("10/06/98");
	}
	
	public void empPhone() {
		
		System.out.println("8124055230");
	}
	
	public static void main(String[] args) {
		
		Empoyee s= new Empoyee();
		s.empDob();
		s.empPhone();
		s.empid();
	}
}
