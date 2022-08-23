package h_hashing;

import java.util.*;

public class L_SubArrayWithGivenSum {

	public static void main(String[] args) {
		int a[] = {5,8,6,13,3,-1};
		int b[] = {15,2,8,10,-5,-8,6};
		int c[] = {3,2,5,6};
		
		System.out.println(givenSum(a, a.length, 22)+" "+givenSum(b, b.length, 3)+" "+givenSum(c, c.length, 1));
		System.out.println(givenSum1(a, a.length, 22)+" "+givenSum1(b, b.length, 3)+" "+givenSum1(c, c.length, 10));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static boolean givenSum(int arr[], int n, int sum) {
		for(int i=0; i<n; i++) {
			int curr_sum = 0;
			for(int j=i; j<n; j++) {
				curr_sum += arr[j];
				if(curr_sum == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static boolean givenSum1(int arr[], int n, int sum) {
		HashSet<Integer> s = new HashSet<>();
		int cur_sum = 0;
		for(int i=0; i<n; i++) {
			cur_sum += arr[i];
			if(s.contains(cur_sum-sum)) {
				return true;
			}
			if(cur_sum == sum) {
				return true;
			}
			s.add(cur_sum);
		}
		return false;
		
	}

}
