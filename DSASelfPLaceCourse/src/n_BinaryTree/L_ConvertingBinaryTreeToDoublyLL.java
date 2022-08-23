package n_BinaryTree;

public class L_ConvertingBinaryTreeToDoublyLL {

	static Node prev = null;
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		
		Node head = convertBTtoDLL(root);
		print(head);
		

	}
	//O(n) time and O(h) space
	public static Node convertBTtoDLL(Node root) {
		if(root == null) {
			return root;
		}
		Node head = convertBTtoDLL(root.left);
		if(prev == null) {
			head = root;
		}else{
			prev.right = root;
			root.left = prev;
		}
		prev = root;
		convertBTtoDLL(root.right);
		return head;
	}
	//utility function to print the DLL
	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.key+" ");
			head = head.right;
		}
		System.out.println();
	} 

}
