package j_LinkedList.C_CircularLinkedList;

public class C_InsertAtBeginningOfCLL {

	public static void main(String[] args) {
		
		Node head = null;
		head = insertAtBegin(head, 10);
		head = insertAtBegin(head, 30);
		head = insertAtBegin(head, 40);
		printCLL(head);
		head = insertAtBegin(head, 5);
		printCLL(head);
		Node head1 = null;
		head1 = insertAtBegin(head1, 20);
		head1 = insertAtBegin(head1, 10);
		head1 = insertAtBegin(head1, 50);
		printCLL(head1);
		head1 = insertAtBegin(head1, 5);
		printCLL(head1);
		
		
	}
	
	
	//Naive Approach O(n) time and O(1) space 
	public static Node insertAtBegin(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.next = head;
		return temp;
	}
	
	//Efficient Approach(Trick Approach) O(1) time and O(1) space
	public static Node insertAtBeginning(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		temp.next = head.next;
		head.next = temp;
		int r = head.data;
		head.data = temp.data;
		temp.data = r;
		
		return head;
	}
	
	//printing the CLL
	public static void printCLL(Node head) {
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
