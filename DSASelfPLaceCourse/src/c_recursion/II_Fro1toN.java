package c_recursion;

public class II_Fro1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}
	
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
		
		
	}

}
