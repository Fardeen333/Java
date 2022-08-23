package n_BinaryTree;

public class Q_BurnBinaryTreeFromTargetLeaf {

	static int res = 0;
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.left.left = new Node(60);
		root.left.left.left.left = new Node(70);

		Distance dist = new Distance(-1);
		
		int height = burntree(root, 50, dist);
		System.out.println("The height of the tree is "+height+ " and the minimum burning time is "+res);
	}
	
	//O(n) time and O(h) space and  Single traversal
	//Modification to the height function of the binary tree
 	public static int burntree(Node root, int leaf, Distance dist) {
		if(root == null) {
			return 0;
		}
		if(root.key == leaf) {
			dist.val = 0;
			return 1;
		}
		Distance ldist = new Distance(-1);
		Distance rdist = new Distance(-1);
		int lh = burntree(root.left, leaf, ldist);
		int rh = burntree(root.right, leaf, rdist);
		if(ldist.val != -1) {
			dist.val = ldist.val + 1;
			res = Math.max(res, rh+dist.val); 
		}else if(rdist.val != -1) {
			dist.val = rdist.val + 1;
			res = Math.max(res, lh+dist.val);
		}
		return 1 + Math.max(lh, rh);
	}

}

class Distance{
	int val;
	public Distance(int val) {
		this.val = val;
	}
}
