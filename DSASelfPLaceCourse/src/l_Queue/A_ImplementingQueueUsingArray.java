package l_Queue;

public class A_ImplementingQueueUsingArray {

	public static void main(String[] args) {
		
		//Naive Approach using Linear array
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.print(q.size+" ");
		System.out.print(q.getFront()+" ");
		System.out.print(q.getRear()+" ");
		q.dequeue();
		System.out.print(q.size+" ");
		System.out.print(q.getFront()+" ");
		System.out.print(q.getRear()+" ");
		
		System.out.println();
		
		//Efficient Approach using Circular array
		Queue1 q1 = new Queue1(3);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.dequeue();
		q1.dequeue();
		q1.enqueue(40);
		q1.dequeue();
		System.out.print(q1.size+" ");
		System.out.print(q1.getFront()+" ");
		System.out.print(q1.getRear()+" ");
	}

}

//Naive Approach
//All functions are O(1) except for dequeue() which is O(n)
class Queue{
	int arr[];
	int cap;
	int size;
	
	Queue(int cap){
		this.cap = cap;
		arr = new int[cap];
		size = 0;
	}
	//O(1)
	boolean isFull() {
		return size == cap;
	}
	
	//O(1)
	boolean isEmpty() {
		return size == 0;
	}
	
	//O(1)
	void enqueue(int x) {
		if(isFull()) {
			return;
		}
		arr[size] = x;
		size++;
	}
	
	//O(n)
	void dequeue() {
		 if(isEmpty()) {
			 return;
		 }
		 for(int i=0; i<size-1; i++) {
			 arr[i] = arr[i+1];
		 }
		 size--;
	}
	//O(1)
	int getFront() {
		 if(isEmpty()) {
			 return -1;
		 }
		 return 0;
	}
	//O(1)
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return size-1;
	}
}

//Efficient Approach Using Circular Array
//All operation in O(1) time
class Queue1{
	int arr[];
	int cap;
	int size;
	int front;
	
	Queue1(int cap){
		this.cap = cap;
		arr = new int[cap];
		size = 0;
		front = 0;
	}
	
	//O(1)
	boolean isFull() {
		return size == cap;
	}
	
	//O(1)
	boolean isEmpty() {
		return size == 0;
	}
	
	//O(1)
	int getFront() {
		 if(isEmpty()) {
			 return -1;
		 }
		 return front;
	}
	//O(1)
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
//		if((front+size-1)==-1) {
//			return -1;
//		}
		return (front+size-1)%cap;
	}
	
	//O(1)
	void enqueue(int x) {
		if(isFull()) {
			return;
		}
		int rear = getRear();
		rear = (rear+1)%cap;
		arr[rear] = x;
		size++;
	}
	
	//O(1) 
	void dequeue() {
		if(isEmpty()) {
			return;
		}
		front = (front+1)%cap;
		size--;
	}

	
}