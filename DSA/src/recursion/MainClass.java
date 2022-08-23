package recursion;

public class MainClass {
	
	static int count = 0;
	static int count1 = 0;
	

	public static void main(String[] args) {
		
//		System.out.println(sum(15));
		
//		System.out.println(pow(3,10000));
//		System.out.println(count);
//		System.out.println(powFast(3,10000));
//		System.out.println(count1);
		
		System.out.println(path(4,2));
		
	}
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sum(n-1);
	}
	
	public static int pow(int a , int b) {
		count++;
		if(b == 0) {
			return 1;
		}
		return a * pow(a, b-1);
	}
	
	public static int powFast(int a , int b) {
		count1++;
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0) {
			return powFast(a*a , b/2);
		}
		return a * powFast(a, b-1);
	}
	 public static int path(int n, int m) {
		 if(n == 1 || m == 1) {
			 return 1;
		 }
		 return path(n-1,m) + path(n, m-1);
	 }
	
	
	

}
