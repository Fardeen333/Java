package p_Heap;

import java.util.Arrays;

public class Ka_mergeKSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		int brr[] = {2,4,6,8,10};
		int crr[] = {3,6,9,12,15};
		int matrix[][] = {arr, brr, crr};
		int res[] = new int[arr.length*3];
		mergeKSoretd(matrix, 0, 2, res);
		System.out.println(Arrays.toString(res));
	}
	
	public static void mergeKSoretd(int matrix[][], int l, int r, int output[]) {
		if(l>=r) {
			for(int i=0; i<matrix.length; i++) {
				output[i] = matrix[l][i];
			}
			return;
			
		}
		int mid =(l+r)/2;
		int out1[] = new int[(mid-l+1)*matrix[0].length];
		int out2[] = new int[(r-mid) * matrix[0].length];
		mergeKSoretd(matrix, l, mid, out1);
		mergeKSoretd(matrix, mid+1, r, out2);
		merge(out1, out2, out1.length, out2.length, output);
	}
	
	public static void merge(int arr[], int brr[], int n1, int n2, int res[]) {
		int i=0;
		int j=0;
		int k=0;
		while(i<n1 && j<n2) {
			if(arr[i] < brr[j]) {
				res[k] = arr[i];
				k++; i++;
			}else {
				res[k] = brr[j];
				k++; j++;
			}
		}
		while(i<n1) {
			res[k] = arr[i];
			k++; i++;
		}
		while(j < n2) {
			res[k] = brr[j];
			k++; j++;
		}
	}

}
