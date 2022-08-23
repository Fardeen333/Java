package m_Deque;

//import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class E_DataStructureWithMinMaxOpearation {

	public static void main(String[] args) {
		MyDS ds = new MyDS();
		ds.insertMin(5);
		ds.insertMax(10);
		ds.insertMin(3);
		ds.insertMax(15);
		ds.insertMin(2);
		System.out.println(ds.getMin());
		System.out.println(ds.getMax());
		ds.insertMin(1);
		System.out.println(ds.getMin());
		ds.insertMax(20);
		System.out.println(ds.getMax());
	}

}

class MyDS{
	Deque<Integer> dq;
	
	MyDS(){
		dq = new LinkedList<>();
	}
	
	void insertMin(int x) {
		dq.offerFirst(x);
	}
	
	void insertMax(int x) {
		dq.offerLast(x);
	}
	
	int getMin() {
		return dq.peekFirst();
	}
	
	int getMax() {
		return dq.peekLast();
	}
	
	int extractMin() {
		return dq.pollFirst();
	}
	
	int extractMax() {
		return dq.pollLast();
	}
	
}
