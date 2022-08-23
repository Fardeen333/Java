package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> mq =new MyQueue<Integer>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(451);
		
		System.out.println(mq.dequeue());
		
//		q.add(12);
//		q.add(23);
//		q.add(34);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		
//		System.out.println(q.peek());
		

	}

}
