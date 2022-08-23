package j_LinkedList;

public class F_MiddleOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		
		middle(head);
		head.next.next.next.next.next = new Node(60);
		middle(head);
		middle1(head);
		head.next.next.next.next.next.next = new Node(70);
		middle1(head);
		
	}
	//Naive Approach O(n) time and O(1) space but 2 iteration
	public static void middle(Node head) {
		if(head == null) {
			return;
		}
		int count =0;
		Node curr = null;;
		for(curr=head; curr != null;curr=curr.next) {
			count++;
		}
		curr = head;
		for(int i=0; i<(count/2); i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
	
	//Efficient Approach O(n) time and O(1) space but 1 iteration
	public static void middle1(Node head) {
		if(head == null) {
			return;
		}
		Node slow = head;
		Node fast = head;
		while(fast!= null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

}
