package com.yash.jfst.array;
public class Program2 {
	public static void main(String[] args) {

		int a[] = { 10, 10, 20, 20, 30, 40, 30, 40, 10 };

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j] && j < i) {
					break;
				}

				if (a[i] == a[j]) {
					count++;
					count++;
				}

			}

			if (count > 1) {
				System.out.println(a[i] + " is repeating " + count + " times ");

			}

		}

	}}
