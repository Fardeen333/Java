package l_Queue;

import java.util.ArrayDeque;

public class C_CollectionQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
 		
	}

}
