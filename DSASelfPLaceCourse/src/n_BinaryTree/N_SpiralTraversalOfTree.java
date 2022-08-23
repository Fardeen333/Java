package n_BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class N_SpiralTraversalOfTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right= new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.right.left.left = new Node(10);
		root.right.left.right = new Node(11);
		spiralTraversal(root);
		spiralTraversal1(root);
		

	}
	
	//Method 1
	//O(4n) time and O(2n space)
	public static void spiralTraversal(Node root) {
		
		if(root == null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<>();
		boolean reverse = false;
		Stack<Integer> s = new Stack<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int count = q.size();
			for(int i=0; i<count; i++) {
				Node temp = q.poll();
				if(reverse) {
					s.push(temp.key);
				}else {
					System.out.print(temp.key+" ");	
				}
				if(temp.left != null) {q.offer(temp.left);}
				if(temp.right != null) {q.offer(temp.right);}
			}
			if(reverse) {
				while(!s.isEmpty()) {
					System.out.print(s.pop()+" ");
				}
			}
			reverse = !reverse;
			System.out.println();
		}
	}
	
	//Method 2 O(2n) time and O(2n) space
	public static void spiralTraversal1(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.print(temp.key+" ");
				if(temp.left != null) {s2.push(temp.left);}
				if(temp.right != null) {s2.push(temp.right);}
			}
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.print(temp.key+" ");
				if(temp.right != null) {s1.push(temp.right);}
				if(temp.left != null) {s1.push(temp.left);}
				
			}
		}
 	}

}
