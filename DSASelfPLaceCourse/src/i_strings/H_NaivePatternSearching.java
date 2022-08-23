package i_strings;

public class H_NaivePatternSearching {

	public static void main(String[] args) {
		String txt1 = "ABABABCD";
		String pat1 = "ABAB";
		patternSearching(txt1, pat1);
		
		String txt2 = "ABCABCD";
		String pat2 = "ABCD";
		patternSearching(txt2, pat2);
		
		String txt3 = "AAAAA";
		String pat3 = "AAA";
		patternSearching(txt3, pat3);

	}
	//Naive Approach O((n-m+1)*m) time and O(1) space  
	public static void patternSearching(String tex, String pat) {  //txt - text and pat - pattern
		int n = tex.length();
		int m = pat.length();
		for(int i=0; i<n-(m-1); i++) {
			boolean flag = true;                            //int j;
			for(int j=0; j<m; j++) {                        //for(j=0; j<m; j++) { 
				if(pat.charAt(j) != tex.charAt(j+i)) {      // if(pat.charAt(j) != tex.charAt(j+i)) {
					flag = false;                           // 
					break;                                  //break;  
				}                                           //}
			}                                               //}
			if(flag) {                                      //if(j==m){
				System.out.print(i+" ");                    //System.out.print(i+" "); 
			}                                               //}
		}
		System.out.println();
			
	}

}
