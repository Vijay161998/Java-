package com.polymorphism;

public class Student1 extends Collage {

	@Override
	public void studentName(String name) {
		
		super.studentName(name);
	}

	@Override
	public void studentDetais(String dep, String Course, int age) {
		
		super.studentDetais(dep, Course, age);
	}

	@Override
	public void studentmark(int m1, int m2) {
		
		super.studentmark(m1, m2);
	}
		
	public static void main(String[] args) {
		
		Student1 abc = new Student1();
		
		abc.studentName("karthi");
		abc.studentDetais("ME", "ECE",24);
		abc.studentmark(87, 98);
		
	}

	
}
