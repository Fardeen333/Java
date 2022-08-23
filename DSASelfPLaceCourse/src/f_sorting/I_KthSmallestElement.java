package f_sorting;

import java.util.Arrays;

public class I_KthSmallestElement {

	public static void main(String[] args) {
		
		int arr[] = {10,4,5,8,11,6,26};
		System.out.println(smallest(arr, arr.length, 5));
		int arr1[] = {10,4,5,8,11,6,26};
		System.out.println(smallest1(arr1, arr1.length, 5));

	}
	
	//Naive Approach O(nlogn) time and O(1) space
	public static int smallest(int arr[],int n, int k) {
		if(k>n) {
			return 0;
		}
		Arrays.sort(arr);
		return arr[k-1];
		
	}
	
	//Efficient Approach O(n^2) in worst case and O(n) in average case and O(1) space
	//QuickSelect Algorithm
	public static int smallest1(int arr[], int n, int k) {
		int l = 0;
		int h = n-1;
		
		while(l<=h) {
			int p = lomutoPartition(arr, l, h);
			if(p == k-1) {
				return arr[p];
			}else if(p > k-1) {
				h = p-1;
			}else {
				l = p+1;
			}
		}
		return 0;
	}
	
	public static int lomutoPartition(int arr[], int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		for(int j=l; j<h; j++) { //since we are considering the last element as the pivot
			if(arr[j] < pivot) {
				i++;
				swap(arr, i,j);
			}
		}
		swap(arr, i+1, h);
		return i+1;
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
