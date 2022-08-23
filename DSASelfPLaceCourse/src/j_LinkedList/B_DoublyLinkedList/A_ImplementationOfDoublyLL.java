package j_LinkedList.B_DoublyLinkedList;

public class A_ImplementationOfDoublyLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		temp1.next = temp2;

		temp1.prev = head;
		temp2.prev = temp1;
		
		printDLL(head);
		
		
	}
	
	public static void printDLL(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}

class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int data){
		this.data= data;
		next = null; 
		prev = null;
	}
}
