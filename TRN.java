//public static void main(String[] args) {

//Scanner input = new Scanner(System.in);
//import java.util.Scanner;

public class Student {
	public String FirstName;
	public String LastName;
    boolean CmpsMajor;
    
}

System.out.println(" Please enter your first name: "); // ask user to input first name 
FirstName = input.nextString();// take in the information from user
System.out.println(FirstName);// Print first name of student 

System.out.println( " Please enter your last name: ");// ask user to input last name
FirstName = input.nextString();// take in information from user 
System.out.println(LastName);// print last name of student


System.out.println(" Are you a Computer Science Major? "); // Ask for user input about their major
boolean yes = true; // set a value
boolean no = false; // set a value
CmpsMajor = input.nextBoolean();// take in information about major
if(CmpsMajor == true) {
System.out.println(" Major: Computer Science "); // print information about major 
else {
System.out.println(" Student is not a Computer Science Major. ");
}
}


}

