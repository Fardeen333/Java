package f_sorting;

import java.util.Arrays;

public class K_SortAnArrayWithTwoTypesOfElemments {

	public static void main(String[] args) {
		int arr[] = {15,-3,-2,18};
		sortingTwoTypesOfElements(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		int arr1[] = {15,-3,-2,18};
		sortingTwoTypesOfElements1(arr1, arr1.length);
		System.out.println(Arrays.toString(arr1));

	}
	
	
	//Naive Approach O(n) time with 3 iteration and O(n) space 
	public static void sortingTwoTypesOfElements(int arr[], int n) {
		int temp[] = new int[n];
		int i = 0;
		for(int j=0; j<n; j++) {
			if(arr[j] < 0) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0; j<n; j++) {
			if(arr[j] >= 0) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0; j<n; j++) {
			arr[j] =temp[j];
		}
	}
	
	//Efficient Approach O(n) time and O(1) space
	//Using Hoare's Partition
	public static void sortingTwoTypesOfElements1(int arr[], int n) {
		int i= -1;
		int j = n;
		while(true) {
			do{
				i++;
			}while(arr[i] < 0);
			do {
				j--;
			}while(arr[j] >= 0);
			if(i>=j) {
				return;
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
