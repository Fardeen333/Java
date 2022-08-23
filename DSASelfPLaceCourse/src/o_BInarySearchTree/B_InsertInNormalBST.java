package o_BInarySearchTree;

public class B_InsertInNormalBST {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.right.left = new Node(12);
		root.right.right = new Node(18);
//		root.right.right.right = new Node(20);
		
		Node temp = insertR(root, 20);
		System.out.println(temp.right.right.right.key);
		
		Node temp1 = insertI(root, 17);
		System.out.println(temp1.right.right.left.key);
		
		
	}
	
	//Recursive Approach
	//O(h) time and O(h) space
	public static Node insertR(Node root, int k) {
		if(root == null) {
			return new Node(k);
		}
		if(root.key > k) {
			root.left = insertR(root.left, k);
		}else if(root.key < k) {
			root.right = insertR(root.right, k);
		}
		return root;
	}
	
	//Iterative Approach 
	//O(h) time and O(1) space
	public static Node insertI(Node root, int k) {
		Node temp = new Node(k);
		Node curr = root, parent = null;
		while(curr != null) {
			parent = curr;
			if(curr.key > k) {
				curr = curr.left;
			}else if(curr.key < k) {
				curr = curr.right;
			}else {
				return root;
			}
		}
		if(parent == null) {
			return temp;
		}
		if(parent.key > k) {
			parent.left = temp;
		}else {
			parent.right = temp;
		}
		return root;
	}

}
