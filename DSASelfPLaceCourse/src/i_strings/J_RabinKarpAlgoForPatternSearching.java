package i_strings;

public class J_RabinKarpAlgoForPatternSearching {

	public static void main(String[] args) {
		String txt1 = "abdabcbabc";
		String pat1 = "abc";
		patternSearching(txt1, pat1);
		
		String txt2 = "aaaaa";
		String pat2 = "aaa";
		patternSearching(txt2, pat2);
		
		String txt3 = "abcd";
		String pat3 = "xyz";
		patternSearching(txt3, pat3);

	}
	
	public static void patternSearching(String txt, String pat) {
		int n = txt.length();
		int m = pat.length();
		int d = 5; //distict characters in txt and pat
		int q = 37; // a random larger prime number is taken
		int h =1;
		for(int i=1; i<=m-1; i++) {
			h = (h * d) % q;
		}
		int p=0;
		int t=0;
		for(int i=0; i<m; i++) {
			p = ((p*d) + pat.charAt(i))%q;
			t = ((t*d) + txt.charAt(i))%q;
		}
		
		for(int i=0; i<n-(m-1); i++) {
			if(t == p) {
				boolean flag = false;
				for(int j=0; j<m; j++) {
					if(pat.charAt(j) != txt.charAt(i+j)) {
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.print(i+" ");
				}
			}
			if(i<(n-m)) {
				t = ((d*(t - txt.charAt(i)*h)) + txt.charAt(i+m))%q;
				if(t < 0) {
					t = t+q;
				}
			}
		}
		System.out.println();
	}

}
