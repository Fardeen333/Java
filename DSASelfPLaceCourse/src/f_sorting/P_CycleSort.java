package f_sorting;

import java.util.Arrays;

public class P_CycleSort {

	public static void main(String[] args) {
		int arr[] = {20,40,50,10,30};
		cycleSortDistinct(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		
		

	}
	
	public static void cycleSortDistinct(int arr[] ,int n) {
		for(int cs =0; cs<n-1; cs++) {
			int item = arr[cs];
			int pos = cs;             //pos hold the no. of elements smaller than the current element
			for(int i=cs+1; i<n; i++) {
				if(arr[i] < item) {
					pos++;
				}
			}
			swap(item, arr,pos);
			while(pos != cs) {
				pos = cs;
				for(int i=cs+1; i<n; i++) {
					if(arr[i] < item) {
						pos++;
					}
				}
				swap(item, arr, pos);
			}
		}
	}
	
	public static void swap(int item, int arr[], int i) {
		int temp = item;
		item = arr[i];
		arr[i] = temp;
	}

}
