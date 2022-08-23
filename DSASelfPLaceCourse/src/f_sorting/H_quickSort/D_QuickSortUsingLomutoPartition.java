package f_sorting.H_quickSort;

import java.util.Arrays;

public class D_QuickSortUsingLomutoPartition {

	public static void main(String[] args) {
		int arr[] = {8,4,7,9,3,10,5};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void quickSort(int arr[] ,int l, int h) {
		if(l<h) {
			int p = lomutoPartition(arr, l, h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}
	}
	
	public static int lomutoPartition(int arr[] ,int l, int h) {
		int i = l-1;
		int pivot = arr[h];
		for(int j=l; j<=h-1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, h);
		return (i+1);
		
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
