// Fardeen
// B. Tech. CSE 6A
// 2K18CSUN01061

import java.util.Scanner;

public class Pt1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.nextLine();
		
		char arr[] = inputString.toCharArray();
		
		int n = arr.length;
		
		if(arr[0] == 'a' && arr[n-2] == 'a' && arr[n-1] == 'b' ) {
			System.out.println("This String is accepted");
		}else {
			System.out.println("This string is not accepted");
		}

	}

}
