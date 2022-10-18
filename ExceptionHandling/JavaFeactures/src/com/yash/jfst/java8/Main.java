package com.yash.jfst.java8;

public class Main implements Draw {
public static void main(String[] args) {
	Main m=new Main();
	m.circle();
	m.square();
	Draw.cube();
}

@Override
public void circle() {
	// TODO Auto-generated method stub
System.out.println("Draw Crcle");
}
}
