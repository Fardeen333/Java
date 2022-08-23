package m_Deque;

public class A_ArrayImplementationOfDeque {

	public static void main(String[] args) {
		
		Deque dq = new Deque(5);
		dq.insertRear(10);
		dq.insertFront(20);
		dq.insertRear(30);
		dq.insertFront(40);
		System.out.println(dq.getFront());
		System.out.println(dq.getRear());
		dq.deleteFront();
		dq.deleteRear();
		System.out.println(dq.getFront());
		System.out.println(dq.getRear());
		

	}

}

//Simple Implementation
//Front is maintained at 0 and rear at size-1
//all operations are O(1) except for insertFront() and DeleteFront()
class Deque{
	int arr[];
	int cap;
	int size;
	
	Deque(int cap){
		this.cap = cap;
		size = 0;
		arr = new int[cap];
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
		return 0;
	}
	
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return size-1;
	}
	
	void insertRear(int x) {
		if(isFull()) {
			return;
		}
		arr[size] = x;
		size++;
	}
	
	void deleteRear() {
		if(isEmpty()) {
			return;
		}
		size--;
	}
	
	void insertFront(int x) {
		if(isFull()) {
			return;
		}
		for(int i=size-1; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = x;
		size++;
	}
	
	void deleteFront() {
		if(isEmpty()) {
			return;
		}
		for(int i=0; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}
}
