package f_sorting;

import java.util.Arrays;

public class R_CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,4,1,0,1};
		countSort(arr, arr.length, 5);
		System.out.println(Arrays.toString(arr));
	
		int arr1[] = {1,4,4,1,0,1};
		countSort1(arr1, arr1.length, 5);
		System.out.println(Arrays.toString(arr1));

	}
	
	//Same Approach but for both objects and normal array 
	//O(n+k) time and O(n+k) space
	public static void countSort1(int arr[], int n, int k) {
		int count[] = new int[k];
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		for(int i=1; i<k;i++) {
			count[i] = count[i] + count[i-1];
		}
		
		int output[] = new int[n];
		for(int i=n-1; i>=0; i--) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0; i<n; i++) {
			arr[i] = output[i];
		}
	}
	
	
	//Naive Approach O(n+k) time iff k>n and k is order of n like k is 2n , 3n or n/2,etc
	//but this will fail for objects array as we are re-writing
	public static void countSort(int arr[], int n, int k){
		int count[] = new int[k];
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		int index = 0;
		for(int i=0; i<k; i++) {
			for(int j=0; j<count[i]; j++) {
				arr[index] = i;
				index++;
			}
		}
	}

}
