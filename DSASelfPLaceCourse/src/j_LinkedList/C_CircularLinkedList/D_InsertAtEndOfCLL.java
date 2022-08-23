package j_LinkedList.C_CircularLinkedList;

public class D_InsertAtEndOfCLL {

	public static void main(String[] args) {
		
		Node head = null;
		head = insertAtEnd(head, 10);
		head = insertAtEnd(head, 30);
		head = insertAtEnd(head, 40);
		printCLL(head);

		
		Node head1 = null;
		head1 = insertAtEnd1(head1, 100);
		head1 = insertAtEnd1(head1, 300);
		head1 = insertAtEnd1(head1, 400);
		printCLL(head1);
		
	}
	
	//Naive Approach O(n) time and O(1) space
	public static Node insertAtEnd(Node head, int x) {
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
		
		return head;
	}
	
	//Efficient Approach O(1) time and O(1) space
	public static Node insertAtEnd1(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		temp.next = head.next;
		head.next = temp;
		int t = head.data;
		head.data = temp.data;
		temp.data = t;
		
		return temp;
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
