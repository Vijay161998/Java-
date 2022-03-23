package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Object>v = new HashSet<>();
		System.out.println(v);
		
		v.add(22);
		v.add(11);
		v.add(33); 
		v.add(22);
		v.add("vijay");
		v.add(null);
		v.add(null);
		
		System.out.println("Print The Variable v Elements");
		System.out.println(v);
	
		System.out.println("Size of Varibale v Elements");
	
		int size = v.size();
	System.out.println(size);
	
	
	Set<Object>v1 = new LinkedHashSet<>();
	
	System.out.println("Print The Variable v1 Elements");
	System.out.println(v1);
	
	v1.add(22);
	v1.add(34); 
	v1.add(22);
	v1.add("java");
	v1.add(null);
	v1.add(null);
	v1.add(1);
	System.out.println(v1);
	
	//v1.remove(null);
	//System.out.println(v1);
	System.out.println("Varibale v contains the  null value?");
	boolean con= v.contains(null);
	System.out.println(con);
	
	//v.clear();
	//System.out.println(v);
	
	System.out.println("useing The addAll Method for Variable v and v1 ");
	v.addAll(v1);
	System.out.println(v);
	
	System.out.println("Using The RemoveAll Method Variable v and v1  ");
	v.removeAll(v1);
	System.out.println(v);
 	
	Set<Object>v2 = new TreeSet<>();
	System.out.println(v2);
	
	v2.add(44);
	v2.add(3);
	v2.add(57);
	System.out.println("Print The v2 Elements");
	System.out.println(v2);
	
	System.out.println("Print The v Elements");
	System.out.println(v);
	
	System.out.println("useing The addAll Method Variable v and v2");
	v.addAll(v2);
	System.out.println(v);
	
	System.out.println("useing The Remove Method for Variable v ");

	v.remove("vijay");
	System.out.println(v);
	
	//v.retainAll(v2);
	//System.out.println(v);
	System.out.println("useing The addAll Method Variable v2 and v");
	v2.addAll(v);
	System.out.println(v2);
	
	v2.add(27);
	System.out.println("Using The RemoveAll Method Variable v and v2 ");
	v2.removeAll(v);
	System.out.println(v2);
 	
 		
	}
	

}
