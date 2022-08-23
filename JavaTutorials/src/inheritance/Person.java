package inheritance;

public class Person {
	
	protected String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Inside Person Comstructor");
	}
	
	public void walk() {
		System.out.println("Person "+name +" is talking");
	}
	
	public void eat() {
		System.out.println("Person " +name +" is eating");
	}
	
	public static void laughing() {
		System.out.println("person is laughing");
	}
	
}
