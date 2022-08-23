package j_LinkedList;

public class P_SegregateEvenAndOddNodes {
	
	public static void main(String args[]) {
		
		Node head = new Node(17);
		head.next = new Node(15);
		head.next.next = new Node(8);
		head.next.next.next = new Node(12);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(5);
		head.next.next.next.next.next.next = new Node(4);
		
		printLL(head);
		head = segregate(head);
		printLL(head);
	}

	//O(n) time and O(1) space
	public static Node segregate(Node head) {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		for(Node curr=head; curr!=null; curr=curr.next) {
			int x =curr.data;
			if(x%2 == 0) {
				if(evenStart == null) {
					evenStart = curr;
					evenEnd = curr;
				}else {
					evenEnd.next = curr;
					evenEnd = evenEnd.next;
				}
			}else {
				if(oddStart == null) {
					oddStart = curr;
					oddEnd = curr;
				}else {
					oddEnd.next = curr;
					oddEnd = oddEnd.next;
				}
			}

		}
		if(evenStart==null || oddStart == null) {
			return head;
		}
		evenEnd.next = oddStart;
		oddEnd.next = null;
		return evenStart;
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
