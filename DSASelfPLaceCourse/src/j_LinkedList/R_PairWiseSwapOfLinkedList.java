package j_LinkedList;

public class R_PairWiseSwapOfLinkedList {

	public static void main(String[] args) {
		//Method 1
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		printLL(head);
		pairwiseSwap(head);
		printLL(head);
		
		
		//Method 2
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.next.next.next.next.next = new Node(6);
		
		printLL(head1);
		head1 = pairwiseSwap1(head1);
		printLL(head1);

	}
	
	//Method 1 using Swapping
	//O(n) time and O(1) space
	public static void pairwiseSwap(Node head) {
		Node curr= head;
		while(curr!=null && curr.next!=null) {
			int temp = curr.data;
			curr.data = curr.next.data;
			curr.next.data = temp;
			
			curr=curr.next.next;
		}
	}
	
	//Method 2 by changing references
	//O(n) time and O(1) space
	public static Node pairwiseSwap1(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node curr = head.next.next;
		Node prev = head;
		head = head.next;
		head.next = prev;
		
		while(curr !=null && curr.next!=null) {
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = curr;
			curr = next;
		}
		prev.next = curr;
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
