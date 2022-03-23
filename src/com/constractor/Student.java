package com.constractor;

public class Student {
	
	public Student() {
		
		System.out.println("Default Constractor");
	}
	
	public Student(String  name) {
		
		System.out.println(name);
	}

	public Student(int age) {
		
		System.out.println(age);
	}

	
public static void main(String[] args) {
	
	Student obj = new Student();
	Student obj3 = new Student(98);
	Student obj1 = new Student("vijay");
	Student  obj2 = new Student(23);
	
	Student obj4 = new Student(23);

	
	}
}
