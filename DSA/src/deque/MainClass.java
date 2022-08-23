package deque;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
//		
//		ad.addFirst(12);
//		ad.addFirst(23);
//		ad.addLast(34);
//		ad.addLast(72);
//		ad.addFirst(36);
//		ad.addFirst(48);
//		
//		System.out.println(ad);
//		
//		System.out.println(ad.pollFirst());
//		System.out.println(ad.peekFirst());
//		System.out.println(ad.pollLast());
//		System.out.println(ad.peekLast());
		
//		ad.push(12

//		
//		ad.push(12);
//		
//		System.out.println(ad);
//		ad.push(23);
//		ad.push(34);
//		
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
		
				MyDeque<Integer> md = new MyDeque<Integer>();
				md.addToHead(12);
				md.addToHead(23);
				md.addToHead(34);
				
				System.out.println(md.removeLast());
				System.out.println(md.removeLast());

	}

}
