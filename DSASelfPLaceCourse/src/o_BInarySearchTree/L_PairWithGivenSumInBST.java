package o_BInarySearchTree;

import java.util.TreeSet;

public class L_PairWithGivenSumInBST {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.right.left = new Node(16);
		root.right.right = new Node(40);
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		System.out.println(havePair(root, 21, s));

	}
	
	//Method 1 O(n) time and O(n+h) space n for array and h for recursion stack so overall space will be o(n)
	//Get the inOrder traversal of the BST in a array -- o(n) 
	//use two pointers approach to get the pair if exists -- O(n)

	
	//method 2 O(n) time and O(n+h) space n for array and h for recursion stack so overall space will be o(n) 
	public static boolean havePair(Node root, int sum, TreeSet<Integer> s) {
		if(root == null) {
			return false;
		}
		if(havePair(root.left, sum, s) == true) {
			return true;
		}
		if(s.contains(sum-root.key)) {
			return true;
		}else {
			s.add(root.key);
		}
		return havePair(root.right, sum, s);
	}
}
