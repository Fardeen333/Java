package l_Queue;

import java.util.ArrayDeque;

public class D_ImplementStackUsingQueue {

	public static void main(String[] args) {
		
		StackUsingQueue s = new StackUsingQueue();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.print();

	}

}

class StackUsingQueue{
	
	ArrayDeque<Integer> q1 = new ArrayDeque<>();
	ArrayDeque<Integer> q2 = new ArrayDeque<>();
	
	int size() {
		return q1.size();
	}
	
	int peek() {
		return q1.peek();
	}
	
	int pop() {
		return q1.poll();
	}
	
	void push(int x) {
		if(q1.size() == 0) {
			q1.offer(x);
			return;
		}
		while(!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		q1.offer(x);
		while(!q2.isEmpty()) {
			q1.offer(q2.poll());
		}
		
	}
	
	void print() {
		System.out.println(q1);
	}
	
	
}
