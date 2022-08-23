package j_LinkedList.D_CircularDoublyLinkedList;

public class A_ImplementingCircularDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		head.prev = temp2;
		
		temp1.next = temp2;
		temp1.prev = head;
		
		temp2.prev = temp1;
		temp2.next = head;
		
		printCDLL(head);

	}

	//Method 1 Using for loop
		public static void printCDLL(Node head) {
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
