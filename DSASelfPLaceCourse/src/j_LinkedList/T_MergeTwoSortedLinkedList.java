package j_LinkedList;

public class T_MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		
		Node head2 = new Node(5);
		head2.next = new Node(10);
		head2.next.next = new Node(15);
		head2.next.next.next = new Node(25);
		head2.next.next.next.next = new Node(30);
		
		printLL(head1);
		printLL(head2);
		Node head = merge(head1, head2);
		printLL(head);
		

	}
	
	//O(n+m) time and O(1) space
	public static Node merge(Node a, Node b) {
		if(a == null) {
			return b;
		}
		if(b == null) {
			return a;
		}
		Node head = null;
		Node prev = null;
		if(a.data<=b.data) {
			head = a;
			prev = a;
			a= a.next;
		}else {
			head =b;
			prev =b;
			b = b.next;
		}
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				prev.next =a;
				prev = prev.next;					
				a=a.next;
			}else {
				prev.next =b;
				prev = prev.next;					
				b=b.next;
			}
		}
		if(a==null) {
			prev.next = b;
		}else {
			prev.next = a;
		}
		
		return head;
	}
	
	//printing the Linked List
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
