package j_LinkedList;

public class I_ReverseLinkedListRecursive {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		
		printLL(head);
		head = reverse(head, null);
		printLL(head);

	}
	//O(n) time and O(1) space
	public static Node reverse(Node curr, Node prev) {
		if(curr == null) {
			return prev;
		}
		Node next = curr.next;
		curr.next = prev;
		return reverse(next, curr);
		
	}
	
	
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
