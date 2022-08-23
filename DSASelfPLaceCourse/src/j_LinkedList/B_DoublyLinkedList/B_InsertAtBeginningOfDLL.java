package j_LinkedList.B_DoublyLinkedList;

public class B_InsertAtBeginningOfDLL {

	public static void main(String[] args) {
		
		Node head = null;
		head = insertAtBegin(head, 10);
		head = insertAtBegin(head, 20);
		head = insertAtBegin(head, 30);
		
		printDLL(head);
		
		head = insertAtBegin(head, 5);
		printDLL(head);

	}
	
	//O(1) time and O(1) space
	public static Node insertAtBegin(Node head, int x) {
		Node temp = new Node(x);
		
		temp.next = head;
		if(head != null) {
			head.prev = temp;
		}
		return temp;
	}
	
	public static void printDLL(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}
