package k_Stack;

import java.util.ArrayDeque;

public class P_InfixToPrefixConversion {

	public static void main(String[] args) {
		
		String exp1 = "x+y*z";
		System.out.println(infixToPrefix(exp1));
		String exp2 = "(x+y)*z";
		System.out.println(infixToPrefix(exp2));
		String exp3 = "x^y^z";
		System.out.println(infixToPrefix(exp3));
		String exp4 = "x+y/z-w*u";
		System.out.println(infixToPrefix(exp4));
		
//		int x = (int)Math.ceil(4/2.0);
//		System.out.println(x);
	}
	
	
	//Naive Approach 
	//First Parenthesize the infix expression and then evaluate the value for the inner most brackets
	
	//Efficient Approach O(n) time and O(n) space
	public static String infixToPrefix(String exp) {
		String res = "";
		ArrayDeque<Character> s = new ArrayDeque<>();
		for(int i=exp.length()-1; i>=0; i--) {
			char ch = exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				res += ch;
			}else if(ch == ')') {
				s.push(ch);
			}else if(ch == '(') {
				while(s.isEmpty()==false && s.peek()!=')') {
					res+=s.pop();
				}
				s.pop();
			}else {
				while(s.isEmpty()==false && precedence(ch)<precedence(s.peek())) {
					res += s.pop();
				}
				s.push(ch);
			}
		}
		while(s.isEmpty()==false) {
			if(s.peek() == '(')
                return "Invalid Expression";
			res += s.pop();
		}
		return reverse(res);
	}

	
	//utility function
	public static int precedence(char c) {
		switch(c) {
		case '+': case '-':
			return 1;
		case '*': case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	//utility function 
	public static String reverse(String s) {
		char arr[] = s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		String s1 =String.valueOf(arr);
		return s1;
	}
	

}
