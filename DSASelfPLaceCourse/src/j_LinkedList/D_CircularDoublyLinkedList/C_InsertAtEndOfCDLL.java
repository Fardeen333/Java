package j_LinkedList.D_CircularDoublyLinkedList;

public class C_InsertAtEndOfCDLL {

	public static void main(String[] args) {
		
		Node head = null;
		head = insertAtEnd(head, 10);
		printCDLL(head);
		head = insertAtEnd(head, 20);
		printCDLL(head);
		head = insertAtEnd(head, 30);
		printCDLL(head);

	}
	
	//O(1) time and O(1) space
	public static Node insertAtEnd(Node head, int x) {
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
		
		return head;
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
