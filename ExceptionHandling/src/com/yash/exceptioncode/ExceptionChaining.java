package com.yash.exceptioncode;
/**
 * 
 * @author mohan.koli
 *
 */
public class ExceptionChaining {
	
	public static void main(String[] args) {
	      try {
	         // creating an exception
	         ArithmeticException e = new ArithmeticException("Apparent cause");
	         // set the cause of an exception
	         e.initCause(new NullPointerException("Actual cause"));
	         // throwing the exception
	         throw e;
	      } catch(ArithmeticException e) {
	         // Getting the actual cause of the exception
	         System.out.println(e.getCause());
	      }
	   }
}
