package n_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class J_MaximumWidthOfTheTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.left = new Node(60);
		
		System.out.println(width(root));
		

	}
	
	//O(n) time and O(w) space
	public static int width(Node root) {
		if(root == null) {
			return 0;
		}
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int res = 0;
		while(!q.isEmpty()) {
			int count  = q.size();
			res = Math.max(res, count);
			for(int i=0; i<count; i++) {
				Node temp = q.poll();
				if(temp.left != null) {q.offer(temp.left);}
				if(temp.right != null) {q.offer(temp.right);}
			}
		}
		return res;
	}

}
