package n_BinaryTree;

import java.util.Stack;

public class V_IterativePreOrderTraversalSpaceOptimized {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		
		traversal(root);

	}
	
	//O(n) time and O(h) space
	//O(h) space because only right nodes will be present in the stack
	public static void traversal(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		Node curr = root;
		while(curr!=null || !s.isEmpty()) {
			while(curr!=null) {
				System.out.print(curr.key+" ");
				if(curr.right != null) {
					s.push(curr.right);
				}
				curr = curr.left;
			}
			if(!s.isEmpty()) {
				curr = s.pop();
			}
		}
	}
	
}
