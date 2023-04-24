package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		//put values in map
		//Map-1
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Priyanka");
		System.out.println(m);
		
		//Map-2
		Map<Integer, String> m2 = new HashMap<>();
		m2.putAll(m);
		m2.put(4, "Arjun");
		//m2.put(null, null);
		m2.putIfAbsent(3, "Abhijeet");
		
		System.out.println(m2);
		
		//Get values form map
		System.out.println(""+m2.get(4));
		
		//Replace value
		m2.replace(4, "SEAL");
		System.out.println(m2);
		
		//Remove value
		m2.remove(4);
		System.out.println(m2);
		
		//keyset- values - entryset
		System.out.println(m2.keySet());
		System.out.println(m2.values());
		System.out.println(m2.entrySet());
	}
}
