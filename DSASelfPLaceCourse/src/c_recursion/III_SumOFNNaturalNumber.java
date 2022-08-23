package c_recursion;

public class III_SumOFNNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(1));
		System.out.println(getSum(5));
		System.out.println(getSum(4));
	}
	
	
	//O(n) 
	public static int getSum(int n) {
		if(n==1) {
			return n;
		}
		return n + getSum(n-1); 
	}

}
