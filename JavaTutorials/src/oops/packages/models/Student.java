package oops.packages.models;

public class Student {
	
	public String name; // if this would have been private there would be a error in MainMethod class

	public Student(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}

}
