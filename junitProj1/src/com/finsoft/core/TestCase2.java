package com.finsoft.core;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase2 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("before class is called");
		@Before
		public void setUp() throws Exception
		{
			System.out.println("before any method called");
		}
		@Test
		public void testFindMax(){
			assertEquals(4,MaxValue.findMax(new int[]{1,3,4,2}));
			assertEquals(-2,MaxValue.findMax(new int[]{-12,-5,-3,-4,-2}));
			
		}
		@Test
		public void testCube()
		{
			System.out.println("test case cube");
			assertEquals(4,MaxValue.cube(3));
		}
		
	
		@After
		public void tearDown() throws Exception
		{
			System.out.println("after any method called");
		}
		@AfteClass
		public void tearDown() throws Exception
		{
			System.out.println("after any method called");
		}
		
		
	}

}
