package h_hashing;

import java.util.*;

public class M_LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,-4,-4,9,-2,2};
		int b[] = {3,1,0,1,8,2,3,6};
		int c[] = {8,3,7};
		
		System.out.println(longestSubArray(a, a.length, 0)+" "+ longestSubArray(b, b.length, 5) +" "+ longestSubArray(c, c.length, 15));
		System.out.println(longestSubArray1(a, a.length, 0)+" "+ longestSubArray1(b, b.length, 5) +" "+ longestSubArray1(c, c.length, 15));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int longestSubArray(int arr[], int n, int sum) {
		int res = 0;
		for(int i=0; i<n; i++) {
			int curr_sum = 0;
			for(int j=i ;j<n; j++) {
				curr_sum += arr[j];
				if(curr_sum == sum) {
					int length = j-i+1;
					res = Math.max(res, length);
				}
			}
		}
		return res;
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static int longestSubArray1(int arr[], int n, int sum) {
		HashMap<Integer, Integer> m = new HashMap<>();
		int res = 0 ;
		int prefixSum = 0; 
		for(int i=0; i<n; i++) {
			prefixSum += arr[i];
			if(prefixSum == sum) {
				res = i+1;
			}
			if(m.containsKey(prefixSum) == false) {
				m.put(prefixSum, i);
			}
			if(m.containsKey(prefixSum - sum)) {
				res = Math.max(res, i - m.get(prefixSum - sum));
			}
		}
		return res;
	}

}
