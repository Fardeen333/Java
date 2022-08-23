package c_recursion;

public class IIIII_SumOfDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1234));
		System.out.println(sum(12345));
		System.out.println(sum(1));
	}
	
	public static int sum(int a) {
		if(a==0) {
			return 0;
		}
		return a%10 + sum(a/10);
	}

}
