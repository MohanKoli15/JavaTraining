package com.yash.jfst;

import java.util.Scanner;

public class InsertIndex {
	static int index;
	   public static void main(String[] args) {
	       System.out.println("Enter the First String :");
	       Scanner sc = new Scanner(System.in);
	       String string1 = sc.nextLine();
	       System.out.println();
	       System.out.println("Enter the Second String :");
	       String string2 = sc.nextLine();
	       System.out.println();
	       System.out.println("Enter the index at which you want to insert second word :");
	       if (sc.hasNextInt()) {
	           index = sc.nextInt();
	           String s4 = string1.substring(0, index);
	           String s5 = string1.substring(index, string1.length());
	           System.out.println(s4 + " " + string2 + " " + s5 + " ");

	       } else {
	           System.out.println("You have enter wrong input refresh the page and try again");

	       }
	   }
}
