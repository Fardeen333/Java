package n_BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class D_LevelOrderTraversalOfTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(15);
		root.left.left = new Node(30);
		
		root.right = new Node(20);
		root.right.left = new Node(40);
		root.right.left.left = new Node(60);
		root.right.left.right = new Node(70);
		
		root.right.right = new Node(50);
		
		levelOrderTraversal(root);
		
		

	}
	
	
	//Method 1 O(n+(h*n)) time and O(h) space ==> O(h*n) time and O(h)  space
	//finding the height of the tree and then printing the nodes from distance [0, h) from the root
	
	//Method 2 O(n)(or O(2n)) time and O(n)(or O(w)) space where w is the width of the tree
	public static void levelOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.key+" ");
			if(temp.left != null) {
				q.offer(temp.left);
			}
			if(temp.right != null) {
				q.offer(temp.right);
			}
		}
		
	}

}
