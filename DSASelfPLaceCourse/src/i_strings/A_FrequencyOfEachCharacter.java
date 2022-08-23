package i_strings;

public class A_FrequencyOfEachCharacter {

	public static void main(String[] args) {


		frequency("geeksforgeeks", 13);

	}
	
	public static void frequency(String str, int n) {
		int temp[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			temp[str.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<26; i++) {
			if(temp[i] > 0) {
				System.out.println((char)(i+'a') + " "+ temp[i]);
			}
		}
	}

}