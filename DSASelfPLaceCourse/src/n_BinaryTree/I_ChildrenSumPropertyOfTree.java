package n_BinaryTree;

public class I_ChildrenSumPropertyOfTree {

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8); 
		root.right = new Node(12); 
		root.right.left = new Node(3); 
		root.right.right = new Node(9);
		
		System.out.println(isCSum(root));
		
		Node root1 = new Node(3);
		root1.left = new Node(1);
		root1.right = new Node(2);
		root1.right.left = new Node(1);
		root1.right.right = new Node(2);
		
		
		System.out.println(isCSum(root1));

	}
	
	public static boolean isCSum(Node root) {
		if(root == null) {
			return true;
		}
		if(root.left==null && root.right ==null) {
			return true;
		}
		int sum = 0;
		if(root.left != null) {sum += root.left.key;}
		if(root.right != null) {sum += root.right.key;}
		
		return (sum==root.key) && isCSum(root.left) && isCSum(root.right);
	}

}
