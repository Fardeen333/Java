package f_sorting.D_mergeSort;

import java.util.Arrays;

public class A_mergeTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {10,15,20};
		int b[] = {5,6,6,15};
		merge(a,b,a.length,b.length);
		
		merge1(a,b,a.length,b.length);

	}
	//Naive Approach O((n+m)log(n+m) time and O(n+m) space)
	public static void merge(int arr[], int brr[], int n, int m) {
		int temp[] = new int[n+m];
		for(int i =0; i<n; i++) {
			temp[i] =arr[i];
		}
		
		for(int i=0; i<m; i++) {
			temp[n+i] = brr[i];
		}
		
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
	}
	
	//Efficient Approach O(n+m) time and O(1) space
	public static void merge1(int arr[], int brr[], int n, int m) {
		int i=0;
		int j =0;
		while(i<n && j<m) {
			if(arr[i] <= brr[j]) {
				System.out.print(arr[i]+" ");
				i++;
			}else {
				System.out.print(brr[j] +" ");
				j++;
			}
		}
		while(i<n) {
			System.out.print(arr[i]+" ");
			i++;
		}
		while(j<m) {
			System.out.print(brr[j]+" ");
			j++;
		}
	}

}
