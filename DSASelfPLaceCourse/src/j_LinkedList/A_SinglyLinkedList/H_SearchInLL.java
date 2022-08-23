package j_LinkedList.A_SinglyLinkedList;

public class H_SearchInLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		printLL(head);
		
		System.out.println(search(head, 10)+" "+ search(head, 20)+" "+search(head, 30)+" "+search(head, 40)+" "+search(head, 100));
		System.out.println(searchRecursive(head, 10)+" "+ searchRecursive(head, 20)+" "+searchRecursive(head, 30)+" "+searchRecursive(head, 40)+" "+searchRecursive(head, 100));

	}
	
	//Iterative Approach O(n) time and O(1) space
	public static int search(Node head, int x) {
		int pos =1;
		Node curr = head;
		while(curr != null) {
			if(curr.data == x) {
				return pos;
			}else {
				curr = curr.next;
				pos++;
			}
		}
		return -1;
	}
	
	//recursive Approach O(n) time and O(n) space
	public static int searchRecursive(Node head, int x) {
		if(head == null) {
			return -1;
		}
		if(head.data == x) {
			return 1;
		}
		
		int pos = search(head.next, x);
		if(pos == -1) {
			return -1;
		}else {
			return pos+1;
		}
	}
	
	
	//utility function to print the linked list
	public static void printLL(Node head) {
		Node curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}
