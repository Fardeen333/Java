package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Pet p = d;
//		Pet p = new Pet();
		Animal a = d;
//		
//		
		d.walk();
		p.walk();
//		greetings("Good Morning");
//		greetings();
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		
		
	}

	public static void greetings() {
		System.out.println("Hi there");
	}
	public static void greetings(String s) {
		System.out.println(s+"wertyuiop");
	}
}

