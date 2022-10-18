package com.yash.oops.abstraction;

import java.util.logging.Logger;

public class Test implements A,B,C{
	@Override
	public  void m1() {
	System.out.println("This is M1() Method");
		
	}

	@Override
	public void add() {
		System.out.println("This is add() Method");

	
	}
	@Override
	public void display() {
		System.out.println("This is Display() Method");
	}
	public static void main(String[] args) {
		// Logger logger = Logger.getLogger(Test.class.getName());
		Test t=new Test();
		t.add();
		t.m1();
		t.display();

	}
	
}
