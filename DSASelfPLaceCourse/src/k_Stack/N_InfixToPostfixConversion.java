package k_Stack;

import java.util.ArrayDeque;

public class N_InfixToPostfixConversion {

	public static void main(String[] args) {
		String exp1 = "a+b*c";
		String exp2 = "(a+b)*c";
		String exp3 = "a*b/c";
		String exp4 = "a+b/c-d*e";
		System.out.println(infixToPostfix(exp1));
		System.out.println(infixToPostfix(exp2));
		System.out.println(infixToPostfix(exp3));
		System.out.println(infixToPostfix(exp4));

	}
	
	//Naive Approach 
	//First Parenthesize the infix expression and then evaluate the value for the inner most brackets
	
	//Efficient Approach O(n) time and O(n) space
	public static String infixToPostfix(String exp) {
		String res = "";
		ArrayDeque<Character> s = new ArrayDeque<>();
		for(int i=0; i<exp.length(); i++) {
			char ch = exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				res += ch;
			}else if(ch == '(') {
				s.push(ch);
			}else if(ch == ')') {
				while(s.isEmpty()==false && s.peek()!='(') {
					res += s.pop();
				}
				s.pop();
			}else {
				while(s.isEmpty()==false && precedence(ch)<=precedence(s.peek())) {
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
		return res;
	}
	//Utility Function
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

}
