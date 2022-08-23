package vectorAndStacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Vector<Integer> v = new Vector<Integer>();
//		
//		v.add(34);
//		v.add(12);
		
//		Stack<Integer> stack = new Stack<>();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		
		System.out.println(popped);
		
//		popped = stack.pop();
//		popped = stack.pop();
//		popped = stack.pop();
		int peek = stack.peek();
		
		System.out.println(peek);
	}

}
