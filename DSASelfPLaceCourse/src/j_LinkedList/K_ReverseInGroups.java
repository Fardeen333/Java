package j_LinkedList;

public class K_ReverseInGroups {

	public static void main(String[] args) {
		
		//Method 1 using recursion
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		printLL(head);
		
		head = reverseInGroups(head, 3);
		printLL(head);
		
		System.out.println();
		
		//Method 2 using iteration
		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);
		head1.next.next.next.next = new Node(50);
		head1.next.next.next.next.next = new Node(60);
		printLL(head1);
		
		head1 = reverseInGroups1(head1, 3);
		printLL(head1);
		

	}
	
	//Recursive Approach O(n) time and O(n/k) space
	public static Node reverseInGroups(Node head, int k) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		while(curr != null && count<k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
			count++;
		}
		if(next != null) {
			Node rest_head = reverseInGroups(next, k);
			head.next = rest_head;
		}
		return prev;
	}
	
	//Iterative Approach O(n) time and O(1) space
	public static Node reverseInGroups1(Node head, int k) {
		Node curr = head;
		Node prevFirst = null;
		boolean firstPass = true;
		while(curr != null) {
			int count = 0;
			Node prev = null;
			Node first = curr;
			while(curr != null && count<k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				
				count++;
			}
			if(firstPass) {
				head = prev;
				firstPass = false;
			}else {
				prevFirst.next = prev;
			}
			prevFirst = first;
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
