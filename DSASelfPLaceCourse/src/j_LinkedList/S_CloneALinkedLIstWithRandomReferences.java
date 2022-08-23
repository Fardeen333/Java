package j_LinkedList;

import java.util.*;

public class S_CloneALinkedLIstWithRandomReferences {

	public static void main(String[] args) {
		
		Node1 head = new Node1(10);
		head.next = new Node1(5);
		head.next.next = new Node1(20);
		head.next.next.next = new Node1(15);
		head.next.next.next.next = new Node1(20);
		
		head.random = head.next.next ;
		head.next.random = head.next.next.next;
		head.next.next.random = head;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head.next.next.next;
		
		printLL(head);
		head = clone(head);
		printLL(head);
		
		//Method 2 
		head = clone(head);
		printLL(head);
		

		

	}
	
	//Method 1 ; O(n) time and O(n) space
	public static Node1 clone(Node1 head) {
		HashMap<Node1, Node1> hm =new HashMap<>();
		Node1 curr = head;
		while(curr!= null) {
			Node1 copyNode = new Node1(curr.data);
			hm.put(curr, copyNode);
			curr = curr.next;
		}
		curr =head;
		while(curr!=null) {
			Node1 copyNode = hm.get(curr);
			copyNode.next = hm.get(curr.next);
			copyNode.random = hm.get(curr.random);
			curr =curr.next;
		}
		return hm.get(head);
	}
	
	//Method 2 : Trick Approach
	//O(n) time and O(1) space
	public static Node1 clone1(Node1 head) {
		//Adding duplicates nodes 
		for(Node1 curr=head; curr!=null;) {
			Node1 next = curr.next;
			curr.next = new Node1(curr.data);
			curr.next.next = next;
			curr=next;
		}
		//setting up the references for all duplicate nodes
		for(Node1 curr= head; curr!=null;) {
			curr.next.random = (curr.random != null)? curr.random.next : null;
		}
		head = head.next;
		Node1 curr= head;
		while(curr.next!= null && curr != null) {
			curr.next = curr.next.next;
			curr = curr.next.next;
		}
		curr.next = null;
		return head;
		
	}
	
	//printing the Linked List
	//O(n) time and O(1) space
	public static void printLL(Node1 head) {
		Node1 curr = head; 
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}

class Node1{
	int data;
	Node1 next;
	Node1 random;
	
	Node1(int data){
		this.data = data;
		next = null;
		random = null;
	}
}
