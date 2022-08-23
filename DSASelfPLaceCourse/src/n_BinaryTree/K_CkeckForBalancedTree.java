package n_BinaryTree;

public class K_CkeckForBalancedTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		System.out.println(isBalanced(root));
		System.out.println(isBalanced1(root));
		
		
		Node root1 = new Node(8);
		root1.left = new Node(12);
		root1.left.left = new Node(13);
		root1.left.right = new Node(14);
		root1.right = new Node(15);
		root1.right.right = new Node(16);
		root1.right.right.right = new Node(17);
	
		System.out.println(isBalanced(root1));
		System.out.println(isBalanced1(root1));

	}
	
	//Naive Approach O(n^2) time and O(h) space
	public static boolean isBalanced(Node root) {
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right); 
	}
	
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}
	
	
	//Efficient Approach O(n) time and O(h) space
	public static int isBalanced1(Node root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = isBalanced1(root.left);
		if(leftHeight == -1) {
			return -1;
		}
		int rightHeight = isBalanced1(root.right);
		if(rightHeight == -1) {
			return -1;
		}
		
		if(Math.abs(leftHeight-rightHeight) > 1) {
			return -1;
		}else {
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	

}
