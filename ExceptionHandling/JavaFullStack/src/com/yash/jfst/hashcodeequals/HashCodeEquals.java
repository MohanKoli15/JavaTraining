package com.yash.jfst.hashcodeequals;

public class HashCodeEquals {

	public static void main(String[] args) {
		//object creation
	Student s=new Student(1,"Mohan");
	Student s1=new Student(2,"Mohan");
	
	//generating Hashcode
	System.out.println("Oject1 Hashcode :"+s.hashCode());
	System.out.println("Object2 Hashcode :"+s1.hashCode());
	
	//converting Student object into String 
	String str=s.toString();
	String str1=s1.toString();
	
	//checking using == operator
	System.out.println(s==s1);
	
	//System.out.println("checking using == operator :",+ s==s1);
	
	System.out.println("Checking the equality bet s and s1 :"+s.equals(s1));
	}

}
