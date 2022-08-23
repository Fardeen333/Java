package j_LinkedList;

public class M_FloydLoopDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next = head.next.next;
		
		System.out.println(isLoop(head));

	}
	//O(n) time and O(1) space
	public static boolean isLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null) {
			fast = fast.next;
			if(fast != null) {
				fast = fast.next;
				slow = slow.next;
			}
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
}
