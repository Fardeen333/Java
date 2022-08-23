package codeForcesContest735;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				long arr[] = new long[n];
				for(int i=0; i<n; i++) {
					arr[i] = sc.nextInt();
				}
				maximum(arr, n);
			}
		}
	}
	
	public static void maximum(long arr[], int n) {
		
		long res = 0 ;
//		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			long a = arr[i];
			long b = arr[i+1];
			res = Math.max(res, a*b);
		}
		System.out.println(res);
	}
	

}
