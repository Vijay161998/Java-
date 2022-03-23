package com.interface1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Iterator1 {
	
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
		s.add(88);
		s.add(0,34.3);
		System.out.println(s);
	
		
	
		ListIterator<Object> v = s.listIterator();
		
		//for (Object object : s) {
			//System.out.println(object);   Forward Order
		//}
			
			while (v.hasNext()) {    //forward Order
				
				Object next=v.next();            
				System.out.println(next);
				
			
		}
			
                 while (v.hasPrevious()) {    //backward Order
				
				Object next=v.previous();            
				System.out.println(next);
				
			
		}
	}

}
