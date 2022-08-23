package codeForcesContest734;

import java.util.Scanner;

public class Ba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			System.out.println(red(s));
			
		}

	}
	
	public static int red(String s) {
		char string[] = s.toCharArray();
		char arr[] = new char[26];
		
		for(int i=0; i<s.length(); i++) {
			arr[string[i]-'a']++;
		}
		int k = 0;
		int n = 0;
		for(int i=0; i<26; i++) {
			if(arr[i]>=3 || arr[i]==2) {
				k++;
			}else if(arr[i] == 1){
				n++;
			}
		}
		
		k += (n/2);
		return k;
	}

}
