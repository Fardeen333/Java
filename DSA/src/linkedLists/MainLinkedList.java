package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ll = new LinkedList<Integer>();
//		List<Integer> al = new ArrayList<Integer>();
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		
//		ll.set(2, 13);
		
//		System.out.println(ll);
			
//		getTimeDiff(al);
//		getTimeDiff(ll);
		
		MyLinkedList<Integer> myLL = new MyLinkedList<Integer>();
		
//		myLL.add(12);
//		myLL.add(56);
		
		for(int i = 0 ; i<10 ; i++) {
			myLL.add(i);
		}
		
		myLL.print();

	}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
//		for(int i = 0; i < 100000; i++) {
//			list.add(i);
//		}
		
		for(int i = 0; i < 100000; i++) {
			list.add(0 , i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " " +(end - start));
	}

}
