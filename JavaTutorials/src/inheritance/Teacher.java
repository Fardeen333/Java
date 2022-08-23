package inheritance;

public class Teacher extends Person {
	
	
	public Teacher(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		System.out.println("inside teacher constructor");
	}

	public void teach() {
		System.out.println(name+ " is teaching");
	}
	
	public void eat() {
		super.eat();
		System.out.println("teacher "+name +" is eating");
	}
	
	public static void laughing() {
		System.out.println("teacher is laughing");
	}

}
