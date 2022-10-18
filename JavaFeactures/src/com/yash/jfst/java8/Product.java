package com.yash.jfst.java8;

public class Product {
	int id;
	String product_Name;
	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int id, String product_Name, double price) {
		super();
		this.id = id;
		this.product_Name = product_Name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_Name=" + product_Name + ", price=" + price + "]";
	}

	

	
}
