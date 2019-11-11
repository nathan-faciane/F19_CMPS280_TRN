package CMPS280;
import java.util.ArrayList

public abstract class teachers {
	
	//data fields
	int index;
	String tname;
	
	//defalt constructor
	teachers(){}
	
	//create an arraylist for teachers from the user input
	static ArrayList<String> teachersname = new ArrayList();
			
	//set method for the teachers name 
			void setTeachersname(String tname) {
				teachersname.add(tname);
			}
			//get method for the teachers name
			String getTeachersname(int index) {
					return.tname;
			}
	

}
