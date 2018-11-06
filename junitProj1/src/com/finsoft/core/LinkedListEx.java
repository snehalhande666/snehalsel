package com.finsoft.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {
	public static void main(String[] args) {
		List<Integer> al=new LinkedList<Integer>();
		al.add(245);
		al.add(500);
		al.add(33);
		ListIterator litr=al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.());
		}  

	}
}
