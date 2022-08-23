package f_sorting.H_quickSort;

import java.util.Arrays;

public class A_NaivePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,13,6,9,12,11};
		partition(arr,0, arr.length-1, 1);
		System.out.println(Arrays.toString(arr));

	}
	//Naive Partition O(n) time and O(1) space
	public static void partition(int arr[], int l, int h, int p) {
		int temp[] = new int[h-l+1];
		int index = 0;
		for(int i=l; i<=h; i++) {
			if(arr[i] < arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		temp[index] = arr[p];
		index++;
		for(int i=l; i<=h; i++) {
			if(arr[i] > arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		for(int i=l; i<=h; i++) {
			arr[i] = temp[i];
		}
	}

}
