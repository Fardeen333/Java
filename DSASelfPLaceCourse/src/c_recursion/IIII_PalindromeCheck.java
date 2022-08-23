package c_recursion;

public class IIII_PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("FardraF",0,6));
	}
	
	public static boolean palindrome(String s, int start, int end) {
		if(start>=end) {
			return true;
		}
		return (s.charAt(start)==s.charAt(end)) && palindrome(s, start+1, end-1);
	}

}
