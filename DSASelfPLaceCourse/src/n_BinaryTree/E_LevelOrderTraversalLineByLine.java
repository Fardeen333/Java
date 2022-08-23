package n_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class E_LevelOrderTraversalLineByLine {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(15);
		root.left.left = new Node(30);
		
		root.right = new Node(20);
		root.right.left = new Node(40);
		root.right.left.left = new Node(60);
		root.right.left.right = new Node(70);
		
		root.right.right = new Node(50);
		
		lineByLineTraversal(root);
		System.out.println();
		System.out.println();
		lineByLineTraversal1(root);

	}
	
	//Method 1 
	//O(n+h) time == O(n) time
	//O(w) space == O(n) space
	public static void lineByLineTraversal(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		q.offer(null);
		while(q.size()>1) {
			Node temp = q.poll();
			if(temp == null) {
				q.offer(null);
				System.out.println();
				continue;
			}
			System.out.print(temp.key+" ");
			if(temp.left != null) q.offer(temp.left);
			if(temp.right != null) q.offer(temp.right);
		}
	}
	
	//Method 2
	//O(2*n) time  O(n) time
	//O(n) space or we can say O(w) where w is the width of the tree 
	public static void lineByLineTraversal1(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int count = q.size();
			for(int i=0; i<count; i++) {
				Node temp = q.poll();
				System.out.print(temp.key+" ");
				if(temp.left != null) {
					q.offer(temp.left);
				}
				if(temp.right != null) {
					q.offer(temp.right);
				}
			}
			System.out.println();
		}
	}

}
