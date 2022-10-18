package com.yash.oops.encapsulation;

public class JavaTraining {
	
	//Requirement
	
		String trainer;
		String mouse;
		String laptop;
		String whiteborad;
		String projector;
		String pen;
		String keyboard;
		String noteBook;
		
		//Taking getter setter
		
		public void requirement(String trainer,String mouse,String laptop,String whiteboard,String projector,String pen,String keyboard,String notebook)
		{
			this.trainer=trainer;
			this.mouse=mouse;
			this.keyboard=keyboard;
			this.laptop=laptop;
			this.whiteborad=whiteboard;
			this.projector=projector;
			this.pen=pen;
			this.noteBook=notebook;
			
		}
		
		public String getTrainer() {
			return trainer;
		}
		public void setTrainer(String trainer) {
			this.trainer = trainer;
		}
		public String getMouse() {
			return mouse;
		}
		public void setMouse(String mouse) {
			this.mouse = mouse;
		}
		public String getLaptop() {
			return laptop;
		}
		public void setLaptop(String laptop) {
			this.laptop = laptop;
		}
		public String getWhiteborad() {
			return whiteborad;
		}
		public void setWhiteborad(String whiteborad) {
			this.whiteborad = whiteborad;
		}
		public String getProjector() {
			return projector;
		}
		public void setProjector(String projector) {
			this.projector = projector;
		}
		public String getPen() {
			return pen;
		}
		public void setPen(String pen) {
			this.pen = pen;
		}
		public String getKeyboard() {
			return keyboard;
		}
		public void setKeyboard(String keyboard) {
			this.keyboard = keyboard;
		}
		public String getNoteBook() {
			return noteBook;
		}
		public void setNoteBook(String noteBook) {
			this.noteBook = noteBook;
		}
		@Override
		public String toString() {
			return "JavaTraining [trainer=" + trainer + ", mouse=" + mouse + ", laptop=" + laptop + ", whiteborad="
					+ whiteborad + ", projector=" + projector + ", pen=" + pen + ", keyboard=" + keyboard
					+ ", noteBook=" + noteBook + "]";
		}

//		public String campareTo(JavaTraining jt,JavaTraining jt1 ) {
//			// TODO Auto-generated method stub
//			if(jt==jt1) 
//			{
//				return jt;
//			}
//			else
//				{
//				return -1;
//				}
//			return null;
		}
		


