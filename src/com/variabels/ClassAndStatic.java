package com.variabels;

public class ClassAndStatic {
	
	int c = 18;
	
	int a = 23;
	
	int d = 3;

	static int e = 23;
	
	static float r =34.3f;
	
  public void num1() {
	
	  int c = 12;
	  int e = 22;
	   	  
	  System.out.println(e);
	  System.out.println(c);
	  System.out.println(a);
	  
	  
}
  
  public static void num2() {
	
	  int t = 32;
		      
	  System.out.println(t);
	  
	 
	  
}
  public void num3() {

	  a =34;
	  
        a= c;
	  
	  System.out.println(a);

}
  
  
  public static void main(String[] args) {
	  
	  System.out.println("The Static  Variable values");
	  
	  num2();
	  System.out.println(e);
	  
	  System.out.println(r);
	  
	  ClassAndStatic obj = new ClassAndStatic();
	  
	  System.out.println("local varibale Values");
	  
	  obj.num1();
	  obj.num3();
	 
	  System.out.println(obj.d);
	 
}

}

