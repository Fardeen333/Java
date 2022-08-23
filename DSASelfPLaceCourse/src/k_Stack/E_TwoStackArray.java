package k_Stack;

public class E_TwoStackArray {

	public static void main(String[] args) {
		TwoStackArray s = new TwoStackArray(6);
		s.push1(10);
		s.push1(20);
		s.push1(30);
		s.push1(40);
		System.out.println(s.pop2());
		System.out.println(s.pop1());
		
		System.out.println(s.size1());
		System.out.println(s.size2());
		
		System.out.println(s.isEmpty1());
		System.out.println(s.isEmpty2());

	}

}

class TwoStackArray{
	int cap;
	int arr[];
	int top1;
	int top2;
	
	public TwoStackArray(int cap) {
		this.cap = cap;
		arr= new int[cap];
		top1 = -1;
		top2 = cap;
	}
	
	void push1(int x) {
		if(top1 < top2-1) {
			top1++;
			arr[top1] = x;
		}else {
			System.out.println("Cannot Insert");
		}
	}
	
	void push2(int x) {
		if(top1 < top2-1) {
			top2--;
			arr[top2] = x;
		}else {
			System.out.println("Cannot insert");
		}
	}
	
	int pop1() {
		if(top1>=0) {
			int x = arr[top1];
			top1--;
			return x;
		}else {
			return -1;
		}
	}
	
	int pop2() {
		if(top2<cap) {
			int x = arr[top2];
			top2++;
			return x;
		}else {
			return -1;
		}
	}
	
	int size1() {
		return top1+1; 
	}
	
	int size2() {
		return cap-top2;
	}
	
	boolean isEmpty1() {
		return top1 == -1;
	}
	
	boolean isEmpty2() {
		return top2 == cap;
	}
}
