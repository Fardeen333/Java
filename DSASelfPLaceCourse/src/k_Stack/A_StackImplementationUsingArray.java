package k_Stack;

public class A_StackImplementationUsingArray {

	public static void main(String[] args) {
		
		MyStack s = new MyStack(5);
		System.out.println(s.pop());
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.isEmpty());

	}

}

class MyStack{
	int cap;
	int arr[];
	int top;
	
	MyStack(int capacity){
		cap = capacity;
		arr = new int[cap];
		top = -1;
	}
	
	void push(int x) {
		if(top == cap-1) {
			System.out.println("Can't Insert");
			return;
		}
		top++;
		arr[top] = x;
	}
	
	int pop() {
		if(top == -1) {
			System.out.println("Cannot pop");
			return -1;
		}
		int x = arr[top];
		top--;
		return x;
	}
	
	int peek() {
		if(top == -1) {
			return -1;
		}
		return arr[top];
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
}
