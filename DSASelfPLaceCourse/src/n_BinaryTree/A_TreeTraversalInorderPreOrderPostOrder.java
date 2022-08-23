package n_BinaryTree;

public class A_TreeTraversalInorderPreOrderPostOrder {

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);
		
		root.right = new Node(30);
		root.right.right = new Node(60);
		
		inorderTraversal(root);
		System.out.println();
		preorderTraversal(root);
		System.out.println();
		postorderTraversal(root);
	}
	
	//O(n) time and O(h) space where h is the height of the tree
	public static void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.key+" ");
			inorderTraversal(root.right);
		}
	}
	//O(n) time and O(h) space where h is the height of the tree
	public static void preorderTraversal(Node root) {
		if(root != null) {
			System.out.print(root.key+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	//O(n) time and O(h) space where h is the height of the tree
	public static void postorderTraversal(Node root) {
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.key+" ");
		}
	}
	

}
