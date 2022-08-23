package c_recursion;

public class IIIIIIIII_JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(josephus(5, 3));
		System.out.println(josephus(4, 3));
		System.out.println(josephus(3, 3));
		System.out.println(josephus(2, 3));
		System.out.println(josephus(1, 3));

	}
	
	public static int josephus(int n, int k) {
		if(n==1) {
			return 0;
		}
		return (josephus(n-1, k) + k ) % n;
	}

}
