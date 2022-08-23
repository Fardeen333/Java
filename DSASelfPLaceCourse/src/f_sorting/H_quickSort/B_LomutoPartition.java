package f_sorting.H_quickSort;

import java.util.Arrays;

public class B_LomutoPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,80,30,90,40,50,70};
		System.out.println(lomutoPartition(arr, 0, arr.length-1));

	}
	//General Lomuto ALgorithm wherein we are assuming the pivot element to be the last element of the array
	//but in case of user provided pivot index, what we can do is swap the pivot with the last element and we can then apply the general lomuto algorithm
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
		System.out.println(Arrays.toString(arr));
		return i+1;
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
