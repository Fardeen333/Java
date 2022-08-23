package f_sorting.D_mergeSort;

import java.util.Arrays;

public class B_MergeFunctionOfMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,40,20,30};
		merge(arr,0,2,4);
		System.out.println(Arrays.toString(arr));

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
		int i=0, j=0,k=0;
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			}else {
				arr[k] = right[j];
				j++;
				k++;
			}
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
