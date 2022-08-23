package i_strings;

import java.util.Arrays;

public class F_LeftmostNonRepeatingElement {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "abcabc";
		String s3 = "apple";
		
		System.out.println(leftmost(s1)+" "+leftmost(s2)+" "+leftmost(s3));
		System.out.println(leftmost1
				(s1)+" "+leftmost1(s2)+" "+leftmost1(s3));
		System.out.println(leftmost2(s1)+" "+leftmost2(s2)+" "+leftmost2(s3));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int leftmost(String s) {
		for(int i=0; i<s.length(); i++) {
			boolean flag = false;
			for(int j=0; j<s.length(); j++) {
				if(i != j  && s.charAt(i) == s.charAt(j)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				return i;
			}
		}
		return -1;
	}
	
	//efficient Approach O(n) time and O(256) space but 2 traversal of the string
	public static int leftmost1(String s) {
		int temp[] = new int[256];
		
		for(int i=0; i<s.length(); i++) {
			temp[s.charAt(i)]++;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(temp[s.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}
	
	//efficient Approach O(n) time and O(256) space single iteration though we are iterating over the temp array but it is of constant size
	public static int leftmost2(String s) {
		int temp[] = new int[256];
		Arrays.fill(temp, -1);
		for(int i=0; i<s.length(); i++) {
			if(temp[s.charAt(i)] == -1) {
				temp[s.charAt(i)] = i;
			}else {
				temp[s.charAt(i)] = -2;
			}
		}
		int res = Integer.MAX_VALUE;
		for(int i=0; i<256; i++) {
			if(temp[i] >= 0) {
				res = Math.min(res, temp[i]) ;
			}
		}
		
		return (res == Integer.MAX_VALUE) ? -1 : res;
		
	}

}
