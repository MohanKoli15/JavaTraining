package com.yash.oops.encapsulation;

public class Main1 {

	
		  public static void main(String[] args) {
		        // TODO Auto-generated method stub
			   Polymorphism p = new Polymorphism(); // object creation
			   Polymorphism p1 = new Polymorphism(); // object creation
		        p.setter("white board", 20, 32, 32, 2); // method calling
		        p.setter("white board", 20, 32, 32, 2, 32, 32);
		        
		        p.getBoard();
		        p.getChairs();
		        p.getSystem();
		        p.getTrainers();
		        p.getWindow();
		        p.display1();
		        
		        p1.setter("white board", 20, 32, 32, 2);
		        p1.getBoard();
		        p1.getChairs();
		        p1.getSystem();
		        p1.getTrainers();
		        p1.getWindow();
		        p1.display1();
		        p.display2();
		        //p1.display2();
		        System.out.println(p.hashCode());
		        System.out.println(p1.hashCode());
		        System.out.println(p.equals(p1));
		        
		        System.out.println(p.compareTo(p1));


		   }


	
}
