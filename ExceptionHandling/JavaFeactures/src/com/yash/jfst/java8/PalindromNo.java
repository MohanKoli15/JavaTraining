package com.yash.jfst.java8;

import java.util.Scanner;

public class PalindromNo {
	
	  public static void main(String[] agrs) {
	        int num = 5225;
	        String s = String.valueOf(num);
	        String s1 = "";
	        // System.out.println(s);



	       for (int i = s.length() - 1; i >= 0; i--) {
	            s1 = s1 + s.charAt(i);
	        
	        }
	        System.out.println(s);



	       if (s.equals(s1)) {
	            System.out.println("Palidrome num");
	        } else {
	            System.out.println("Not Palidrome num");
	        }



	   }

	}



