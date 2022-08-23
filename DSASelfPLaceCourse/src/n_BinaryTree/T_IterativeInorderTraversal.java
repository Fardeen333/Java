package n_BinaryTree;

import java.util.Stack;

public class T_IterativeInorderTraversal {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		
		inorderTraversal(root);

	}
	
	//O(2n) time and O(h) space
	//Every Node comes in And Out of the stack only once
	public static void inorderTraversal(Node root) {
		Stack<Node> s = new Stack<>();
		Node curr = root;
		while(curr != null || !s.isEmpty()) {
			while(curr != null) {
				s.push(curr);
				curr=curr.left;
			}
			curr = s.pop();
			System.out.print(curr.key+" ");
			curr = curr.right;
		}
	}

}
