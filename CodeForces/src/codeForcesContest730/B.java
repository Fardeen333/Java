package codeForcesContest730;

import java.util.*;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println(minimum(arr, n));
			
			
		}

	}
	
	public static int minimum(int arr[], int n) {
		Arrays.sort(arr);
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
			sum -= arr[0];
		}
		int leftSum = 0;
		for(int i=1; i<n-1; i++) {
			leftSum += arr[i-1];
			sum -= arr[i];
			int x = sum - leftSum;
			if((leftSum+x)==sum) {
				return sum - x;
			}
			
		}
		return n;
	}

}
