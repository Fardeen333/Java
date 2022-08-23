package m_Deque;

import java.util.ArrayDeque;

public class D_ArrayDequeInJava {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		
		//ArrayDeque as Stack
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ad1.push(10);
		ad1.push(20);
		System.out.print(ad1.peek()+" ");
		System.out.print(ad1.pop()+" ");
		System.out.print(ad1.peek()+" ");
		ad1.push(40);
		System.out.print(ad1.peek()+" ");
		System.out.println();
		
		//ArrayDeque as queue
		ArrayDeque<Integer> ad2 = new ArrayDeque<>();
		ad2.offer(10);
		ad2.offer(20);
		System.out.print(ad.peek()+" ");
		System.out.print(ad.poll()+" ");
		System.out.print(ad.peek()+" ");
		ad2.offer(40);
		System.out.print(ad.peek()+" ");
		
		System.out.println();
		
		//ArrayDequeue as Deque
		ArrayDeque<Integer> ad3 = new ArrayDeque<>();
		ad3.offerFirst(10);
		ad3.offerLast(20);
		ad3.offerFirst(30);
		ad3.offerLast(40);
		System.out.print(ad3.peekFirst()+" ");
		System.out.print(ad3.peekLast()+" ");
		System.out.print(ad3.pollFirst()+" ");
		System.out.print(ad3.peekFirst()+" ");
		System.out.print(ad3.pollLast()+" ");
		System.out.print(ad3.peekLast()+" ");
		
		System.out.println();
	
	}

}
