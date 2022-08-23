package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
//		pq.add("Kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		pq.add(45);
		pq.add(12);
		pq.add(1);
		pq.add(100);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		

	}

}
