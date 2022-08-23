package o_BInarySearchTree;

public class J_IsBSTOrNot {
	
	static int prev = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(18);
		root.right.right = new Node(35);
		
		Node root1 = new Node(80);
		root1.left = new Node(70);
		root1.left.left = new Node(60);
		root1.left.right = new Node(75);
		root1.right = new Node(90);
		root1.right.left = new Node(85);
		root1.right.right = new Node(100);
		
		//Method 1
		System.out.println(isBST1(root)+" "+isBST1(root1));  // it is returning true but it should return false;
		//Method 2
		System.out.println(isBST2(root)+" "+isBST2(root1));  
		//Method 3
		System.out.println(isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE)+" "+isBST3(root1, Integer.MIN_VALUE, Integer.MAX_VALUE));  
		//Method 4
		System.out.println(isBST4(root)+" "+isBST4(root1));
	}
	
	//Method 1 Simple but Incorrect
	public static boolean isBST1(Node root) {
		if(root == null) {
			return true;
		}
		boolean isLeft = true;
		boolean isRight = true;
		if(root.left != null) {
			isLeft = root.key > root.left.key;
		}
		if(root.right != null) {
			isRight = root.key < root.right.key;
		}		
		return (isLeft && isRight ) && isBST1(root.left) && isBST1(root.right);
	}
	
	//Method 2 Correct but inefficient O(n^2) time and O(1) space
	public static boolean isBST2(Node root) {
		if(root == null) {
			return true;
		}
		boolean isLeft = true;
		boolean isRight = true;
		if(root.left != null) {
			isLeft = root.key > maximum(root.left);
		}
		if(root.right != null) {
			isRight = root.key < minimum(root.right);
		}
		return (isLeft&&isRight) && isBST2(root.left) && isBST2(root.right);
	}
	
	public static int maximum(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
	}
	public static int minimum(Node root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.key, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	//Method 3 Using range O(n) time and o(h) space
	public static boolean isBST3(Node root, int min, int max) {
		if(root == null) {
			return true;
		}
		return (root.key>min && root.key<max) && isBST3(root.left, min, root.key) && isBST3(root.right, root.key, max);
	}
	
	//Method 4 Using the fact that inOrder traversal of a BST is sorted
	//We can store the inOrder Traversal of the BST and then check for sorted or not but it will take 2 traversal
	//O(n) time and O(h) space
	public static boolean isBST4(Node root) {
		if(root == null) {
			return true;
		}
		if(isBST4(root.left) == false) {
			return false;
		}
		if(root.key <= prev ) {
			return false;
		}
		prev = root.key;
		return isBST4(root.right);
	}
	

}
