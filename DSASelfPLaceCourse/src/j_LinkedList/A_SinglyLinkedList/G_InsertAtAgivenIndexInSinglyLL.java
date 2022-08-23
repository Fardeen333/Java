package j_LinkedList.A_SinglyLinkedList;

public class G_InsertAtAgivenIndexInSinglyLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printLL(head);
		head = insertAtPos(head, 100, 2);
		printLL(head);
	}
	
	//O(pos) time and O(1) space
	public static Node insertAtPos(Node head, int x, int pos) {
		Node temp = new Node(x);
		if(pos == 1) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		for(int i=1; i<=pos-2 && curr!=null; i++) {
			curr = curr.next;
		}
		if(curr == null) {
			return head;
		}
		temp.next = head.next;
		curr.next = temp;
		
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
