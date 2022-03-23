
package com.polymorphism;

public class MethodoverLoading {
	
	public void studentDetails(String name) {
		
		System.out.println(name);
	}
	
public void studentDetails(String dep,String course,int age) {
	
	System.out.println(dep+" "+course+" "+age);

}
	
  public void studentDetails(int m1,int m2,int m3) {
	
	  System.out.println(m1+" "+m2+" "+m3);

}
  
  public static void main(String[] args) {
	
	  MethodoverLoading m = new MethodoverLoading();
	  m.studentDetails("sunil");
	  m.studentDetails("BE", "CSE", 21);
	  m.studentDetails(45, 86, 43);
	  
	  

}
	}
