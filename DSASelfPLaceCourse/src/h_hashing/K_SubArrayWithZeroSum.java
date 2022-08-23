package h_hashing;

import java.util.HashSet;
import java.util.Set;

public class K_SubArrayWithZeroSum {

	public static void main(String[] args) {
		int a[] = {1,4,13,-3,-10,5};
		int b[] = {-1,4,-3,5,1};
		int c[] = {3,1,-2,5,6};
		int d[] = {5,6,0,8};
		
		System.out.println(zeroSumSubArray(a, a.length)+" "+zeroSumSubArray(b, b.length)+" "+zeroSumSubArray(c, c.length)+" "+zeroSumSubArray(d, d.length));
		System.out.println(zeroSumSubArray1(a, a.length)+" "+zeroSumSubArray1(b, b.length)+" "+zeroSumSubArray1(c, c.length)+" "+zeroSumSubArray1(d, d.length));

	}	
	//Naive Approach O(n^2) tine and O(1) space
	public static boolean zeroSumSubArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int sum =0;
			for(int j=i; j<n; j++) {
				sum+=arr[j];
				if(sum == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Efficient Approach O(n) time and O(n) space based on prefix technique and hashing
	public static boolean zeroSumSubArray1(int arr[], int n) {
		int prefixSum = 0;
		Set<Integer> s = new HashSet<>();
		for(int i=0; i<n; i++) {
			prefixSum += arr[i];
			if(s.contains(prefixSum)) {
				return true;
			}
			if(prefixSum == 0) {
				return true;
			}
			s.add(prefixSum);
		}
		return false;
		
	}

}
