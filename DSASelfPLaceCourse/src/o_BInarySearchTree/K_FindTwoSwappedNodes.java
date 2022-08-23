package o_BInarySearchTree;

public class K_FindTwoSwappedNodes {

	static Node prev = null, first = null, second = null;
	
	public static void main(String[] args) {
		
		Node root = new Node(18);
		root.left = new Node(60);
		root.left.left = new Node(4);
		root.right = new Node(20);
		root.right.left = new Node(8);
		root.right.right = new Node(80);
		
		findSwappedNodes(root);

		System.out.println(first.key+" "+second.key);
		//Now we can swap the keys of first and second to correct the given tree.
		
	}
	
	//O(n) time and O(h) space
	public static void findSwappedNodes(Node root) {
		if(root == null) {
			return;
		}
		findSwappedNodes(root.left);
		if(prev != null && root.key < prev.key) {
			if(first == null) {
				first = prev;
			}
			second = root;
		}
		prev = root;
		findSwappedNodes(root.right);
	}

}
