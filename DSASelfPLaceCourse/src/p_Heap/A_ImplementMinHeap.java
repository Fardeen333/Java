package p_Heap;

import java.util.Arrays;

public class A_ImplementMinHeap {
	
	int arr[];
	int size;
	int cap;
	
	public A_ImplementMinHeap(int c) {
		arr = new int[c];
		cap = c;
		size = 0;
	}
	
	public int leftChild(int i) {
		return 2*i+1;
	}
	
	public  int rightChild(int i) {
		return 2 * i + 2;
	}
	
	public int parent(int i) {
		return (int)Math.floor((i-1)/2);
	}
	
//	public void insert(int x) {
//		if(size == cap) {
//			return;
//		}
//		size++;
//		arr[size - 1] = x;
//		for(int i=size-1; i>=0 && arr[parent(i)] > arr[i]; ) {
//			int temp = arr[parent(i)];
//			arr[parent(i)] = arr[i];
//			arr[i] = temp;
//			
//			i = parent(i);
//		}
//	}
	
	
	//O(log(size)) time as we are traversing along the height of the tree and the height of the tree is log(n) 
	public void insert(int x) {
		if(size == cap) {
			return;
		}
		size++;
		arr[size-1] = x;
		int i = size-1;
		while(i!=0 && (arr[parent(i)] > arr[i])) {
			int temp = arr[parent(i)];
			arr[parent(i)] = arr[i];
			arr[i] = temp;
			
			i = parent(i);
		}
	}
	
	
	//o(height) and height = logn
	//O(logn) time and O(logn) space for recursion stack
	public void minHeapify(int i) {
		int left = leftChild(i);
		int right = rightChild(i);
		int smallest = i;
		if(left < size && arr[left] < arr[i]) {
			smallest = left;
		}
		if(right < size && arr[right] < arr[smallest]) {
			smallest = right;
		}
		if(i != smallest) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeapify(smallest);
		}
	}
	
	
	//O(logn) time same as minHeapify() and O(logn) or O(1) space depending whether minHeapify is recursive or iterative
	public int extractMin() {
		if(size == 0) {
			return Integer.MAX_VALUE;
		}
		if(size == 1) {
			size--;
			return arr[0];
		}
		//swap arr[0] and arr[size-1]
		int temp = arr[0];
		arr[0] = arr[size-1];
		arr[size-1] = temp;
		size--;
		minHeapify(0);
		return arr[size];
	}
	
	//O(h) == O(logn) time and O(1) space
	public void decreaseKey(int i, int x) {
		arr[i] = x;
		while(i!=0 && arr[parent(i)] > arr[i]) {
//			swap arr[i] , arr[parent(i)]
			int temp = arr[parent(i)];
			arr[parent(i)] = arr[i];
			arr[i] = temp;
			
			i = parent(i);
 		}
	}
	
	//O(logn) time and O(1)/O(logn) space
	public void delete(int i) {
		decreaseKey(i, Integer.MIN_VALUE);
		extractMin();
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	
	
	//O(n) time and O(logn) space
	void buildHeap() {
		for(int i=(size-2)/2; i>=0; i--) {
			minHeapify(i);
		}
	}

}
