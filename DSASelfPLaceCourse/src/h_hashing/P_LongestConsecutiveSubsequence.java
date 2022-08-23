package h_hashing;

import java.util.*;

public class P_LongestConsecutiveSubsequence {

	//we need to find the longest subsequence in the form of x, x+1, x+2, . .. . with these elements appearing in any order
	
	public static void main(String[] args) {
		
		int arr[] = {1,9,3,4,2,20};
		int b[] = {8,20,7,30};
		int c[] = {20,30,40};
		
		System.out.println(longestSubsequence(arr, arr.length)+" "+longestSubsequence(b, b.length)+" "+ longestSubsequence(c, c.length));
		System.out.println(longestSubsequence1(arr, arr.length)+" "+longestSubsequence1(b, b.length)+" "+ longestSubsequence1(c, c.length));

	}
	
	//Naive Approach O(nlogn) time and O(1) space
	public static int longestSubsequence(int arr[], int n) {
		Arrays.sort(arr);
		int count =1;
		int res = 1;
		for(int i=1; i<n; i++) {
			if(arr[i] == arr[i-1]+1) {
				count++;
				res = Math.max(res, count);
			}else if(arr[i] != arr[i-1]) {  //this handles cases like {1,2,2,3}
				count =1;
			}
		}
		return res;
	}
	
	//Efficient Approach 
	public static int longestSubsequence1(int arr[], int n) {
		HashSet<Integer> s = new HashSet<>();
		for(int e: arr) {
			s.add(e);
		}
		int res = 1;
		for(int e : s) {
			if(s.contains(e-1) == false) {
				int count = 1;
				while(s.contains(e+count)) {
					count++;
				}
				res = Math.max(res, count);
			}
		}
		return res;
		
	}
}
