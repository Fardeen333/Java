package j_LinkedList.D_CircularDoublyLinkedList;

public class B_InsertAtHeadOfDCLL {

	public static void main(String[] args) {
		Node head = null;
		head = insertAtHead(head, 10);
		printCDLL(head);
		head = insertAtHead(head, 20);
		printCDLL(head);
		head = insertAtHead(head, 30);
		printCDLL(head);

	}
	
	//O(1) time and O(1) space
	public static Node insertAtHead(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
		temp.next = head;
		temp.prev = head.prev;
		
		head.prev.next = temp;
		head.prev = temp;
		
		return temp;
	}
	
	//printing the CDLL
	public static void printCDLL(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data+" ");
		for(Node curr= head.next; curr != head; curr= curr.next) {
			System.out.print(curr.data+" ");
		}
		System.out.println();
	}

}
