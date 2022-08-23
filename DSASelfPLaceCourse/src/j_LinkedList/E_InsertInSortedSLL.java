package j_LinkedList;

public class E_InsertInSortedSLL {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printLL(head);
		
		head = sortedInsert(head, 25);
		printLL(head);
		head = sortedInsert(head, 50);
		printLL(head);
		head = sortedInsert(head, 5);
		printLL(head);
		

	}
	//O(n) time and O(1) space
	public static Node sortedInsert(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) {
			return temp;
		}
		if(x < head.data) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while(curr.next != null && curr.next.data < x) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		
		return head;
		
	}
	
	//O(n) time and O(1) space
	public static void printLL(Node head) {
		Node curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}
