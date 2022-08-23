package j_LinkedList.B_DoublyLinkedList;

public class D_ReverseDLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		temp1.next = temp2;

		temp1.prev = head;
		temp2.prev = temp1;
		
		printDLL(head);
		
		head = reverse(head);
		printDLL(head);
		
	}
	
	//O(n) time and O(1) space
	public static Node reverse(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node temp = null;
		Node curr = head;
		while(curr != null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;
	}
	
	//printing function
		public static void printDLL(Node head) {
			Node curr = head;
			while(curr != null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			System.out.println();
		}

}
