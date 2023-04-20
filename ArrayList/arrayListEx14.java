package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Emp4 implements Comparable{ 
	int e4Id;
	String e4Name;
	
	Emp4(int e4Id, String e4Name){
		this.e4Id = e4Id;
		this.e4Name = e4Name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Emp4 e4  =  (Emp4) o;
		if(e4Id == e4.e4Id) {
		return 0;
		}else if(e4Id > e4.e4Id) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
	
	
	

	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		
//		Emp4 e41 = (Emp4)o;
//		if(e4Id == e41.e4Id) {
//		return e4Id;
//	}else if(e4Id > e41.e4Id) {
//		return 1;
//	}else {
//		return -1;
//	}
//}
}


public class arrayListEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Emp4> al4 = new ArrayList<Emp4>();
		al4.add(new Emp4(2, "eee"));
		al4.add(new Emp4(4, "aaa"));
		al4.add(new Emp4(1, "ccc"));
		al4.add(new Emp4(5, "bbb"));
		al4.add(new Emp4(3, "ddd"));
		
		Collections.sort(al4);    
		
		
		for(Emp4 e42 : al4) {
			System.out.println(e42.e4Id+" "+e42.e4Name); 
		}
	}

}
