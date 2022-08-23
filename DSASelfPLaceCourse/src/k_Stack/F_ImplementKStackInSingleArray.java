package k_Stack;

public class F_ImplementKStackInSingleArray {

	public static void main(String[] args) {
		
		KStack s = new KStack(3,6);
		s.push(10, 0);
		s.push(20, 0);
		s.push(30, 0);
		s.push(40, 0);
		
		s.push(100, 2);
		
		System.out.println(s.pop(0));
		System.out.println(s.pop(1));
		System.out.println(s.pop(2));
		
	}

}

class KStack{
	int cap;
	int arr[];
	int next[];
	int top[];
	int k;
	int freetop;
	
	KStack(int k1, int capacity){
		cap = capacity;
		k = k1;
		arr = new int[cap];
		next = new int[cap];
	     	top = new int[k];
		freetop = 0;
		
		for(int i=0; i<k; i++) {
			top[i] = -1;
		}
		for(int i=0; i<cap; i++) {
			next[i] = i+1;
		}
		next[cap-1] = -1;
	}
	
	void push(int data, int sn) {		
		if(freetop == -1) {
			System.out.println("Stack Overflow");
			return;
		}
		int i = freetop;
		arr[i] = data;
		freetop = next[i];
		next[i] = top[sn];
		top[sn] = i;
	}
	
	int pop(int sn) {
		if(top[sn]==-1) {
			System.out.println("Stack underflow");
			return -1;
		}
		int i = top[sn];
		top[sn] = next[i];
		next[i] = freetop;
		freetop = i;
		return arr[i];
				
	}
}
