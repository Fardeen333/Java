package n_BinaryTree;

import java.util.Stack;

public class U_IterativePreorderTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		
		preOrderTraversal(root);

	}
	
	//O(n) time and O(n) space
	public static void preOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			Node curr = s.pop();
			System.out.print(curr.key+" ");
			if(curr.right != null) {
				s.push(curr.right);
			}
			if(curr.left != null) {
				s.push(curr.left);
			}
		}
	}

}
