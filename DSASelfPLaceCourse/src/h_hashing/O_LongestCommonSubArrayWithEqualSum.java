package h_hashing;

import java.util.*;

public class O_LongestCommonSubArrayWithEqualSum {

	public static void main(String[] args) {
		
		int a[] = {0,1,0,0,0,0};
		int b[] = {1,0,1,0,0,1};
		
		int c[] = {0,1,0,1,1,1,1};
		int d[] = {1,1,1,1,1,0,1};
		
		int e[] = {0,0,0};
		int f[] = {1,1,1};
		
		int g[] = {0,0,1,0};
		int h[] = {1,1,1,1};
		
		System.out.println(longest(a, b, a.length)+" "+longest(c, d, c.length)+" "+longest(e, f, e.length)+" "+longest(g, h, g.length));
		System.out.println(longest1(a, b, a.length)+" "+longest1(c, d, c.length)+" "+longest1(e, f, e.length)+" "+longest1(g, h, g.length));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int longest(int arr[], int brr[], int n) {
		int res = 0;
		for(int i=0; i<n; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for(int j=i; j<n; j++) {
				sum1 += arr[j];
				sum2 += brr[j];
				if(sum1 == sum2) {
					res = Math.max(res,j-i+1);
				}
			}
		}
		return res;
	} 
	
	//Efficient Approach O(n) time and O(n) space
	public static int longest1(int arr[], int brr[], int n) {
		int temp[] = new int[n]; 
		for(int i=0; i<n; i++) {
			temp[i] = arr[i] - brr[i];
		}
		
		return longestSubArrayWithSumEqualToZero(temp, temp.length, 0);
	}

	public static int longestSubArrayWithSumEqualToZero(int[] temp, int n, int sum) {
		HashMap<Integer, Integer> m = new HashMap<>();
		int res =0;
		int prefixSum = 0;
		for(int i=0; i<n ;i++) {
			prefixSum += temp[i];
			if(prefixSum == sum) {
				res = i+1;
			}
			if(m.containsKey(prefixSum) == false) {
				m.put(prefixSum, i);
			}
			if(m.containsKey(prefixSum - sum)) {
				res = Math.max(res, i-m.get(prefixSum-sum));
			}
		}
		return res;
		
	}
	
	

}
