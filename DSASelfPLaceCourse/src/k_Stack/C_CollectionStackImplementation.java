package k_Stack;

import java.util.*;

public class C_CollectionStackImplementation {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		System.out.println(stack);
		
		stack.push(100);
		System.out.println(stack);
		
	}

}
