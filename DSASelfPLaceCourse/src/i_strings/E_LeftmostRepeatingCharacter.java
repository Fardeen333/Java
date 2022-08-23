package i_strings;

import java.util.Arrays;

public class E_LeftmostRepeatingCharacter {

	public static void main(String[] args) {
		
		String s1 = "geeksforgeeks";
		String s2 = "abbcc";
		String s3 = "abcd";
		
		System.out.println(leftmost(s1)+" "+leftmost(s2)+" "+leftmost(s3));
		System.out.println(leftmost1(s1)+" "+leftmost1(s2)+" "+leftmost1(s3));
		System.out.println(leftmost2(s1)+" "+leftmost2(s2)+" "+leftmost2(s3));
		System.out.println(leftmost3(s1)+" "+leftmost3(s2)+" "+leftmost3(s3));
		
//		String arr[] = { "a", "b" , "c", "z", "q"};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println("abc".compareTo("bca"));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int leftmost(String s){
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	//Efficient Approach O(n) time and O(256) space but take 2 iteration
	public static int leftmost1(String s){
		int temp[] = new int[256];
		
		for(int i=0; i<s.length(); i++) {
			temp[s.charAt(i)]++;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(temp[s.charAt(i)] >1) {
				return i;
			}
		}
		return -1;
	}
	
	//Efficient Approach O(n + 256(for filling with -1)) time and O(256) space
	public static int leftmost2(String s){
		int temp[] = new int[256];
		Arrays.fill(temp, -1);
		
		int res = Integer.MAX_VALUE;
		
		for(int i=0; i<s.length(); i++) {
			int fi = temp[s.charAt(i)];
			if(fi == -1) {
				temp[s.charAt(i)] = i;
			}else {
				res = Math.min(res, fi);
			}
		}
		
		return (res == Integer.MAX_VALUE)? -1 : res;
	}
	
	//Efficient Approach O(n) time and O(256) space
	public static int leftmost3(String s) {
		boolean temp[] = new boolean[256];
		int res = -1;
		for(int i= s.length()-1; i>=0; i--) {
			if(temp[s.charAt(i)] == true) {
				res = i;
			}else {
				temp[s.charAt(i)] = true;
			}
		}
		return res;
	}

}
