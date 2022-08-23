package i_strings;

public class I_ImprovedNaivePatternSearchForDistinctPattern {

	public static void main(String[] args) {
		
		String txt1 = "ABCEABEFABCD";
		String pat1 = "ABCD";
		patternSearching(txt1, pat1);
		
		String txt2 = "ABCABCD";
		
		String pat2 = "ABCD";
		patternSearching(txt2, pat2);
		
		String txt3 = "ABCABCABC";
		String pat3 = "ABC";
		patternSearching(txt3, pat3);
		


	}
	
	//O(n) time because for everytime m comparasion i is jumped m times 
	//O(1) space
	public static void patternSearching(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		for(int i=0; i<n-(m-1); ) {
			int j=0;
			for(j=0; j<m; j++) {
				if(pat.charAt(j) != txt.charAt(j+i)) {
					break;
				}
			}
			if(j == m) {
				System.out.print(i+" ");
			}
			if(j == 0) {
				i++;
			}else {
				i = i + j;
			}
		}
		System.out.println();
	}

}
