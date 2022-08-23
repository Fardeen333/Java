package j_LinkedList.A_SinglyLinkedList;

public class C_InsertAtBeginningInSinglyLL {

	public static void main(String[] args) {
		Node2 head = null;
		head = insertBegin(head, 10);
		head = insertBegin(head, 500);
		head = insertBegin(head, 40);
		
		printLL(head);

	}
	
	//O(1) time and O(1) space
	public static Node2 insertBegin(Node2 head, int x) {
		Node2 temp = new Node2(x);
		temp.next = head;
		return temp;
	}
	
	//O(n) time and O(1) space
	public static void printLL(Node2 head) {
		Node2 curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}

class Node2{
	int data;
	Node2 next;
	
	Node2(int data){
		this.data = data;
		next = null;
	}
}
