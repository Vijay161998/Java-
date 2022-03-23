package com.string;

public class String1 {
	
	public static void main(String[] args) {
		
		String s1 = "welcome vijay to java";
		String s2 =" Welcome    vijay vijay";
	
		String s3 ="iam"; 
		String s4 ="iam";
		
	    int length = s2.length();
	    
	    System.out.println(length);
	    
	    boolean equals = s1.equals(s2);
		
	    System.out.println(equals);
	    
	    boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
	    
	    System.out.println(equalsIgnoreCase);
	    
	    String upperCase = s1.toUpperCase();
	    
	    System.out.println(upperCase);
	    
	    String lowerCase = s2.toLowerCase();
	    
	    System.out.println(lowerCase);
	    
	   boolean startsWith= s2.startsWith("we");
	   System.out.println(startsWith);
	   
	   boolean contains = s2.contains("v");
	   
	   System.out.println(contains);
	   
	   int lastIndexOf = s2.lastIndexOf("i");
	   System.out.println(lastIndexOf);
	   
	   
	  char charAt = s2.charAt(9);
	  System.out.println(charAt);
	   
	  String replace = s1.replace("w", "#");
	  System.out.println(replace);
	   
	   String substring = s2.substring(3,7);
	   System.out.println(substring);
	   
        s2= s2.trim();
	   
	   System.out.println(s2);
	  
	   int length2 = s2.length();
	   
	   System.out.println(length2);
	   
	   int compareTo = s4.compareTo(s3);
	   
	   System.out.println(compareTo);
	   
	  String s5="";	   
	   
	   boolean empty = s5.isEmpty();
	   
	   System.out.println(empty);
	   
	  String s6="i was a i it is a super"; 
	   
	   String[] split =s6.split("i");
	   for (String str: split) {
		   
		   
			   
			   System.out.println(str);
		     
		   		
		   

	   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
