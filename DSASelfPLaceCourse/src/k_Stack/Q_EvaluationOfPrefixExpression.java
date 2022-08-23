package k_Stack;

import java.util.ArrayDeque;

public class Q_EvaluationOfPrefixExpression {

	public static void main(String[] args) {
		
		String exp1 = "+*523";
		String exp2 = "*+523";
		System.out.println(evaluatePreFix(exp1));
		System.out.println(evaluatePreFix(exp2));
		
	}
	
	//O(n) time and O(n) space
	public static int evaluatePreFix(String exp) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		for(int i=exp.length()-1; i>=0; i--) {
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) {
				s.push(ch-'0');
			}else {
				int val1 = s.pop();
				int val2 = s.pop();
				
				switch(ch) {
					case '+':
						s.push(val1+val2);
						break;
					case '-':
						s.push(val1-val2);
						break;
					case '*':
						s.push(val1*val2);
						break;
					case '/':
						s.push(val1/val2);
						break;
				}
			}
		}
		return s.pop();
	}

}
