package com.yash.jfst;

public class Finalize {
	 public static void main(String[] args) {
	        System.out.println("Finalizedemo.main() starts");
	        String s = new String("Mohan Koli");

	       s = null;
	        System.gc();
	        System.out.println("Finalizedemo.main() ends");


	   }

	   public void finalize() {
	        System.out.println("Finalizedemo.finalize() called");
	    }


}
