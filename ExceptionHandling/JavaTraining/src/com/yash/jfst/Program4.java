package com.yash.jfst;

public class Program4 {

	public static void main(String[] args) {
	String s="MohanKoli";
	char s1[]=s.toCharArray();
	
	int count=0;
	for(int i=0;i<=s1.length-1;i++)
	{
		for(int j=i+1;j<=s1.length-1;j++)
		{
			if(s1[i]==s1[j])
			{
				count++;
				System.out.println("Repeated charchter is : "+s1[j]);
			}
		}
	}
	}

}
