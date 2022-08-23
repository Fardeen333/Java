package h_hashing;

import java.util.*;

public class N_LargestSubArrayWithEqulaNumberof0and1 {

	public static void main(String[] args) {
		
		int a[] = {1,0,1,1,1,0,0};
		int b[] = {0,0,1,1,1,1,10};
		int c[] = {0,0,1,0,1,1};
		int d[] = {1,1,1,1,1,1};
		
		System.out.println(largestSubArray(a, a.length)+" "+largestSubArray(b, b.length)+" "+largestSubArray(c, c.length)+" "+ largestSubArray(d, d.length));
		System.out.println(largestSubArray1(a, a.length)+" "+largestSubArray1(b, b.length)+" "+largestSubArray1(c, c.length)+" "+ largestSubArray1(d, d.length));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int largestSubArray(int arr[], int n) {
		int res = 0;  
		for(int i=0; i<n; i++) {
			int c0=0;
			int c1= 0;
			for(int j=i; j<n; j++) {
				if(arr[j] == 0) {
					c0++;
				}else {
					c1++;
				}
				if(c0==c1) {
					res =  Math.max(res, c0+c1);
				}
				
			}
			
		}
		return res;
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static int largestSubArray1(int arr[], int n) {
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				arr[i] = -1;
			}
		}
		
		return largestSumSubArray(arr,n,0);
	}

	public static int largestSumSubArray(int[] arr, int n, int sum) {
		HashMap<Integer, Integer> m = new HashMap<>();
		int res = 0;
		int prefixSum = 0;
		for(int i=0; i<n; i++) {
			prefixSum += arr[i];
			if(prefixSum == sum) {
				res = i + 1;
			}
			if(m.containsKey(prefixSum) == false ) {
				m.put(prefixSum, i);
			}
			if(m.containsKey(prefixSum-sum)) {
				res = Math.max(res, i - m.get(prefixSum-sum));
			}
		}
		return res;
	}

}
