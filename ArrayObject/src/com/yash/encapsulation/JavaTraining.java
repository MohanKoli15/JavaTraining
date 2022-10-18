package com.yash.encapsulation;

import java.util.logging.Logger;

public class JavaTraining {

	public  static final Logger logger = Logger.getLogger(JavaTraining.class.getName());

	// Declaration
	int id;
	String trainer;
	String notebook;
	String mouse;
	String laptop;

//Paramaterized constructor
	public JavaTraining(int id, String trainer, String notebook, String mouse, String laptop) {
		super();
		this.id = id;
		this.trainer = trainer;
		this.notebook = notebook;
		this.mouse = mouse;
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "JavaTraining [id=" + id + ", trainer=" + trainer + ", notebook=" + notebook + ", mouse=" + mouse
				+ ", laptop=" + laptop + "]";
	}

	public void display() {
		 System.out.println("Id :"+id +"Trainer Name :"+trainer +"Notebook :"+notebook+"Mouse :"+mouse+"Laptop:"+laptop);

	}

	public static void main(String args[]) {

		// crate the object and declaration of object.

		JavaTraining[] obj = new JavaTraining[5];

		obj[0] = new JavaTraining(1, "Snehal", "Cello", "optical", "lenovo");
		obj[1] = new JavaTraining(2, "Dipak", "Cell", "wireless", "Dell");
		obj[2] = new JavaTraining(3, "Mohan", "RoughBook", "wired", "Thinkpad");
		obj[3] = new JavaTraining(4, "Nilesh", "", "optical", "lenovo1");
		obj[4] = new JavaTraining(5, "Uddav", "Cel", "optical", "lenovo2");

		for (int i = 0; i<obj.length; i++) {

			System.out.println("Retrived from the array of training object::::" + obj[i]);
			
			logger.info("Mohan");
			//logger.log(null, "My Message", i);

			
		}
	}

}
