package com.java;

import java.util.ArrayList;
import java.util.Collections;

class Emp6 implements Comparable<Emp6>{
	int E6Id;
	String E6Name;
	
	Emp6(int E6Id, String E6Name){
		this.E6Id = E6Id;
		this.E6Name = E6Name;
	}
	
	
	@Override
	public int compareTo(Emp6 e6) {
		// TODO Auto-generated method stub
		
		return E6Name.compareTo(e6.E6Name);  
	}
	
}

public class arrayListEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Emp6> al6 = new ArrayList<Emp6>();
		
		al6.add(new Emp6(2,"bbb"));
		al6.add(new Emp6(4,"ddd"));
		al6.add(new Emp6(3,"ccc"));
		al6.add(new Emp6(1,"aaa"));
		
		Collections.sort(al6);  
		
		for(Emp6 e61:al6) {
			System.out.println(e61.E6Id+"----"+e61.E6Name);  
		}

	}

}
