import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String test = "Anuj Kumar Singh";
//		
//		System.out.println(length(test));
//		
//		System.out.println(sub(test, 3));
//		
//		System.out.println(sub(test, 3, 10));
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ans = rev(s);
		if(isString(s)) {
			if(s.equals(ans)) {
				System.out.println("you inputted a strong string.");
			}else {
				System.out.println("you inputted a weak string.");
			}
		}else {
			System.out.println("you inputted a weak string.");
		}
		

	}
	
	public static boolean isString(String s) {
		int n = s.length();
		for(int i=0; i<n; i++) {
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static String rev(String s) {
		String ans ="";
		for(int i=s.length()-1; i>=0; i--) {
			ans += s.charAt(i);
		}
		return ans;
	}
	
	private static int[] sum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			arr[i] = sum;
		}
		return arr;
		
	}
	
	public static String sub(String s, int i) {
		String ans = "";
		char arr[] = s.toCharArray();
		int n = length(s);
		for(int j=i; j<n; j++) {
			char c = arr[j];
			String t = Character.toString(c);
			ans += t;
		}
		return ans;
	}
	
	public static String sub(String s, int i, int j) {
		String ans = "";
		char arr[] = s.toCharArray();
		int n = length(s);
		for(int k=i; k<j; k++) {
			ans += arr[k];
		}
		return ans;
	}
	
	public static int length(String s) {
		char arr[]= s.toCharArray();
		int count = 0;
		for(char e: arr) {
			count++;
		}
		return count;
	}

}
