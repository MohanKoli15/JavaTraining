package com.yash.multithreading;

public class MyApp extends Thread
{
public void A() {
	
	System.out.println("This is First Method");

}
public void B()
{
	System.out.println("This is Second Method");
}
public void C() {
	System.out.println("This is Three Method");
	}

public void D()
{
	System.out.println("This is Four Method");
}
public void E()
{
	System.out.println("This is Five Method");
}
public static void main(String[] args) {
	MyApp a= new MyApp();
	a.A();
	a.B();
	a.C();
	a.D();
	a.E();
}

}