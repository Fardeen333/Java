package f_sorting;

import java.util.Arrays;

public class Q_HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,15,50,4,20,9,54,3};
		heapSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void heapSort(int arr[], int n) {
		//Step 1 building the max heap
		buildHeap(arr, n); 
		//Step 2 swapping and heapifying
		for(int i =n-1; i>=0; i--) {
			swap(arr, 0, i);
			maxHeapify(arr, i, 0);
        }
	}
	
	//O(n) time
	public static void buildHeap(int arr[], int n) {
		for(int i = n/2-1; i>=0; i--) {
			maxHeapify(arr, n, i);
		}
	}
	
	public static void maxHeapify(int arr[], int n, int i) {
		int largest = i; 
		int left = 2 * i + 1; 
		int right = 2 * i + 2;
		
		if(left < n && arr[left] > arr[largest]) {
			largest = left;
		}
        
		if(right < n && arr[right] > arr[largest]) {
			largest = right;
		}
        
		if(largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, n, largest);
		}
        
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
