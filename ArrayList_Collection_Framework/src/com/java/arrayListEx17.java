package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp7 {
	
	int e7Id;
	String e7Name;
	
	Emp7(int e7Id, String e7Name){
		this.e7Id = e7Id;
		this.e7Name = e7Name;
	}
	
}

class EidComp implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Emp7 e1 = (Emp7)o1;
		Emp7 e2 = (Emp7)o2;
		if(e1.e7Id == e2.e7Id) {
		return 0;		 
		}else if (e1.e7Id > e2.e7Id) {
			return 1;
		}else {
		return -1;
		}
		
	}
}

class EnameComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp7 e1 = (Emp7)o1;
		Emp7 e2 = (Emp7)o2;
		
		return e1.e7Name.compareTo(e2.e7Name);
	}
	
}

public class arrayListEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Emp7> al7 = new ArrayList<Emp7>();
		
		al7.add(new Emp7(2, "aae"));
		al7.add(new Emp7(4, "abz"));
		al7.add(new Emp7(1, "ccc"));
		al7.add(new Emp7(5, "baa"));
		al7.add(new Emp7(3, "ddd"));
		
		Collections.sort(al7, new EidComp());
		
		System.out.println("Employee ID Sorting : ");
		
		for( Emp7 e7: al7) {
			System.out.println(e7.e7Id+" "+e7.e7Name); 
		}
		
		Collections.sort(al7, new EnameComp());
		
		System.out.println("Employee Name Sorting : "); 
	for(Emp7 e7 : al7) {
		System.out.println(e7.e7Id+"-----"+e7.e7Name); 
	}

	}

}
