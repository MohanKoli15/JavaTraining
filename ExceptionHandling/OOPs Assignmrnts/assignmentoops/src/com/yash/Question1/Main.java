package com.yash.Question1;

public class Main {

	public static void main(String[]agrs) {
	
	Department [] dept=new Department[2];
	dept[0]=new Department("dept 1", "IT");
	dept[1]=new Department("dept 2", "HR");
	
	Empolyee employee=new Empolyee("12500", " 8 feb ", " Pune", dept[0], "mohan.koli@yash.com", "8208898481");
	employee.EmpolyeeDisplay();
	
	Customer customer=new Customer("1","Mohan","pune","13 jully");
	customer.CustomerDisplay();
	
	
	}
}