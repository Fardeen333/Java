package i_strings;

import java.util.Arrays;

public class P_LongestSubStringWithDistinctElements {

	public static void main(String[] args) {
		
		String s1 = "abcdabc";
		String s2 = "aaa";
		String s3 = "";
		String s4 = "abaacdbab";
		String s5 = "abac";
		
		System.out.println(longestSubString(s1)+" "+longestSubString(s2)+" "+longestSubString(s3)+" "+longestSubString(s4)+" "+longestSubString(s5));
		System.out.println(longestSubString1(s1)+" "+longestSubString1(s2)+" "+longestSubString1(s3)+" "+longestSubString1(s4)+" "+longestSubString1(s5));
		System.out.println(longestSubString2(s1)+" "+longestSubString2(s2)+" "+longestSubString2(s3)+" "+longestSubString2(s4)+" "+longestSubString2(s5));
		
		
	}
	
	//Naive Approach O(n^3) time and O(256) space
	public static int longestSubString(String s) {
		int n =s .length();
		int res = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(areDistinct(s, i, j)) {
					res = Math.max(res, j-i+1);
				}
			}
		}
		return res;
	} 
	
	public static boolean areDistinct(String s, int i, int j) {
		boolean count[] = new boolean[256];
		for(int k=i; k<=j; k++) {
			if(count[s.charAt(k)] == true) {
				return false;
			}
			count[s.charAt(k)] = true;
		}
		return true;
	}
	
	//Better Approach o(n^2) time and o(256) space
	public static int longestSubString1(String s) {
		int n = s.length();
		int res = 0;
		for(int i=0; i<n; i++) {
			boolean isVisited[] = new boolean[256];
			for(int j=i; j<n; j++) {
				if(isVisited[s.charAt(j)] == true) {
					break;
				}else {
					res = Math.max(res, j-i+1);
					isVisited[s.charAt(j)] = true;
				}
			}
		}
		return res;
	}
	
	//Efficient Approach O(n) time and O(256) space
	public static int longestSubString2(String s) {
		int n = s.length();
		int res =0;
		int prev[] = new int[256];
		Arrays.fill(prev, -1);
		int i =0;
		for(int j=0; j<n; j++) {
			i = Math.max(i, prev[s.charAt(j)]+1);
			int maxEnd = j-i+1;
			res = Math.max(res, maxEnd);
			prev[s.charAt(j)] = j;
		}
		return res;
	}

}
