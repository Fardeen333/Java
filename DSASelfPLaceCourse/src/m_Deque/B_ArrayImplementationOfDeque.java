package m_Deque;

public class B_ArrayImplementationOfDeque {

	public static void main(String[] args) {
		Deque1 dq = new Deque1(4);
		
		dq.insertFront(10);
		System.out.println(dq.getFront()+" "+dq.getRear());
		
		dq.insertRear(20);
		System.out.println(dq.getFront()+" "+dq.getRear());
		
		dq.insertRear(30);
		System.out.println(dq.getFront()+" "+dq.getRear());
		
		dq.deleteFront();
		System.out.println(dq.getFront()+" "+dq.getRear());
		
		dq.deleteRear();
		System.out.println(dq.getFront()+" "+dq.getRear());


	}

}

//Efficient Implementation
//Using the concept of circular array
//all operations are O(1)
class Deque1{
	int arr[];
	int cap;
	int size;
	int front;
	
	public Deque1(int cap) {
		this.cap = cap;
		arr = new int[cap];
		size = 0;
		front = 0;  
	}
	
	boolean isFull() {
		return size == cap;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return front;
	}
	
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return (front+size-1)%cap;
	}
	
	void deleteFront() {
		if(isEmpty()) {
			return;
		}
		front = (front+1)%cap;
		size--;
	}
	
	void insertFront(int x) {
		if(isFull()) {
			return;
		}
		front = (front-1+cap)%cap;
		arr[front] = x;
		size++;
		
	}
	
	void insertRear(int x) {
		if(isFull()) {
			return;
		}
		int rear = (front+size-1)%cap;
		rear = (rear+1)%cap;
		arr[rear] = x;
		size++;
	}
	
	void deleteRear() {
		if(isEmpty()) {
			return;
		}
		size--;
	}
}