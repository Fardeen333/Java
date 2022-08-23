package i_strings;

public class C_CheckIfTheGivenStringIsSubsequence {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "AD";
		
		String s3 = "ABCDE";
		String s4 = "AED";
		System.out.println(isSubSequence(s1, s2)+" "+isSubSequence(s3, s4));
		System.out.println(isSubSequence1(s1, s2, s1.length(), s2.length())+" "+isSubSequence1(s3, s4, s3.length(), s4.length()));
		System.out.println(isSubSequence2(s1, s2, s1.length(), s2.length())+" "+isSubSequence2(s3, s4, s3.length(), s4.length()));
		
//		String cat = "cat";
//		String act = "act";
//		System.out.println(cat.equals(act));

	}
	
	//Naive Approach O(2^n * n) time and O(1) space
	public static boolean isSubSequence(String s1, String s2) {
		int n = s1.length();
		int pow = (int)Math.pow(2, n);
//		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<pow; i++) {
			String s = "";
			for(int j=0; j<n; j++) {
				if((i&(1<<j)) != 0) {
					s = s + s1.charAt(j);
				}
			}
//			al.add(s);
			if(s2.equals(s)) {
				return true;
			}
		}
//		System.out.println(al);
//		return al.contains(s2);
		return false;
		
	}
	
	//Efficient Approach(Iterartive) O(n+m) Space and O(1) space
	public static boolean isSubSequence1(String s1, String s2, int m, int n) {
		int j = 0;
		for(int i=0; i<m && j<n; i++) {
			if(s2.charAt(j) == s1.charAt(i)) {
				j++;
			}
		}
		return j==n;
	}
	
	//Efficient Approach(Recursive) O(n+m) Space and O(1) space
		public static boolean isSubSequence2(String s1, String s2, int m, int n) {
			if(n==0) {
				return true;
			}
			if(m==0) {
				return false;
			}
			if(s1.charAt(m-1) == s2.charAt(n-1)) {
				return isSubSequence2(s1, s2, m-1, n-1);
			}else {
				return isSubSequence2(s1, s2, m-1,n);
			}
		}

}
