package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListEx7 {
	
	public static void main(String[] args)
	{
	
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(12);
	al1.add(11);
	al1.add(15);
	al1.add(13);
	al1.add(14);
	
	Iterator<Integer> itr1 = al1.iterator();
	
	while(itr1.hasNext()) {
		System.out.println(itr1.next());  
	}
	}
}
