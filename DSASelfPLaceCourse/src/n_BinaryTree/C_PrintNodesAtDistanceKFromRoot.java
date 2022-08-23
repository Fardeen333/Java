package n_BinaryTree;

public class C_PrintNodesAtDistanceKFromRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		
		root.right = new Node(30);
		root.right.right = new Node(70);
		root.right.right.right = new Node(80);
		
		printNodesAtK(root, 0);
		System.out.println();
		printNodesAtK(root, 1);
		System.out.println();
		printNodesAtK(root, 2);
		System.out.println();
		printNodesAtK(root, 3);
		
	}
	
	//O(n) time and O(h) space 
	public static void printNodesAtK(Node root, int k) {
		if(root == null) {
			return;
		}
		if(k==0) {
			System.out.print(root.key+" ");
//			return;
		}
		printNodesAtK(root.left, k-1);
		printNodesAtK(root.right, k-1);
	}

}
