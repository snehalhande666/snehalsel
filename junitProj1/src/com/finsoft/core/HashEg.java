package com.finsoft.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashEg {
	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		Studentt st1=new Studentt(1,"raam");
		Studentt st2=new Studentt(2,"shyam");
		Studentt st3=new Studentt(3,"radha");
Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}  
}
}

