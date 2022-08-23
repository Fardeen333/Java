package methods;

public class Introduction {

	public static void main(String[] args) {
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber,secondNumber);  //method calling
		
		System.out.println(result);
		
		maxOf(5);
		
//		sayHi();
//		
//		sayHi();
	}
	static int maxOf(int a , int b) {
		return a>b?a:b;
	}
	
	static void maxOf(float d) {
		System.out.println("yes it's running");
	}
	
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
	
//	static int maxOf(float a, float b) {
//		return 1;
//	}

}
