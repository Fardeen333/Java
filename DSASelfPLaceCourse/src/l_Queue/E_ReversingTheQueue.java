package l_Queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class E_ReversingTheQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> q1 = new ArrayDeque<>();
		q1.offer(10); q1.offer(20); q1.offer(30); q1.offer(40);
		System.out.println(q1);
		reverse(q1);
		System.out.println(q1);
		
		ArrayDeque<Integer> q2 = new ArrayDeque<>();
		q2.offer(100); q2.offer(200); q2.offer(300); q2.offer(400);
		System.out.println(q2);
		reverse(q2);
		System.out.println(q2);

	}
	
	//Iterative Approach O(n) time and O(n) space
	public static void reverse(ArrayDeque<Integer> q) {
		Stack<Integer> s = new Stack<>();
		while(!q.isEmpty()) {
			s.push(q.poll());
		}
		while(!s.isEmpty()) {
			q.offer(s.pop());
		}
	}
	
	//Recursive Approach O(n) time and O(n) space
	public static void reverse1(ArrayDeque<Integer> q) {
		if(q.isEmpty()) {
			return;
		}
		int x = q.poll();
		reverse(q);
		q.offer(x);
	}

}
