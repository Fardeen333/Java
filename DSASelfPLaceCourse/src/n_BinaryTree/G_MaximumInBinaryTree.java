package n_BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class G_MaximumInBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(80);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		System.out.println(maximum(root));
		System.out.println(maximum1(root));

	}
	
	//Method 1 recursive Approach
	//O(n) time and O(h) space
	public static int maximum(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
	}
	
	//Method 2 iterative approach
	//O(n) time and O(w) space
	public static int maximum1(Node root) {
		int res = Integer.MIN_VALUE;
		if(root == null) {
			return res;
		}
		Queue<Node> q = new ArrayDeque<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			res = Math.max(res, temp.key);
			if(temp.left != null) { q.offer(temp.left);}
			if(temp.right != null) {q.offer(temp.right);}
		}
		return res;
	}

}
