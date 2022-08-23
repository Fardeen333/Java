package n_BinaryTree;

public class B_HeightOfBinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		System.out.println(height(root));
		
	}
	
	//O(n) time and O(h) space where h is the height of the tree
 	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}

}
