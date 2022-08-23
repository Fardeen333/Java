package f_sorting;

import java.util.Arrays;

public class J_ChocolateDistribution {

	public static void main(String[] args) {

		int arr[] = {7,3,2,4,9,12,56};
		System.out.println(chocolateDistribution(arr, arr.length, 3));
		
		int brr[] = {3,4,1,9,56,7,9,12};
		System.out.println(chocolateDistribution(brr, brr.length, 5));
		
		 int crr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
		 System.out.println(chocolateDistribution(crr, crr.length, 7));
		
	}
	
	public static int chocolateDistribution(int arr[], int n, int m) {
		if(m > n) return -1;
		Arrays.sort(arr);
		int res = arr[m-1] - arr[0];
		for(int i=1; i<n-(m-1); i++) {
			res = Math.min(res, arr[m+i-1] - arr[i]);
		}
		return res;
	}

}
