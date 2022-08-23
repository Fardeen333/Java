package n_BinaryTree;

import java.util.ArrayList;

public class S_SerializationAndDeSerialization {

	static final int EMPTY = -1;
	static int index = 0;
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Node root = new Node(10);
		root.left = new Node(20);
		
		//Serialization
		serialize(root, al);
		System.out.println(al);
		
		//deSerialization
		Node finalRoot = deSerialization(al);
		System.out.println(finalRoot.key);
		System.out.println(finalRoot.left.key);
		

	}
	
	//O(n) time and O(n) space
	public static void serialize(Node root, ArrayList<Integer> arr) {
		if(root == null) {
			arr.add(EMPTY);
			return;
		}
		arr.add(root.key);
		serialize(root.left, arr);
		serialize(root.right, arr);
	}
	
	//O(n) time and O(h) space
	public static Node deSerialization(ArrayList<Integer> arr) {
		if(index == arr.size()) {
			return null;
		}
		int val = arr.get(index);
		index++;
		if(val == EMPTY) {
			return null;
		}
		Node root = new Node(val);
		root.left = deSerialization(arr);
		root.right = deSerialization(arr);
		return root;
	}

}
