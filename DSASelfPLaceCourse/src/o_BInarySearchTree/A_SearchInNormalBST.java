package o_BInarySearchTree;

public class A_SearchInNormalBST {

	public static void main(String[] args) {
		
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.left.left = new Node(16);
		root.right.right = new Node(80);
		
		System.out.println(search(root, 18)+" "+search(root, 100));
		System.out.println(search1(root, 16)+" "+search1(root, 100));
		

	}
	
	//Recursive Approach
	//O(h) time and O(h) space
	public static boolean search(Node root, int key) {
		if(root == null) {
			return false;
		}
		if(root.key == key) {
			return true;
		}
		if(root.key > key) {
			return search(root.left, key);
		}else {
			return search(root.right, key);
		}
	}
	
	//Iterative Approach 
	//O(h) time and O(1) space
	public static boolean search1(Node root, int key) {
		while(root != null) {
			if(root.key == key) {
				return true;
			}
			if(root.key < key) {
				root = root.right;
			}else {
				root = root.left;
			}
		}
		return false;
	}

}
