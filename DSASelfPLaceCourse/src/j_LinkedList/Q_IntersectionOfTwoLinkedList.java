package j_LinkedList;

import java.util.*;

public class Q_IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
		
		Node head1 = new Node(5);
		head1.next = new Node(8);
		head1.next.next = new Node(7);
		head1.next.next.next = new Node(10);
		head1.next.next.next.next = new Node(12);
		head1.next.next.next.next.next = new Node(15);
		
		Node head2 = new Node(9);
		head2.next = head1.next.next.next;
		head2.next.next = head1.next.next.next.next;
		head2.next.next.next= head1.next.next.next.next.next;
		
		System.out.println(intersectionPoint(head1, head2));
		System.out.println(intersectionPoint1(head1, head2));
		
		

	}
	
	//Naive Approach O(m+n) time and O(m) space
	public static int intersectionPoint(Node head1, Node head2) {
		HashSet<Node> hs = new HashSet<>();
		Node curr1 = head1;
		while(curr1 != null) {
			hs.add(curr1);
			curr1 = curr1.next;
		}
		Node curr2 = head2;
		while(curr2 != null) {
			if(hs.contains(curr2)) {
				return curr2.data;
			}
			curr2= curr2.next;
			
		}
		return -1;
	}
	
	//efficient Approach O(n+m) time and O(1) space
	public static int intersectionPoint1(Node head1, Node head2) {
		int count1 = 0;
		int count2 = 0;
		Node curr1 = head1;
		Node curr2 = head2;
		for(Node curr=head1; curr!=null; curr=curr.next) {
			count1++;
		}
		for(Node curr=head2; curr!=null; curr=curr.next) {
			count2++;
		}
		int times = Math.abs(count1-count2);
		for(int i=0; i<times; i++) {
			curr1 = curr1.next;
		}
		while(curr1 != null && curr2!=null) {
			if(curr1==curr2) {
				return curr1.data;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
			
		}
		return -1;
	}
	
	//printing the Linked List
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
