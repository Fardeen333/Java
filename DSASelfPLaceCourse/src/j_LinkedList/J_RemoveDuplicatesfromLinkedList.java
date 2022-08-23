package j_LinkedList;

public class J_RemoveDuplicatesfromLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		head.next.next.next.next.next = new Node(30);
		
		printLL(head);
		
		removeDuplicates(head);
		printLL(head);

	}
	//O(n) time and O(1) space
	public static void removeDuplicates(Node head) {
		if(head == null) {
			return;
		}
		Node curr =  head;
		while(curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
		}
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
