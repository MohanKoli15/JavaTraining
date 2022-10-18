package com.yash.jfst.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {
	public static void main(String[] args) {
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(new Product(1,"TV",34000));
		p.add(new Product(2,"Mobile",30000));
		p.add(new Product(3,"AC",45000));
		p.add(new Product(4,"Refrigator",14000));
		p.add(new Product(5,"Fan",4000));
		System.out.println("Product details are:"+p);
		
		/*
		 * for(Product po:p) { if(po.getPrice()<=5000) {
		 * System.out.println("Name of the Product whose price is less tnan 5000 :"+po.
		 * getPrice()); } }
		 */
		
		ArrayList<Product>proprice=(ArrayList<Product>)p.stream().filter(po->po.getPrice()<=5000).collect(Collectors.toList());
		System.out.println(proprice);
	}

	

}
