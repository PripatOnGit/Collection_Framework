package com.collection;

import java.util.TreeMap;

public class mapEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        TreeMap mEx81 = new TreeMap();
		
		mEx81.put(33, "cc");  
		mEx81.put(111, "aa");
		mEx81.put(44, "dd");
		mEx81.put(222, "bb"); 

		System.out.println(mEx81);
		
//        TreeMap mEx82 = new TreeMap(mEx81);
		TreeMap mEx82 = new TreeMap();
         
		mEx82.put(333, "ccc");  
		mEx82.put(11, "aaa");
		mEx82.put(444, "ddd");
		mEx82.put(22, "bbb");  
		
		mEx81.putAll(mEx82);
//		
		System.out.println(mEx81); 
//		System.out.println(mEx82);


	}

}
