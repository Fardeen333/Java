package p_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class F_PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // minHeap implementation
		pq.add(10);
		pq.add(20);
		pq.add(15);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder()); // maxHeap implementation
		pq1.add(10);
		pq1.add(20);
		pq1.add(15);
		
		System.out.println(pq1);
		System.out.println(pq1.peek());
		System.out.println(pq1.poll());
		System.out.println(pq1.peek());

	}

}
