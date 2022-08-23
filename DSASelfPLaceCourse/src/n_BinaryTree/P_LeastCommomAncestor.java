package n_BinaryTree;

import java.util.ArrayList;

public class P_LeastCommomAncestor {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		Node res = lca(root,20,50);
		System.out.println(res.key);
		
		Node res1 = lca1(root, 40, 50);
		System.out.println(res1.key);

	}
	
	//Method 1 Naive Approach
	//O(n) time but 3 traversal and O(n) space
	public static Node lca(Node root, int n1, int n2) {
		ArrayList<Node> path1 = new ArrayList<>();
		ArrayList<Node> path2 = new ArrayList<>();
		if(findPath(root, path1, n1)==false || findPath(root, path2, n2)==false) {
			return null;
		}
		Node res= null;
		for(int i=0; i<path1.size()&&i<path2.size(); i++) {
			if(path1.get(i) == path2.get(i)) {
				res = path1.get(i);
			}
		}
		return res;
	}
	public static boolean findPath(Node root, ArrayList<Node> p, int n) {
		if(root == null) {
			return false;
		}	
		p.add(root);
		if(root.key == n) {
			return true;
		}
		if(findPath(root.left, p, n) || findPath(root.right, p, n)) {
			return true;
		}
		
		p.remove(p.size()-1);
		return false;
	}
	
	//Method 2 Efficient Approach
	//O(n) time and O(h) space single iteration
	public static Node lca1(Node root, int n1, int n2) {
		if(root == null) {
			return null;
		}
		if(root.key == n1 || root.key == n2) {
			return root;
		}
		Node lca1 = lca(root.left, n1, n2);
		Node lca2 = lca(root.right, n1, n2);
		
		if(lca1 != null && lca2 != null) {
			return root; 
		}
		if(lca1 != null) {
			return lca1;
		}else {
			return lca2;
		}
	}

}
