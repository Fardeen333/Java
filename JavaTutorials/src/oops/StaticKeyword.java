package oops;

//import oops.A.B;
//import oops.A.C;

public class StaticKeyword {
	
//	static public class Person{
//		int age;
//		static String breed ="Homo";
//	}
//	
	static {
		System.out.println("In block 1");
	}
	
	static {
		System.out.println("In block 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		A.B objB = objA.new B();
		
		A.C objC = new A.C();
		
		System.out.println("Inside main ");
		
//		Person perObj = new Person();
//		System.out.println(Person.breed);
//		perObj.breed="Fardeen";
//		System.out.println(Person.breed);
		Person p1 = new Person();
//		System.out.println(p1.breed);
		System.out.println(Math.PI);
//		p1.main1();
	}
	
	
	
	static {
		System.out.println("In block 3");
	}

}
