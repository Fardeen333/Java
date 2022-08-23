package f_sorting;

import java.util.Arrays;

public class C_InsertionSort {

	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		insertionSort(a, a.length);
		System.out.println(Arrays.toString(a));

	}
	
	public static void insertionSort(int arr[], int n) {
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
