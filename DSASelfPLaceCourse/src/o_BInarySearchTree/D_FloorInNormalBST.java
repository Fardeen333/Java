package o_BInarySearchTree;

public class D_FloorInNormalBST {

	public static void main(String[] args) {
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right = new Node(70);
		root.right.left = new Node(60);
		root.right.left.left = new Node(55);
		root.right.left.right = new Node(65);
		root.right.right = new Node(80);
		
		Node floor = floor(root, 58);
		System.out.println(floor.key);
		
		
	}
	
	//Naive Approach O(n) time
	//We simply follow any traversal inOrder, preorder, postorder and get the closest smallest or equal to value
	
	//O(h) time and O(1) space
	public static Node floor(Node root, int x) {
		Node res = null;
		Node curr = root;
		while(curr != null) {
			if(curr.key == x) {
				return curr;
			}else if(curr.key > x) {
				curr = curr.left;
			}else {
				res = curr;
				curr = curr.right;
			}
		}
		return res;
	}

}
