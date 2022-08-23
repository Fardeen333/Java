package n_BinaryTree;

public class F_SizeOfTheTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.right = new Node(60);
		
		System.out.println("The size of the given tree is : "+size(root));
		
	}
	
	//O(n) time and O(h) space
	public static int size(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}

}
