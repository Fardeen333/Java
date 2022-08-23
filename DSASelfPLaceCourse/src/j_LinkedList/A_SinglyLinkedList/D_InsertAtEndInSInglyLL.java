package j_LinkedList.A_SinglyLinkedList;

public class D_InsertAtEndInSInglyLL {

	public static void main(String[] args) {
		
		Node head = null;
		head = insertAtEnd(head,10);
		head = insertAtEnd(head,20);
		head = insertAtEnd(head,30);
		
		printLL(head);

	}
	
	//O(n) time and O(1) sapce
	public static Node insertAtEnd(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			return temp;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	
	//utility function to print the LL
	public static void printLL(Node head) {
		Node curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}
