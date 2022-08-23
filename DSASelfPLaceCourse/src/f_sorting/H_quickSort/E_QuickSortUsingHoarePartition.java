package f_sorting.H_quickSort;

import java.util.Arrays;

public class E_QuickSortUsingHoarePartition {

	public static void main(String[] args) {
		int arr[] = {8,4,7,9,3,10,5};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void quickSort(int arr[] ,int l, int h) {
		if(l<h) {
			int p = hoarePartition(arr, l, h);
			quickSort(arr, l, p);
			quickSort(arr, p+1, h);
		}
	}
	
	public static int hoarePartition(int arr[] ,int l, int h) {
		int i = l-1;
		int j = h+1;
		int pivot = arr[l];
		while(true) {
			do {
				i++;
			}while(arr[i] < pivot);
			
			do {
				j--;
			}while(arr[j] > pivot);
			if(i>=j) {
				return j;
			}
			swap(arr,i,j);
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
