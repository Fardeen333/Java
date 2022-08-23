package h_hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class A_ImplementingChaining {

	public static void main(String[] args) {
		
		MyHash obj = new MyHash(7);
		obj.insert(70);
		obj.insert(71);
		obj.insert(56);
		obj.insert(9);
		obj.insert(72);
		
		System.out.println(obj.table);
		
		obj.delete(72);
		
		System.out.println(obj.table);
		System.out.println(obj.search(56));
		System.out.println(obj.search(50));
	}

}

class MyHash{
	int bucket;
	ArrayList<LinkedList<Integer>> table;
	
	MyHash(int b){
		bucket = b;
		table = new ArrayList<LinkedList<Integer>>();
		
		for(int i=0; i<b; i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	
	void insert(int key) {
		int i = key % bucket;
		table.get(i).add(key);
	}
	
	void delete(int key) {
		int i = key % bucket;
		table.get(i).remove((Integer)key);
	}
	
	boolean search(int key){
		int i = key % bucket;
		return table.get(i).contains(key);
	}
}
