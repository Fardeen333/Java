package j_LinkedList.B_DoublyLinkedList;

public class E_DeleteHeadOfDLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		temp1.next = temp2;

		temp1.prev = head;
		temp2.prev = temp1;

		printDLL(head);
		
		head = deleteAtHead(head);
		
		printDLL(head);

	}
	
	//O(1) time and O(1) space
	public static Node deleteAtHead(Node head) {
		if(head == null) {
			return null;
		} 
		if(head.next == null) {
			return null;
		}
		head = head.next;
		head.prev = null;
		return head;
	}
		
	
	//printing the DLL
	public static void printDLL(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}
