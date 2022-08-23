package m_Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class C_DequeInJava {

	public static void main(String[] args) {
		
		Deque<Integer> d = new LinkedList<>();
		
		d.offerFirst(10);
		d.offerLast(20);
		d.offerFirst(5);
		d.offerLast(15);
		System.out.println(d.peekFirst()+" "+d.peekLast());
		d.pollFirst();
		d.pollLast();
		System.out.println(d.peekFirst()+" "+d.peekLast());

		
		Deque<Integer> d1 = new LinkedList<>();
		d1.addFirst(10);
		d1.addLast(20);
		d1.addFirst(5);
		d1.addLast(15);
		System.out.println(d1.getFirst()+" "+d1.getLast());
		d1.removeFirst();
		d1.removeLast();
		System.out.println(d1.getFirst()+" "+d1.getLast());
		
		
		d.offerFirst(100);
		d.offerFirst(200);
		d.offerLast(300);
		d.offerLast(400);
		traverse(d);
		
		reverseTraverse(d);
		
		

	}
	//Traversing from first to last
	public static void traverse(Deque<Integer> d) {
		Iterator<Integer> it = d.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		for(int e: d) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	//Traversing from last to first
	public static void reverseTraverse(Deque<Integer> d) {
		Iterator<Integer> it = d.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}

}
