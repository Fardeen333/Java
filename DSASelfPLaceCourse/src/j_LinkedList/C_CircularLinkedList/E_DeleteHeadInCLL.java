package j_LinkedList.C_CircularLinkedList;

public class E_DeleteHeadInCLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = head;
		
		printCLL(head);
		
		head = deletehead(head);
		printCLL(head);
		head = deleteHead(head);
		printCLL(head);

	}
	
	//Naive Approach o(n) time and O(1) space
	public static Node deletehead(Node head) {
		if(head == null || head.next==null) {
			return null;
		}
		Node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		curr.next = head.next;
		return curr.next;
	}
	
	//Efficient Approach O(1) time and o(1) space
	public static Node deleteHead(Node head) {
		if(head == null || head.next==null) {
			return null;
		}
		head.data= head.next.data;
		head.next = head.next.next;
		
		return head;
	}
	
	//printing the CLL
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

}
