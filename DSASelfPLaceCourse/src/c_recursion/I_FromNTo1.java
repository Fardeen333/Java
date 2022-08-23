package c_recursion;

public class I_FromNTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(10);

	}
	
	public static void print(int n) {
		if(n==0) {
//			System.out.println("1");
			return;
		}
		
		System.out.print(n+" ");
		print(n-1);
		
	}
	

}
