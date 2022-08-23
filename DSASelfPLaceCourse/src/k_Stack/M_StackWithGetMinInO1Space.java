package k_Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class M_StackWithGetMinInO1Space {

	public static void main(String[] args) {
		
		//stack with getMin() int O(1) but only for positive numbers
		Stack1 s = new Stack1();
		s.push(5);
		s.push(10);
		s.push(20);
		s.push(2);
		s.push(6);
		s.push(4);
		System.out.print(s.pop()+" ");
		System.out.print(s.getMin()+" ");
		System.out.print(s.pop()+" ");
		System.out.print(s.getMin()+" ");
		System.out.print(s.pop()+" ");
		System.out.print(s.getMin()+" ");
		System.out.print(s.pop()+" ");
		System.out.print(s.getMin()+" ");
		
		System.out.println();
		
		//stack with getMin() in O(1) for all types of numbers
		Stack2 s1 = new Stack2();
		s1.push(5);
		s1.push(10);
		s1.push(20);
		s1.push(2);
		s1.push(6);
		s1.push(4);
		System.out.print(s1.pop()+" ");
		System.out.print(s1.getMin()+" ");
		System.out.print(s1.pop()+" ");
		System.out.print(s1.getMin()+" ");
		System.out.print(s1.pop()+" ");
		System.out.print(s1.getMin()+" ");
		System.out.print(s1.pop()+" ");
		System.out.print(s1.getMin()+" ");
		
		
	}

}
//Only for positives
class Stack1{
	Deque<Integer> s ;
	int min;
	
	Stack1(){
		s = new ArrayDeque<>();
		min = 0;
	}
	
	void push(int x) {
		if(s.isEmpty()) {
			s.push(x);
			min = x;
		}else if(x<=min) {
			s.push(x-min);
			min = x;
		}else {
			s.push(x);
		}
	}
	
	int getMin() {
		return min;
	}
	
	int peek() {
		if(s.peek() >= 0) {
			return min;
		}
		return s.peek();
	}
	
	int pop() {
		int t = s.pop();
		if(t<=0) {
			int res = min;
			min = min - t;
			return res;
		}else {
			return t;
		}
	}
}

//for all kind of numbers
class Stack2{
	Deque<Integer> s ;
	int min;
	
	Stack2(){
		s = new ArrayDeque<>();
		min = 0;
	}
	
	void push(int x) {
		if(s.isEmpty()) {
			s.push(x);
			min = x;
		}else if(x<=min) {
			s.push(2*x-min);
			min = x;
		}else {
			s.push(x);
		}
	}
	
	int getMin() {
		return min;
	}
	
	int peek() {
		if(s.peek() <= min) {
			return min;
		}
		return s.peek();
	}
	
	int pop() {
		int t = s.pop();
		if(t<=min) {
			int res = min;
			min = 2*min - t;
			return res;
		}else {
			return t;
		}
	}
}
