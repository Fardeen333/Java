package j_LinkedList.A_SinglyLinkedList;

public class F_DeleteAtEndInSinglyLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printLL(head);
		head = deleteAtEnd(head);
		printLL(head);
		head = deleteAtEnd(head);
		printLL(head);
		head = deleteAtEnd(head);
		printLL(head);
		head = deleteAtEnd(head);
		printLL(head);

	}
	//function to remove last node
	//O(n) time and O(1) space
	public static Node deleteAtEnd(Node head) {
		if(head.next == null || head == null) {
			return null;
		}
		Node curr = head;
		while(curr.next.next !=null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
	
	//utility function to print the linked list
		public static void printLL(Node head) {
			Node curr = head; 
			while(curr != null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			System.out.println();
		}

}
