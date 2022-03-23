package com.array;

public class Array3 {
	
public static void main(String[] args) {
		
		int a[]=new int [3];
		int  b[]= new int [2];
		
		a[1]=1;
		a[0]=2;
		a[2]=3;
		b[0]=4;
		b[1]=1;
		
		int length = a.length;
		
		System.out.println(length);
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if(a[i]==b[j]) {
					
					System.out.println("the common values is");
					
				
				System.out.println(a[i]);
				
				}
				
		}
			
}
		
	}
}





