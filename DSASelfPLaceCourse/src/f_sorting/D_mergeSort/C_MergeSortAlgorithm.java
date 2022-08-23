package f_sorting.D_mergeSort;

import java.util.Arrays;

public class C_MergeSortAlgorithm {

	public static void main(String[] args) {
		int arr[] = {10,5,30,15,7};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void mergeSort(int arr[], int l, int r) {
		if(r>l) {           //checking whether the array has at least 2 elements or not
			int m = l + (r - l)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l,m,r);
			
		}
	}
	
	public static void merge(int arr[], int low, int mid, int high) {
		int n1 = mid -low + 1;
		int n2 = high - mid;
		int left[] = new int[n1];
		int right[] = new int [n2];
		for(int i=0; i<n1; i++) {
			left[i] = arr[low+i];
		}
		for(int i=0; i<n2; i++) {
			right[i] =arr[mid+1+i];
		}
		int i=0, j=0,k=low;
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				
			}else {
				arr[k] = right[j];
				j++;
				
			}
			k++;
		}
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
