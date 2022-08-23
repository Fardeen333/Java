package f_sorting;

import java.util.Arrays;

public class S_RadixSort {

	public static void main(String[] args) {
		int arr[]  = {319,212,6,8,100,50};
		radixSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	// O(d * (n+b)) time and O(n+b) space where d is max digits and b is 10
	public static void radixSort(int arr[], int n) {
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int exp =1; max/exp > 0; exp*=10) {
			countingSort(arr, n, exp);
		}
		
	}

	private static void countingSort(int[] arr, int n, int exp) {
		int count[] = new int[10];
		for(int i=0; i<10; i++) {
			count[i] = 0;
		}
		for(int i=0;i<n; i++) {
			count[(arr[i]/exp)%10]++;
		}
		for(int i=1; i<10; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		int output[] = new int[n];
		for(int i=n-1; i>=0; i--) {
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = output[i];
		}
		
	}

}
