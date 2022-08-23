package j_LinkedList;

import java.util.*;

public class H_ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		
		printLL(head);
		head = reverse(head);
		printLL(head);
		
		System.out.println();
		
		//efficient approach
		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);
		head1.next.next.next.next = new Node(50);
		printLL(head1);
		head1 = reverse1(head1);
		printLL(head1);

	}
	
	//efficient Approach O(n) time and O(1) space with one iteration
	public static Node reverse1(Node head) {
		Node curr= head;
		Node prev = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	//Naive Approach O(n) time and O(n) space with 2 iteration
	public static Node reverse(Node head) {
		ArrayList<Integer> al = new ArrayList<>();
		for(Node curr=head; curr!=null; curr=curr.next) {
			al.add(curr.data);
		}
		for(Node curr=head; curr!=null; curr=curr.next) {
			curr.data = al.remove(al.size()-1);
		}
		return head;
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
