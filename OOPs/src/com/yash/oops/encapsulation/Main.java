package com.yash.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		JavaTraining jt=new JavaTraining();
		jt.setTrainer("Snehal Pawar");
		jt.setKeyboard("keypad");
		jt.setLaptop("Lenovo");
		jt.setMouse("optical");
		jt.setNoteBook("NotePad");
		jt.setPen("Cello");
		jt.setProjector("Projector");
		jt.setWhiteborad("Board");
		
		System.out.println(""+jt);
		JavaTraining jt1=new JavaTraining();
		jt1.setTrainer("Snehal Pawar");
		jt1.setKeyboard("keypad");
		jt1.setLaptop("Lenovo");
		jt1.setMouse("optical");
		jt1.setNoteBook("NotePad");
		jt1.setPen("Cello");
		jt1.setProjector("Projector");
		jt1.setWhiteborad("Board");
		
		System.out.println(""+jt1);
		
		System.out.println(jt.equals(jt1));
		System.out.println(jt.hashCode());
		System.out.println(jt1.hashCode());
		
		//System.out.println(jt.campareTo(jt1));
		
	}
	

}
