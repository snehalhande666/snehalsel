package com.finsoft.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMax {
	@Test
	public void testFindMax(){
		assertEquals(4,MaxValue.findMax(new int[]{1,3,4,2}));
		assertEquals(-2,MaxValue.findMax(new int[]{-12,-5,-3,-4,-2}));
		
	}
	
	
	

}
