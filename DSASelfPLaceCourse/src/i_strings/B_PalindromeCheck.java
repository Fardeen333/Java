package i_strings;

public class B_PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abccba";
		String s2 = "aba";
		String s3 = "geeks";
		
		System.out.println(isPalindrome(s1)+" "+isPalindrome(s2)+" "+isPalindrome(s3));
		System.out.println(isPalindrome1(s1)+" "+isPalindrome1(s2)+" "+isPalindrome1(s3));
				

	}
	
	//Naive Approach O(n) time and O(n) space
	public static boolean isPalindrome(String s) {
		StringBuilder rev = new StringBuilder(s);
		rev.reverse();
		return s.equals(rev.toString());
	}
	
	//efficient Approach O(n) time and O(1) space
	public static boolean isPalindrome1(String s) {
		int begin = 0;
		int end = s.length()-1;
		while(begin<end) {
			if(s.charAt(begin) != s.charAt(end) ) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}

}
