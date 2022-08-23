package j_LinkedList;

public class G_NthNodeFromLastInSLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		nthNodeFromLast(head, 1);
		nthNodeFromLast(head, 2);
		nthNodeFromLast(head, 3);
		
		
		nthNodeFromLast1(head, 1);
		nthNodeFromLast1(head, 2);
		nthNodeFromLast1(head, 3);
		
	}
	//Method 1 using length of the list
	//O(n) time and O(1) space
	public static void nthNodeFromLast(Node head, int n) {
		int len = 0 ;
		for(Node curr=head; curr!=null; curr= curr.next) {
			len++;
		}
		if(len<n) {
			return;
		}
		Node curr=head;
		for(int i=0; i<len-n; i++) {
			curr= curr.next;
		}
		System.out.println(curr.data);
	}
	
	//Method 2 using 2 extra references
	//O(n) time and O(1) space
	public static void nthNodeFromLast1(Node head, int n) {
		Node first = head;
		for(int i=0; i<n; i++) {
			
			if(first == null) {
				return;
			}
			first= first.next;
		}
		Node second = head;
		while(first != null) {
			first =first.next;
			second = second.next;
		}
		System.out.println(second.data);
	}

}
