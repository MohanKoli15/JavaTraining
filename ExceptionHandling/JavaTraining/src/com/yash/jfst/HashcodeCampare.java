package com.yash.jfst;

public class HashcodeCampare {
	 public static void main(String[] args) {
	        
	        String str1="";
	        System.out.println(str1.hashCode());
	        String name =new String("YASH");
	        
	        String newName="YASH";
	        
	        System.out.println("newKKytt"+name==newName);//Reference comparision
	        System.out.println("Value is:"+name+" Hashcode:"+name.hashCode());
	        name=new String ("YASH MAGARPATTA");
	        System.out.println("Value is:"+name+" Hashcode:"+name.hashCode());
	        
	        
	        
	        System.out.println("Reference"+ name==name);//Reference comparision
	        System.out.println("Content "+name.equals(name));//Content comparision
}
	 
}
