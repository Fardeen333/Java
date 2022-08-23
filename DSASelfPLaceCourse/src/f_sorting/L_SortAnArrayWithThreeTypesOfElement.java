package f_sorting;

import java.util.Arrays;

public class L_SortAnArrayWithThreeTypesOfElement {

	public static void main(String[] args) {
		int a[] = {0,1,1,2,0,1};
		sort(a, a.length);
		System.out.println(Arrays.toString(a));
		int a1[] = {0,1,1,2,0,1};
		sort1(a1, a1.length);
		System.out.println(Arrays.toString(a1));

	}
	
	//Naive Approach O(n) time but 4 traversal of the array and O(n) space
	public static void sort(int arr[], int n) {
		int temp[] = new int[n];
		int i = 0;
		for(int j=0; j<n; j++) {
			if(arr[j] == 0) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0; j<n; j++) {
			if(arr[j] == 1) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0; j<n; j++) {
			if(arr[j] == 2) {
				temp[i] = arr[j];
				i++;
			}
		}
		for(int j=0; j<n; j++) {
			arr[j] = temp[j];
		}
	}
	
	//Efficient Approach O(n) time with 1 iteration and O(1) space
	// Dutch National Flag Algorithm 
	public static void sort1(int arr[], int n) {
		int low = 0;
		int mid = 0;
		int high = n-1;
		while(mid <= high) {
			if(arr[mid] == 0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr, mid, high);
				high--;
			}
		}
		
	} 
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
