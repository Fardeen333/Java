package n_BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class H_PrintLeftViewOfTheTree {
	
	static int maxLevel = 0;

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		leftView(root, 1);
		System.out.println();
		leftView1(root);
		
		
	}
	
	//Method 1 Recursive Approach
	//O(n) time and O(h) space
	public static void leftView(Node root, int level) {
		if(root == null) {
			return;
		}
		if(maxLevel < level) {
			System.out.print(root.key+" ");
			maxLevel = level;
		}
		
		leftView(root.left, level+1);
		leftView(root.right, level+1);
		
	}
	
	//Method 2 Iterative Approach
	//O(n) time and O(w) space
	public static void leftView1(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<>();
		q.offer(root);
		while(!q.isEmpty()) {
			System.out.print(q.peek().key+" ");
			int count = q.size();
			for(int i=0; i<count; i++) {
				Node temp = q.poll();
				if(temp.left != null) {
					q.offer(temp.left);
				}
				if(temp.right != null) {
					q.offer(temp.right);
				}
			}
		}
		System.out.println();
	}

}
