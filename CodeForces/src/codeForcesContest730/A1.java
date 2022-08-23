package codeForcesContest730;

import java.util.*;
public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			maxExcitement(a, b);
			
		}
		
		
	}
	
	public static void maxExcitement(long a , long b) {
		
		long maxExcitement = Math.abs(a-b);
		if(maxExcitement == 0) {
			System.out.println(0+" "+0);
			return;
		}
		if(maxExcitement == 1) {
			System.out.println(1+" "+0);
			return;
		}
		long frwd = maxExcitement - (a%maxExcitement);
		
		long prev = a - (maxExcitement * (a/maxExcitement));
		
		System.out.println(maxExcitement+" "+Math.min(frwd , prev));
	}
	
	public static long euclidGcd(long a, long b) {
		if(b==0) {
			return a;
		}
		return euclidGcd(b, a%b);
	}

}
