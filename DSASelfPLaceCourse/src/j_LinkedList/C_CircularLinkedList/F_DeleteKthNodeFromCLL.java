package j_LinkedList.C_CircularLinkedList;

public class F_DeleteKthNodeFromCLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = head;
		
		printCLL(head);
		head = deleteKthNode(head, 3);
		printCLL(head);
		head = deleteKthNode(head, 1);
		printCLL(head);
//		head = deleteHead(head);
//		printCLL(head);

	}
	//O(n) time and O(1) space
	public static Node deleteKthNode(Node head, int k) {
		if(head == null || head.next == null) {
			return null;
		}
		if(k==1) {
			return deleteHead(head);
		}
		Node curr = head;
		for(int i=0; i<k-2; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}
	
	public static Node deleteHead(Node head){
		if(head == null || head.next==null) {
			return null;
		}
		head.data = head.next.data;
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
