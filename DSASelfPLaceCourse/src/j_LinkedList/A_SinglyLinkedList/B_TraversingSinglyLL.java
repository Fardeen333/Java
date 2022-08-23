package j_LinkedList.A_SinglyLinkedList;

public class B_TraversingSinglyLL {

	public static void main(String[] args) {
		
		Node1 head = new Node1(10);
		head.next = new Node1(20);
		head.next.next = new Node1(30);
		head.next.next.next = new Node1(40);
		
		printLL(head);
		recursivePrintLL(head);
		
		

	}
	//O(n) time and O(1) space
	public static void printLL(Node1 head) {
		Node1 curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	//O(n) time and O(n) space for stack
	public static void recursivePrintLL(Node1 head) {
		if(head == null){
			return;
		}
		System.out.print(head.data+" ");
		recursivePrintLL(head.next);
	}

}

class Node1{
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
		next = null;
	}
}
