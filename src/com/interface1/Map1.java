package com.interface1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map1 {

	public static void main(String[] args) {
		
		Map<Object,Object>m =new HashMap<Object, Object>();
		
		m.put(null, "R");
		m.put(null, "S");
		m.put(1, "java");
		m.put(2, "c++");
		m.put(4, "python");
		m.put(3, "c");
		m.put(5, "c++");
		m.put(7, null);
		
		m.put(8, null);
		
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		Object object = m.get(4);
		System.out.println(object);
		
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(83);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);
		
		Set<Entry<Object, Object>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		
		
	}
}
