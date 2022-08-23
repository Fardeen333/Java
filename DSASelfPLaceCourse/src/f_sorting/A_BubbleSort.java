package f_sorting;

import java.util.Arrays;

public class A_BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		int brr[] = {10,20,30,40,50};
		bubbleSort(brr,brr.length);
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));

	}
	
	public static void bubbleSort(int arr[], int n) {
		for(int i =0; i<n-1; i++) {
			boolean isSorted = false;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = true;
				}
			}
			if(!isSorted) {
				break;
			}
		}
	}

}
