package com.finsoft.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(245);
		al.add(500);
		al.add(33);
		Iterator itr=al.iterator();
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
		}  */
		for(Object o: al)
		{
			System.out.println(o);
		}
		
	}

}
