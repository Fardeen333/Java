package i_strings;

public class O_LexographicalRank {

	public static void main(String[] args) {
		
		String str = "STRING";
		System.out.println(rank(str));

	}
	//Efficient Approach
	//O(n+256+(n*256)) time and O(256) space
	//O(n) time and O(1) space
	public static int rank(String s) {
		int n= s.length();	
		int count[] = new int [256];
		
		int fact = factorial(n);
		int res =1;
		for(int i=0; i<n; i++) {
			count[s.charAt(i)]++;
		}
		for(int i=1; i<256; i++) {
			count[i] = count[i] + count[i-1];
		}
		for(int i=0; i<n-1; i++) {
			fact = fact /(n-i);
			res = res + (fact * count[s.charAt(i)-1]);
			for(int j = s.charAt(i); j<256; j++) {
				count[j]--;
			}
		}
		return res;
	}
	
	public static int factorial(int n) {
		int fact =1;
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
