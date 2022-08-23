package j_LinkedList;

import java.util.*;

public class L_DetectLoop {

	public static void main(String[] args) {
		//Method 3
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next = head.next.next;
		
		System.out.println(isLoop3(head));
		
		//Method 4
		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);
		head1.next.next.next.next = new Node(50);
		head1.next.next.next.next.next = new Node(60);
		head1.next.next.next.next.next = head1.next.next;
		System.out.println(isLoop4(head1));
		
		
		

	}
	//Method 3 
	//O(n) time and O(1) space but destroys the links of the Linked List
	public static boolean isLoop3(Node head) {
		Node curr = head;
		Node temp = new Node(50);
		while(curr != null) {
			if(curr.next == null) {
				return false;
			}
			if(curr.next == temp) {
				return true;
			}
			Node curr_next = curr.next;
			curr.next = temp;
			curr=curr_next;
		}
		return false;
	}
	
	//Method 4 
	//O(n) time and O(n) space
	public static boolean isLoop4(Node head) {
		HashSet<Node> s = new HashSet<>();
		for(Node curr=head; curr!=null; curr=curr.next) {
			if(s.contains(curr)) {
				return true;
			}
			s.add(curr);
		}
		return false;
	}
}
