package com.finsoft.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Iterator;

public class HashSetEg {
	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(245);
		s1.add(500);
		s1.add(33);
		s1.add(33);
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}  

	}

}
