package j_LinkedList.A_SinglyLinkedList;

public class E_DeleteAtBeginningInSinglyLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printLL(head);
		head = deleteAtBeginning(head);
		printLL(head);
		head = deleteAtBeginning(head);
		printLL(head);
		head = deleteAtBeginning(head);
		printLL(head);
		head = deleteAtBeginning(head);
		printLL(head);
		head = deleteAtBeginning(head);
		printLL(head);

	}
	
	//function to delete first element
	public static Node deleteAtBeginning(Node head) {
		if(head == null) {
			return null;
		}
		return head.next;
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
