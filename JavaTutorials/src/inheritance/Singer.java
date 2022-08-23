package inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		super(name);
		System.out.println("Inside Singer Constructor");
	}

	public void sing() {
		System.out.println(name +" is singing");
	}
	
	public void eat() {
		System.out.println("Singer "+name +" is eating");
	}

	
//	public static void laughing() {
//		System.out.println("singer is laughing");
//	}
}
