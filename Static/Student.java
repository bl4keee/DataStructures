package staticKeyword;

public class Student {

	int id;
	String name;
	static String education = "higher";
	
	// constructor
	Student (int i, String e) {
		id = i;
		name = e;
	}
	
	// method to display the values
	void displayValues() {
		System.out.println(id + " " + name + " " + education);
	}
}
