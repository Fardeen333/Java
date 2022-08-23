package i_strings;

public class N_AnagramSearch {

	public static void main(String[] args) {
		String txt1 = "geeksforgeeks";
		String pat1 = "frog";
		System.out.println(anagramSearch(txt1, pat1));
		
		String txt2 = "geeksforgeeks";
		String pat2 = "rseek";
		System.out.println(anagramSearch(txt2, pat2));
		
		//efficient method testing
		String txt3 = "geeksforgeeks";
		String pat3 = "frog";
		System.out.println(anagramSearch(txt3, pat3));
		
		String txt4 = "geeksforgeeks";
		String pat4 = "rseek";
		System.out.println(anagramSearch(txt4, pat4));
		String txt5 = "geeksforgeeks";
		String pat5 = "esek";
		System.out.println(anagramSearch(txt5, pat5));
		
		
	}
	
	//Naive Approach O((n-m+1)*m) time and O(256) space;
	public static boolean anagramSearch(String txt,String pat) {
		int n = txt.length();
		int m = pat.length();

		for(int i=0; i< n-(m-1); i++) {
			if(isAnagram(txt,pat,i)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isAnagram(String txt,String pat, int i) {
		int count[] = new int[256];
		
		for(int j=0; j<pat.length(); j++) {
			count[pat.charAt(j)]++;
			count[txt.charAt(i+j)]--;
		}
		
		for(int j=0;j<256; j++) {
			if(count[j] != 0) {
				return false;
			}
		}
		return true;
	}
	
	//Efficient Approach O(m+((n-m+1)*256)) time and O(256 space)
	// if 256 is constant then O(n) time and O(1) space
	public static boolean anagramSearch1(String txt, String pat) {
		int charArrayFortxt[] = new int[256];
		int charArrayForpat[] = new int[256];
		
		for(int i=0; i<pat.length(); i++) {
			charArrayForpat[pat.charAt(i)]++;
			charArrayFortxt[txt.charAt(i)]++;
		}
		
		for(int i=pat.length(); i<txt.length(); i++) {
			if(isSame(charArrayFortxt, charArrayForpat)) {
				return true;
			}
			charArrayFortxt[txt.charAt(i)]++;
			charArrayFortxt[txt.charAt(i-pat.length())]--;
			
		}
		return false;
		
	}
	public static boolean isSame(int arr1[], int arr2[]) {
		for(int i=0; i<256; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
