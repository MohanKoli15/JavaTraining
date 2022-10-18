package com.yash.jfst.java8;

public class Instance_Method {
	
		public void speak() {
			
			System.out.println("Hello,This is speak method");
		}
	public static void main(String[] args) {
		Instance_Method im=new Instance_Method();
		
		Greet2 g2=im::speak;
		g2.say();
		
		Greet2 s2=new Instance_Method()::speak;
		s2.say();
	}
	
}
