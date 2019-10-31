package CMPS280;
import java.util.Scanner;

public class Teacher {
//add the data fields  

public static String[][] nameofTeachers = new String[][] {
//add the course names
{"1. Bonnie Achee" , "2. John Burris", "3. Steele Russel"},
{"4. Omer Soysal", "5. Quoc-Nam Tran", "6. Matthew McNulty", "7. Patrick McDowell"}
};

//add the constructor  
Teacher(){

}
//add the teachers that are available method  

public void displayTeachers(){
//create a for loop to show the names of the courses.
for (int i = 0; i < nameofTeachers.length; i++) {
for (int j = 0; j < nameofTeachers[i].length; j++ ) {
//show the elements within the array
System.out.print(nameofTeachers[i][j] + " ");
}
System.out.println();
}

}
//this is meant to test code

public static void main(String[] args) {
//create an instance of the class
Teacher ob1 = new Teacher();

//call the method
ob1.displayTeachers();
