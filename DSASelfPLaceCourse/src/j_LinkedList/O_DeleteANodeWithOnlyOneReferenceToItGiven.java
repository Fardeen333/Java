package j_LinkedList;

public class O_DeleteANodeWithOnlyOneReferenceToItGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		
		printLL(head);
		deleteNode(head.next.next.next);
		printLL(head);

	}
	
	public static void deleteNode(Node ref) {
		ref.data = ref.next.data;
		ref.next = ref.next.next;
	}
	
	//printing the Linked List
	//O(n) time and O(1) space
	public static void printLL(Node head) {
		Node curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}
