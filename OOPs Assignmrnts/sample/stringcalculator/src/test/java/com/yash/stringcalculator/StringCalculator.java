package com.yash.stringcalculator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class StringCalculator {

	StringCalculatorDemo c=new StringCalculatorDemo();
	@Test
	
	public void test_StringCalculator_GivenEmptyString_ShouldReturnZero()
	{
		StringCalculatorDemo c=new StringCalculatorDemo();
		assertEquals(c.calculate(""),0);
		 
	}
	@Test
public void test_String_Calculator_GivenSingleString_ShouldReturnValue()
{
		StringCalculatorDemo c=new StringCalculatorDemo();
	    assertEquals(c.calculate("2"),2);
	    
}
	public   void testArrayValues(){
	       String[] expectedvalues =   {"Renault", "Honda", "BMW"};
	       String[] givenvalues =   {"Renault", "Honda", "bmw"};
	         assertArrayEquals(expectedvalues,givenvalues);
	         }

 	@AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("After class");  
    }

	/*
	 * @Test(timeout = 500) public void testTimeoutonMethod() throws
	 * InterruptedException { while (true) { Thread.currentThread().sleep(1000); } }
	 */
 	@Test
 	 public void testObjects() 
 	 {    
 	     String obj1 = "Hello welcome to junit";
 	     String objcopy = obj1;
 	     String obj2 = "byee";
 	     assertNotSame(obj1,objcopy);
 	 }
	@BeforeClass
 	public static void setUpBeforeClass()     {
 		System.out.println("This is called before test start");
 	}
 	@AfterClass
 	public   void tearDownAfterClass1()  {
 		System.out.println("This is called after test end");
 	}
 	@Test
 	public void test() {
 		  assertTrue(false);
 	}
}