package i_strings;

import java.util.Stack;

public class G_ReverseWordsInString {

	public static void main(String[] args) {
	
		String s1 = "Welcome to Gfg";
		String s2 = "Today is not a good day";
		
		System.out.println(reverseWordByWord(s1));
		System.out.println(reverseWordByWord(s2));
		
		
		System.out.println(reverseWordByWord1(s1));
		System.out.println(reverseWordByWord1(s2));

	}
	
	//Naive Approach O(sizeofString + noOfWords) time and O(sizeofString) time
	public static String reverseWordByWord(String s) {
		Stack<String> stack = new Stack<>();
		int start = 0 ;
		String ans = "";
		for(int end=0; end<s.length(); end++) {
			if(s.charAt(end) == ' ') {
				stack.push(s.substring(start, end));
				start = end+1;
			}
		}
		stack.push(s.substring(start,s.length()));
		while(stack.size() != 0) {
			ans = ans + stack.pop() + " ";
		}
		return ans;
	}
	
	//Efficient Approach O(n) time and O(1) space
	public static String reverseWordByWord1(String s) {
		int n = s.length();
		char arr[] = s.toCharArray();
		int start = 0;
		for(int end=0; end<n; end++) {
			if(arr[end] == ' ') {
				reverse(arr, start, end-1);
				start = end+1;
			}
		}
		reverse(arr, start, n-1);
		reverse(arr, 0, n-1);
		
		String ans = new String(arr);
		return ans;
	}

	public static void reverse(char arr[], int low, int high) {
		while(low<high) {
			char temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}


}
