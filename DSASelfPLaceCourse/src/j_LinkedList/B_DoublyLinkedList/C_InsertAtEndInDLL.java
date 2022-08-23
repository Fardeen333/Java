package j_LinkedList.B_DoublyLinkedList;

public class C_InsertAtEndInDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = null;
		head = insertAtEnd(head, 10);
		head = insertAtEnd(head, 20);
		head = insertAtEnd(head, 30);
		
		printDLL(head);
		
		head = insertAtEnd(head, 5);
		
		printDLL(head);

	}
	//O(n) time and O(1) space
	public static Node insertAtEnd(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			return temp;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		
		return head;
	}
	
	//printing function
	public static void printDLL(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}
