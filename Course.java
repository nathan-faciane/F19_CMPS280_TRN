package CMPS280;

//the overall goal of this class is to show what courses are available for the student. 

public class Course {
	//add the data fields  
	public  String[][] courseNames = new String[][] {
	//add the course names 	
		{"Intro Into Computer Technology" , "Computers in Society", "Algorithm Design and Implementation I"},
		{"Software Applications", "Desktop Publishing", "Discrete Structures", "Introduction into Assembly Language"}
		};
	
	//add the constructor  
	Course(){
		
	}
	
	
	//add the coursesAvailable method  
	
	public void showCourses(){
		//create a for loop to show the names of the courses. 
		for (int i = 0; i < courseNames.length; i++) {
			for (int j = 0; j < courseNames[i].length; j++ ) {
				//show the elements within the array 
				System.out.print(courseNames[i][j] + "\n");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		//create an instance of an object 
		Course ob1 = new Course(); 
		
		//call the method 
		ob1.showCourses();
	
	
	
}//end the main

}// end the class


