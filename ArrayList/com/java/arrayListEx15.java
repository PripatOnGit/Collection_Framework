package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Emp5 implements Comparable{
	int e5Id;
	String e5Name;
	
	Emp5(int e5Id,String e5Name){
		
		this.e5Id = e5Id;
		this.e5Name = e5Name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Emp5 e55 = (Emp5)o;
		
		return e5Name.compareTo(e55.e5Name); 
//		return -e5Name.compareTo(e55.e5Name); // decending order
//		return e5Id.compareTo(e55.e5Id);
	}
	
}
public class arrayListEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<Emp5> al5 = new ArrayList<Emp5>();
		
		al5.add(new Emp5(2, "aae"));
		al5.add(new Emp5(4, "abz"));
		al5.add(new Emp5(1, "ccc"));
		al5.add(new Emp5(5, "baa"));
		al5.add(new Emp5(3, "ddd"));
		
		Collections.sort(al5);
		
		for( Emp5 e5: al5) {
			System.out.println(e5.e5Id+" "+e5.e5Name); 
		}
	}

}
