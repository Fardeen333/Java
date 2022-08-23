package n_BinaryTree;

public class M_ConstructingBinaryTreeFromInOrderAndPreOrder {

	static int preIndex =0 ;
	
	public static void main(String[] args) {
		int in[] = {20,10,40,30,50};
		int pre[] = {10,20,30,40,50};
		
		Node root = construct(in, pre, 0, in.length-1);
		inorderTraversal(root);
		
		

	}
	
	//is --> In order start index  ie --> In order end task
	//O(n^2) time and O(h) space
	public static Node construct(int in[], int pre[], int is, int ie) {
		if(is > ie) {
			return null;
		}
		
		Node root = new Node(pre[preIndex++]);
		int inIndex = 0;
		for(int i=is; i<=ie; i++) {
			if(in[i] == root.key) {
				inIndex = i;
				break;
			}
		}
		
		root.left = construct(in, pre, is, inIndex-1);
		root.right = construct(in, pre, inIndex+1, ie);
		
		return root;
 	}
	
	//O(n) time and O(h) space where h is the height of the tree
	public static void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.key+" ");
			inorderTraversal(root.right);
		}
	}

}
