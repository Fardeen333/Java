package k_Stack;

import java.util.*;

public class D_ParenthesisCheck {

	public static void main(String[] args) {
		
		String s1 = "([])";
		String s2 = "(()))";
		String s3 = "([)]";
		String s4 = "{}([()])";
		String s5 = "((())";
		
		System.out.println(isBalanced(s1)+" "+isBalanced(s2)+" "+isBalanced(s3)+" "+isBalanced(s4)+" "+isBalanced(s5));
		
	}
	
	//O(n) time and O(n) space
	public static boolean isBalanced(String str) {
		ArrayDeque<Character>  s = new ArrayDeque<>();
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			if(x=='{'||x=='('||x=='[') {
				s.push(x);
			}else {
				if(s.isEmpty() == true) {
					return false;
				}else if(isMatching(s.peek(),x) == false) {
					return false;
				}else {
					s.pop();
				}
			}
			
		}
		return (s.isEmpty()==true);
	}
	
	public static boolean isMatching(char a, char b) {
		return ((a=='{'&&b=='}') || (a=='[' && b==']') || (a=='('&&b==')'))  ;
	}

}
