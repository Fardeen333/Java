package n_BinaryTree;

public class O_DiameterOfTheBinaryTree {

	static int res = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.left.left = new Node(50);
		root.right.right = new Node(60);
		root.right.right.right = new Node(70);
		
		System.out.println(diameter(root));
		
		System.out.println("The height of the tree is "+diameterviaHeight(root)+" and the diameter is "+ res);
		
		

	}
	
	//Naive Approach 
	//Method 1 O(n^2) time and O(h) space
	public static int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		int d1 = 1 + height(root.left) + height(root.right);
//		int d2 = diameter(root.left);
//		int d3 = diameter(root.right);
//		return Math.max(d1, Math.max(d2, d3));
		return Math.max(d1, Math.max(diameter(root.left), diameter(root.right)));
	}
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}
	
	//Better APproach O(n) time and O(n) space
	//Do previous computation of height at each node and store them in a HAshMap
	//use these heights to compare the diameter at each node
	
	//Efficient Approach by modifying the height function at each Node
	//O(n) time and O(h) space
	//This function return the height of the tree but it sets the "res" variable to diameter
	public static int diameterviaHeight(Node root) {
		if(root == null) {
			return 0;
		}
		int lh = diameterviaHeight(root.left);
		int rh = diameterviaHeight(root.right);
		res = Math.max(res, 1+lh+rh);
		return Math.max(lh, rh)+1;
	}


}
