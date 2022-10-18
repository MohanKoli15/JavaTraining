package com.yash.tdddemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Calculator_Test {
	@Before
	public void set()
	{
	System.out.println("this is set method:");	
	
	}
	
	@Test
	
	public void test_GivenAddition_Shoude_Return_AddResult() {
		Calculator c=new Calculator();
		int result=c.add(10,2);
		assertEquals(result,12);
	}
	@After
	
	public void display()
	{
		
		System.out.println("This is the display method");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("this the after class method");
	}

	

}
