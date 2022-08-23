package k_Stack;

import java.util.ArrayDeque;


public class O_EvaluationOfPostfixExpression {

	public static void main(String[] args) {
		String exp = "231*+9-";
		System.out.println(evaluatePostFix(exp));

	}
	//O(n) time and O(n) space
	public static int evaluatePostFix(String exp) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		for(int i=0; i<exp.length(); i++) {
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) {
				s.push(ch-'0');
			}else {
				int val1 = s.pop();
				int val2 = s.pop();
				
				switch(ch) {
					case '+':
						s.push(val2+val1);
						break;
					case '-':
						s.push(val2-val1);
						break;
					case '*':
						s.push(val2*val1);
						break;
					case '/':
						s.push(val2/val1);
						break;
				}
			}
		}
		return s.pop();
	}

}
