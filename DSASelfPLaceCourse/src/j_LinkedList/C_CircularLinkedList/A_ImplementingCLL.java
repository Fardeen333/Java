package j_LinkedList.C_CircularLinkedList;

public class A_ImplementingCLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = head; 
		
	}

}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
