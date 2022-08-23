package f_sorting;

import java.util.Arrays;

public class B_SelectionSort {

	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));
		
		int b[] = {50,40,30,20,10};
		select(b, b.length);
		System.out.println(Arrays.toString(b));
	}
	
	//Naive Implementation
	public static void selectionSort(int arr[], int n) {
		int temp[] = new int[n];
		for(int i=0; i<n; i++) {
			int minIndex = 0;
			for(int j=1; j<n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp[i] = arr[minIndex];
			arr[minIndex] = Integer.MAX_VALUE;
		}
		for(int i=0; i<n; i++) {
			arr[i] = temp[i];
		}
	}
	
	//Efficient Approach
	public static void select(int arr[], int n) {
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

}
