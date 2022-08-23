package i_strings;

import java.util.Arrays;

public class D_CheckForAnagram {

	public static void main(String[] args) {
		String s1 = "silent"; String s2 ="listen";
		String s3 = "aaacb"; String s4 = "cabaa";
		String s5= "aab"; String s6 = "bba";
		
		System.out.println(isAnagram1(s1, s2)+" "+isAnagram1(s3, s4)+" "+isAnagram1(s5, s6));
		
		System.out.println(isAnagram(s1, s2)+" "+isAnagram(s3, s4)+" "+isAnagram(s5, s6));

	}
	
	//Naive Approach O(nlogn) time and O(1) space
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char a[] = s1.toCharArray();
		Arrays.sort(a);
		s1 = new String(a);
		
		char b[] = s2.toCharArray();
		Arrays.sort(b);
		s2 = new String(b);
		
		return s1.equals(s2);
 	}
	
	//Efficient Approach O(n) time and O(256) space
	public static boolean isAnagram1(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int temp[] = new int[256];
		for(int i=0; i<s1.length(); i++) {
			temp[s1.charAt(i)]++;
			temp[s2.charAt(i)]--;
		}
		
		for(int i=0; i<256; i++) {
			if(temp[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
