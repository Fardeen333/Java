package j_LinkedList.B_DoublyLinkedList;

public class F_DeleteLastNodeInDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		temp1.next = temp2;

		temp1.prev = head;
		temp2.prev = temp1;

		printDLL(head);
		
		head = deleteAtEnd(head);
		printDLL(head);

	}
	//O(n) time and O(1) space
	public static Node deleteAtEnd(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;
		curr.prev = null;
		
		return head;
	}
	
	//printing the DLL
		public static void printDLL(Node head) {
			Node curr = head;
			while(curr != null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			System.out.println();
		}
	
	
	

}
