package com.finsoft.core;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> c=new Stack<Integer>();
		c.push(25);
		c.push(85);
		c.push(78);
		c.push(90);
		for(Integer i1:c)
		{
			System.out.println(i1);
		}
		c.pop();
		
	}

}
