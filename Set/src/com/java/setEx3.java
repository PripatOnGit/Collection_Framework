package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s3 = new HashSet();
		s3.add(20);
		s3.add(10);
		s3.add(30);
		s3.add(50);
		s3.add(40);
		s3.add(10);
		s3.add(10);
		s3.add(10);
		
		Iterator itr = s3.iterator();
		
		while(itr.hasNext()) {
		
		
		System.out.println(itr.next()); 
		}
				

	}

}
