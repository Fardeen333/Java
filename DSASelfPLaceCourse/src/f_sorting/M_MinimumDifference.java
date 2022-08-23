package f_sorting;

import java.util.Arrays;

public class M_MinimumDifference {

	public static void main(String[] args) {
		int a[] = {1,8,12,5,18};
		int b[] = {8,15};
		int c[] = {8,-1,0,3};
		int d[] = {10};
		
		System.out.println(getMinDiff(a, a.length)+" "+getMinDiff(b, b.length)+" "+getMinDiff(c, c.length)+" "+getMinDiff(d, d.length));
		System.out.println(getMin(a, a.length)+" "+getMin(b, b.length)+" "+getMin(c, c.length)+" "+getMin(d, d.length));

	}
	//Naive Approach O(N^2) time and O(1) space
	public static int getMinDiff(int arr[], int n) {
		int res = Integer.MAX_VALUE;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				res = Math.min(res, Math.abs(arr[i] - arr[j]));
			}
		}
		return res;
	}
	
	//Efficient Approach O(nlogn) time and O(1) space
	public static int getMin(int arr[], int n) {
		Arrays.sort(arr);
		int res = Integer.MAX_VALUE;
		for(int i=1; i<n; i++) {
			res = Math.min(res, arr[i] - arr[i-1]);
		}
		return res;
	}

}
