package p_Heap;

public class C_HeapifyAndExtarctMin {

	public static void main(String[] args) {
		A_ImplementMinHeap obj = new A_ImplementMinHeap(10);
		
		obj.insert(40);
		obj.insert(20);
		obj.insert(30);
		obj.insert(35);
		obj.insert(25);
		obj.insert(80);
		obj.insert(32);
		obj.insert(100);
		obj.insert(70);
		obj.insert(60);
		
		obj.print();
		
		
//		for viewing the working of minHeapify() function
//		swap(obj.arr, 3, 0);
//		swap(obj.arr, 3, 1);
//		swap(obj.arr, 3, 4);
//		obj.print();
		
		
		obj.minHeapify(0);
		obj.print();
		
		System.out.println(obj.extractMin());
		obj.print();
		
		
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
