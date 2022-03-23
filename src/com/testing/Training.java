package com.testing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Training {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("abc");
		StringBuffer s2 = new StringBuffer("ABC");
		
		synchronized (s2) {
			
			System.out.println(s1);
			
		}
	}

}


