package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		t.name ="Mr. Harry";
//		
//		t.eat();
//		
//		t.walk();
//		
//		t.teach();
//		
//		Singer s = new Singer();
//		
//		s.name = "Oprah";
//		
//		s.sing();
//		
//		s.eat();
//		Teacher t1 = new Teacher();
//
//		Singer s1 = new Singer("Oprah");
//		
//		Person p = new Person();
//		
//		p=t1;
//		
//		Teacher t = (Teacher)p; //at compile it is not known that p is teacher or not, it is known at runtime 
//		
//		boolean yo = t1 instanceof Teacher;
//		
////		System.out.println(yo);
//		System.out.println(t1 instanceof Teacher);
//		System.out.println(s1 instanceof Singer);
//		System.out.println(t1 instanceof Person);
//		
//		System.out.println(t instanceof Person);
		
		
		Teacher t1 = new Teacher("Mr. Harry");
		Singer s1 = new Singer("Ophra");
		System.out.println(s1 instanceof Person);
	}

}
