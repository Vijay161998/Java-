package com.array;

public class Array2 {
	public static void main(String[] args) {
		
		int a[]=new int [8];
		
		String e[]=new String[2];
				 
		a[0]=1;
		a[1]=2;
		a[2]=7;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		a[6]=6;
		a[7]=7;
		e[0]="we";
	     e[1]="w";
	     
		
		System.out.println("the sum of Value is");	
		
      int b =a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7];
      
      System.out.println(b);
      
      System.out.println("the average of array value is");
		
      int c = b/a.length;
      
      System.out.println(c);
      
      System.out.println("the length of array is");
      
      System.out.println(a.length);
      System.out.println("the 2ed index value is");
      System.out.println(a[3]);
    
      
	}

}
