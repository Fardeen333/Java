package n_BinaryTree;

public class R_NodesInACompleteBinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		
		System.out.println(number(root));
		System.out.println(countNodes(root));
		

	}
	
	//Naive Approach O(n) time and O(h) space
	public static int number(Node root) {
		if(root == null) {
			return 0;
		}
		return 1+number(root.left)+number(root.right);
	}
	
	//Efficient Approach O(logn*logn) 
	public static int countNodes(Node root) {
		if(root == null) {
			return 0;
		}
		int lh=0;
		int rh = 0;
		Node curr = root;
		while(curr != null) {
			lh++;
			curr = curr.left;
		}
		curr = root;
		while(curr != null) {
			rh++;
			curr= curr.right;
		}
		if(lh == rh) {
			return (int)Math.pow(2,lh)-1;
		}
		return 1+countNodes(root.left)+countNodes(root.right);
	}

}
