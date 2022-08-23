package o_BInarySearchTree;

public class C_DeleteInNormalBST {

	public static void main(String[] args) {
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.left.right = new Node(40);		
		root.right = new Node(70);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		
		
		//         50
		//        /  \
		//      30    70
		//        \   /  \
		//        40  60  80
		
		
//		//deleting the internal node
//		Node temp = delete(root, 30);
//		System.out.println(root.left.key);
		
		//deleting a Node having two child
		Node temp = delete(root, 50);
		System.out.println(temp.key);
		

	}
	
	//O(h) time and O(h) space
	public static Node delete(Node root, int x) {
		if(root == null) {
			return null;
		}
		if(root.key > x) {
			root.left = delete(root.left, x);
		}else if(root.key < x) {
			root.right = delete(root.right, x);
		}else {
			if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}else {
				Node successor = getSuccessor(root);
				root.key = successor.key;
				root.right = delete(root.right, successor.key);
			}
			
		}
		return root;
	}
	
	public static Node getSuccessor(Node root) {
		Node curr = root.right;
		while(curr!=null && curr.left!=null) {
			curr = curr.left;
		}
		return curr;
	}

}
