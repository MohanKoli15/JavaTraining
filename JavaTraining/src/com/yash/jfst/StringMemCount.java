package com.yash.jfst;

public class StringMemCount {
	public static void main(String[] args) {
		String s1 = "yash";
		String s2 = new String("yash");
		if (s1.equals(s2) == true) {
			System.out.println("1 object is created in scp");
			System.out.println("1 object is created in heap");
		} else if (s1.equals(s2) == false) {
			System.out.println("2 object is created in scp");
			System.out.println("1 object is created in scp");
		}
	}
}
