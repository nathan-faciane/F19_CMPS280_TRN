package CMPS280;
 
//this class inherits from Course/Student/Teacher 
public class section implements Course {

	String name;
	int num;
	
	
	
	public String getCourseName() {
		return this.name;
	}
	
	
	public Void setCourseName(String name) {
		this.name = name; 
		return null;
	}
	

	public int getCourseNum() {
		return this.num;
	}
	
	public Void setCourseNum(int num) {
		this.num = num;
		return null;
	}
	
	//create a constructor 
	public section (String name, int num ) {
		this.name = name; 
		this.num = num; 
	
	}
	
}//end the course class.
	

	
	
	
	
	


