package j_LinkedList;

import java.util.*;

public class U_PalindromeLinkedList {

	public static void main(String[] args) {
		//1st list
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		// 2nd list
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(3);
		head1.next.next.next.next = new Node(2);
		head1.next.next.next.next.next = new Node(1);
		// 3nd list
		Node head2 = new Node(1);
		head2.next = new Node(2);
		head2.next.next = new Node(3);
		head2.next.next.next = new Node(4);
		head2.next.next.next.next = new Node(2);
		head2.next.next.next.next.next = new Node(1);
		
		System.out.println(isPalindrome(head) +" "+ isPalindrome(head1)+" "+isPalindrome(head2));
		System.out.println(isPal(head) +" "+ isPal(head1)+" "+isPal(head2));
		

	}
	
	//Naive Approach O(n) time and O(n) space
	public static boolean isPalindrome(Node head) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for(Node curr=head; curr!=null; curr=curr.next) {
			stack.push(curr.data);
		}
		for(Node curr=head; curr!=null; curr=curr.next) {
			if(stack.pop() != curr.data) {
				return false;
			}
		}
		return true;
	}
	
	//Efficient Approach O(n) time and O(1) space
	public static boolean isPal(Node head) {
		if(head==null || head.next == null) return true;
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow= slow.next;
			fast = fast.next.next;
		}
		Node revHead = reverse1(slow.next);
		Node curr = head;
		while(revHead != null) {
			if(revHead.data != curr.data) {
				return false;
			}
			revHead = revHead.next;
			curr = curr.next;
		}
		return true;
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
}
