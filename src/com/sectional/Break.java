package com.sectional;

public class Break {
	
	public static void main(String[] args) {
		
		for(int i =1;i<=25;i++) {
			
			if((i==12)||(i==21)){
				
				continue;
			}
			
			System.out.println(i);
		}
	}	

}
