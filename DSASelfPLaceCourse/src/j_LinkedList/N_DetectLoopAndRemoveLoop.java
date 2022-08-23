package j_LinkedList;

public class N_DetectLoopAndRemoveLoop {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = head.next.next;
		
//		printLL(head); this will run indefinitely because there's a loop 
		detectAndRemoveLoop(head);
		printLL(head);

	}
	
	public static void detectAndRemoveLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;	
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		if(slow != fast) {
			return;
		}
		slow = head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
		
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
