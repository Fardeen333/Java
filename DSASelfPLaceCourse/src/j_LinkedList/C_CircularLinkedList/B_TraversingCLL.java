package j_LinkedList.C_CircularLinkedList;

public class B_TraversingCLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = head;
		
		printCLL(head);
		printCLL1(head);

	}
	
	//Method 1 Using for loop
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
	
	//Method 2 Using do-while loop
	public static void printCLL1(Node head) {
		Node curr = head;
		do {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}while(curr != head);
		
		System.out.println();
	}
	

}
