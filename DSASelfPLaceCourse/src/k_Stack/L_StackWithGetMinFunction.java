package k_Stack;

import java.util.ArrayDeque;

public class L_StackWithGetMinFunction {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(5);
		s.push(10);
		s.push(20);
		s.push(2);
		s.push(6);
		s.push(4);
		System.out.println(s.getMin());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(2);
		System.out.println(s.pop());
		System.out.println(s.getMin());
		System.out.println(s.pop());
		System.out.println(s.getMin());
		System.out.println(s.pop());
		System.out.println(s.getMin());
	}

}

class Stack{
	ArrayDeque<Integer> mainStack;	
	ArrayDeque<Integer> auxStack;	
	
	Stack(){
		mainStack = new ArrayDeque<>();
		auxStack = new ArrayDeque<>();
	}
	
	void push(int x) {
		if(mainStack.isEmpty()) {
			mainStack.push(x);
			auxStack.push(x);
			return;
		}
		mainStack.push(x);
		if(auxStack.peek()>=mainStack.peek()) {
			auxStack.push(x);
		}
	}
	
	int pop() {
		if(mainStack.peek() == auxStack.peek()) {
			auxStack.pop();
		}
		int x = mainStack.pop();
		return x;
	}
	
	int getMin() {
		return auxStack.peek();
	}
}
