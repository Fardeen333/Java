package p_Heap;

import java.util.Arrays;

public class E_HeapSort {

	public static void main(String[] args) {
		
		
		int arr[] = {10,15,50,4,20};
//		System.out.println(Arrays.toString(arr));
		heapSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	//O(nlogn) time and O(logn) space
	public static void heapSort(int arr[], int n) {
		buildHeap(arr, n);
		for(int i=n-1; i>=1; i--) {
			//swap arr[i], arr[0]
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			maxHeapify(arr, i, 0);
		}
	}
	
	
	
//	O(nlogn) time and O(logn) space
	public static void buildHeap(int arr[], int n) {
		for(int i= (n-2)/2; i>=0; i--) {
			maxHeapify(arr, n, i);
		}
	}
	
//	O(logn) time and O(logn) space
	public static void maxHeapify(int arr[], int n, int i) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left < n && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		if(largest != i) {
			//swap(arr[i], arr[largest])
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(arr, n, largest);
		}
	}

}
