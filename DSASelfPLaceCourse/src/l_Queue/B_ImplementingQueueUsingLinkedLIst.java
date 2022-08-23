package l_Queue;

public class B_ImplementingQueueUsingLinkedLIst {

	public static void main(String[] args) {
		
		QueueUsingLL q = new QueueUsingLL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.print(q.size+" ");
		System.out.print(q.getFront()+" ");
		System.out.print(q.getRear()+" ");
		System.out.println();
		q.deque();
		q.deque();
		System.out.print(q.size+" ");
		System.out.print(q.getFront()+" ");
		System.out.print(q.getRear()+" ");
		

	}

}

class QueueUsingLL{
	Node front;
	Node rear;
	int size;
	
	QueueUsingLL() {
		front = rear = null;
		size = 0;
	}
	
	void enqueue(int x) {
		Node temp = new Node(x);
		if(front == null) {
			front = rear = temp;
			size++;
			return;
		}
		rear.next = temp;
		rear = temp;
		size++;
	}
	
	void deque() {
		if(front==null) {
			return;
		}
		front = front.next;
		size--;
		if(front == null) {
			rear = null;
		}
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	int getFront() {
		return front.data;
	}
	int getRear() {
		return rear.data;
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
