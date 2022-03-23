package com.polymorphism;

public class Collage {

	public void studentName(String name) {
		
		System.out.println(name);
		

	}

	public void studentDetais(String dep, String Course, int age) {
		
		System.out.println(dep+" "+Course+" "+age);
	}
	
	public void studentmark(int m1, int m2) {
		
		System.out.println(m1+" "+m2);
		
	
}
	
	public static void main(String[] args) {
		
		Collage abc = new Collage();
		abc.studentName("vijay");
		abc.studentDetais("BE","CSE",22);
		abc.studentmark(87, 76);
	}
}