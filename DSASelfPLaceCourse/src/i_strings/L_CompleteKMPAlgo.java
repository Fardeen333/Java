package i_strings;

public class L_CompleteKMPAlgo {

	public static void main(String[] args) {
		String txt1 = "ABABABCD";
		String pat1 = "ABAB";
		kmpforPatternSearching(txt1, pat1);
		
		String txt2 = "ABCABCD";
		String pat2 = "ABCD";
		kmpforPatternSearching(txt2, pat2);
		
		String txt3 = "AAAAA";
		String pat3 = "AAA";
		kmpforPatternSearching(txt3, pat3);
		
		String txt4 = "ababcababaad";
		String pat4 = "ababa";
		kmpforPatternSearching(txt4, pat4);

	}
	
	//KMP Algorithm O(2n) time and O(m) space
	public static void kmpforPatternSearching(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		int lps[] = new int[m];
		longestProperPrefixSuffix(pat, lps);
		int i=0; int j=0;
		while(i<n) {
			if(txt.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			}
			if(j==m) {
				System.out.print((i-j)+" ");
				j = lps[j-1];
			}else if(i<n && txt.charAt(i) != pat.charAt(j)) {
				if(j==0) {
					i++;
				}else {
					j = lps[j-1];
				}
			}
			
		}
		System.out.println();
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
