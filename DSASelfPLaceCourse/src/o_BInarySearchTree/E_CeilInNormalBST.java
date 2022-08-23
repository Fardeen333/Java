package o_BInarySearchTree;

public class E_CeilInNormalBST {

	public static void main(String[] args) {
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right = new Node(70);
		root.right.left = new Node(60);
		root.right.left.left = new Node(55);
		root.right.left.right = new Node(65);
		root.right.right = new Node(78);
		
		Node ceil = ceil(root, 15);
		System.out.println(ceil.key);
		
		

	}
	
	//Naive Approach O(n) time
	//We simply follow any traversal inOrder, preOrder, postOrder and get the closest greater or equal to value
	
	//O(h) time and O(1) space
	public static Node ceil(Node root, int x) {
		Node res = null;
		while(root != null) {
			if(root.key == x) {
				return root;
			}else if(root.key < x) {
				root = root.right;
			}else {
				res = root;
				root = root.left;
			}
		}
		return res;
	}

}
