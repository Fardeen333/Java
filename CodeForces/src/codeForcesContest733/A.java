package codeForcesContest733;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			
			System.out.println(number(n));
		}
			

	}
	
	public static long number(long n) {
		return largestNumber(n) ;
	}
	
	public static long largestNumber(long n) {
		long res = 0;
		while(n!=0) {
			res = Math.max(res, n%10);
			n/=10;
		}
		return res;
	}

}
