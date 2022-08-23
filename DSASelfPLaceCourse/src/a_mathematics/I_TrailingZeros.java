package a_mathematics;

public class I_TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(10));
		System.out.println(trailingZeros(10));

	}
	// nk time
	public static int factorial(int n) {
		int fact =1;
		for(int i =1; i<=n; i++) {
			fact*=i;
		}
		System.out.println(fact);
		int count = 0;
		while(fact%10==0) {
			count++;
			fact/=10;
		}
		return count;
	}
	
	//log n time
	public static int trailingZeros(int n) {
		int count =0;
		for(int i =5; i<=n; i*=5) {
			count += (n/5);
		}
		return count;
	}

}
