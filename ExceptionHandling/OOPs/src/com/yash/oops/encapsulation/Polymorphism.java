package com.yash.oops.encapsulation;

public class Polymorphism implements Comparable<Polymorphism> {


		    String board = "";
		    int chairs;
		    int trainers;
		    int systems;
		    int window; // variable declaration
		    int keyboard;
		    int mouse;



		   public void setter(String b, int c, int t, int s, int w) {
		        this.board = b;
		        this.chairs = c;
		        this.systems = s;
		        this.trainers = t;
		        this.window = w;
		    }



		   public void setter(String b, int c, int t, int s, int w, int k, int m) { // overload setter method with two new
		                                                                                // parameters
		        this.board = b;
		        this.chairs = c;
		        this.systems = s;
		        this.trainers = t;
		        this.window = w;
		        this.keyboard = k;
		        this.mouse = m;
		    }



		   public String getBoard() {
		        return board;



		   }



		   public int getChairs() {
		        return chairs;
		    }



		   public int getSystem() {
		        return systems;
		    }



		   public int getTrainers() {
		        return trainers;
		    }



		   public int getWindow() {
		        return window;
		    }



		   public void display1() {
		        System.out.println("this is :" + board);
		        System.out.println("number of chairs :" + chairs + "\n" + "number of system :" + systems + "\n"
		                + "number of trainers :" + trainers + "\n" + "number of window :" + window + "\n");



		   }



		   public void display2() {
		        System.out.println("this is :" + board);
		        System.out.println("number of chairs :" + chairs + "\n" + "number of system :" + systems + "\n"
		                + "number of trainers :" + trainers + "\n" + "number of window :" + window);
		        System.out.print("number of mouse :" + mouse + "\n" + "number of keyboard:" + keyboard+"\n");



		   }


		   @Override
		    public String toString() {
		        return "PloymorphismDemo [board=" + board + ", chairs=" + chairs + ", trainers=" + trainers + ", systems="
		                + systems + ", window=" + window + ", keyboard=" + keyboard + ", mouse=" + mouse + "]";
		    }



		@Override
		public int compareTo(Polymorphism p) {
			// TODO Auto-generated method stub
			if(chairs==p.chairs) {
				
		}
			return chairs;
			
		}


		   
		
}
