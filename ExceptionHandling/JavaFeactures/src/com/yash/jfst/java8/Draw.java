package com.yash.jfst.java8;

public interface Draw {
void circle();
default void square() {
	
	System.out.println("This method is used to draw square");
}
static void cube()
{
	
System.out.println("this method is used to draw cube");
}
}
