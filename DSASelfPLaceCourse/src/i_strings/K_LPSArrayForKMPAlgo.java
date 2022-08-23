package i_strings;

import java.util.Arrays;

public class K_LPSArrayForKMPAlgo {

	public static void main(String[] args) {
		//Naive Approach
		String s = "ababacab";
		int lps[] = new int[s.length()];
		fillLPS(s, lps);
		System.out.println(Arrays.toString(lps));
		
		
		//Efficient Approach
		String s1 = "ababacab";
		int lps1[] = new int[s1.length()];
		longestProperPrefixSuffix(s1, lps1);
		System.out.println(Arrays.toString(lps1));
		
		
		String s2 = "aaabaaaac";
		int lps2[] = new int[s2.length()];
		longestProperPrefixSuffix(s2, lps2);
		System.out.println(Arrays.toString(lps2));

	}
	
	//Naive Approach O(n^3) time and O(1) space
	public static int longProPreSuf(String s, int n) {
		for(int len = n-1; len>0; len--) {
			boolean flag  =true;
			for(int i=0; i<len; i++) {
				if(s.charAt(i) != s.charAt(n-len+i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return len;
			}
		}
		return 0;
	}

	public static void fillLPS(String s, int lps[]) {
		for(int i=0; i<s.length(); i++) {
			lps[i] = longProPreSuf(s, i+1);
		}
		
	}
	//Efficient Approach O(2n) time and O(1) space  
	public static void longestProperPrefixSuffix(String s, int lps[]) {
		int n = s.length();
		int i=1;
		lps[0] = 0;
		int len = 0;
		while(i<n) {
			if(s.charAt(len) == s.charAt(i)) {
				len++;
				lps[i] = len;
				i++;
			}else {
				if(len == 0) {
					lps[i] = 0;
					i++;
				}else {
					len = lps[len-1];//another n for this
				}
			}
		}
	}
}
