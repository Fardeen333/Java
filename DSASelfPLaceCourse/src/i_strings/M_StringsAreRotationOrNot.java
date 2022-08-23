package i_strings;

public class M_StringsAreRotationOrNot {

	public static void main(String[] args) {
		String s1 = "ABCD"; String s2= "CDAB";
		String s3 = "ABAAA"; String s4 = "BAAAA";
		String s5 = "ABAB"; String s6 = "ABBA";
		
		System.out.println(isRotation(s1, s2));
		System.out.println(isRotation(s3, s4));
		System.out.println(isRotation(s5, s6));

	}
	
	public static boolean isRotation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
//		System.out.println((s1+s1).contains(s2)); this can be also used
		return (s1+s1).indexOf(s2) >= 0;
	}

}
