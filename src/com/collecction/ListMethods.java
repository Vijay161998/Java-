package com.collecction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class ListMethods {

	public static void main(String[] args) {
		 
		List<Object>s = new ArrayList<>();
		
		System.out.println(s);
	
		s.add(10);
		s.add(22);
		s.add(33);
		s.add("string");
		s.add('s');
		s.add(22);
		s.add(44);
		System.out.println(s);
		
		int size =s.size();
		System.out.println(size);
		
		Object object =s.get(4);
		System.out.println(object);
		
		s.add(5,63);
		System.out.println(s);
		
		s.set(1, 'r');
		System.out.println(s);
		s.remove(3);
		System.out.println(s);
		int size1 =s.size();
		System.out.println(size1);
		
		int indedxOf=s.indexOf(4);
		System.out.println(indedxOf);
		
		List<Object> ss = new Vector<>();
		ss.add(5);
		ss.add('h');
		ss.add(22);
		s.addAll(s);
		System.out.println(s);
		
		//s.retainAll(ss);
		//System.out.println(s);
		
		s.removeAll(ss);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		
	}

}


