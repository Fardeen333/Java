package k_Stack;

public class B_StackImplementationUsingLinkedList {

	public static void main(String[] args) {
		MyStack1 obj =new MyStack1();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
	}

}

class MyStack1{
	Node head;
	int size;
	MyStack1(){
		head = null;
		size =0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return head==null;
	}
	void push(int x) {
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		size++;
	}
	int pop() {
		if(head == null) {
			return -1;
		}
		int x = head.data;
		head = head.next;
		size--;
		return x;
	}
	int peek() {
		if(head == null) {
			return -1;
		}
		return head.data;
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
