package methods;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int c = 34;
//		int d =12;
//		
//		swap(c , d);
//		System.out.println(c +" "+d);
		Dog c = new Dog();
		Dog d = new Dog();
		c.legs=3;
		d.legs=4;
//		swap(c ,d);
		changeValue(c);
		
		System.out.println(c.legs+" "+d.legs);
		

	}

	static void swap(int a, int b) {
		int temp =a;
		a = b;
		b= temp;	
	}
	
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b= temp;
	}
	
	static void changeValue(Dog dog) {
		dog.legs=6;
	}
	
	
}
class Dog{
	int legs;
}
