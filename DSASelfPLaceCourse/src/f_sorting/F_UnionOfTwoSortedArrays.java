package f_sorting;

import java.util.Arrays;

public class F_UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {2,10,20,20};
		int b[] = {3,20,40,40,40,40};
		union(a,b,a.length, b.length);
		union1(a,b,a.length, b.length);

	}
	
	//Naive Approach O((m+n)log(m+n)) time and O(n+m) space
	public static void union(int arr[], int brr[], int m, int n) {
		int temp[] = new int[n+m];
		for(int i=0; i<m; i++) {
			temp[i] = arr[i];
		}
		for(int i=0; i<n; i++) {
			temp[m+i] = brr[i];
		}
		Arrays.sort(temp);
		for(int i=0; i<(m+n); i++) {
			if(i==0 || temp[i] != temp[i-1]) {
				System.out.print(temp[i]+" ");
			}
		}
		System.out.println();
	}
	
	//Efficient Approach O(m+n) time and O(1) space
	public static void union1(int arr[], int brr[] , int m,int n) {
		int i=0; int j=0;
		while(i<m && j<n) {
			if(i>0 && arr[i]==arr[i-1]) {i++; continue;}
			if(j>0 && brr[j]==brr[j-1]) {j++; continue;}
			if(arr[i] < brr[j]) {
				System.out.print(arr[i]+" ");
				i++;
			}else if(arr[i] > brr[j]) {
				System.out.print(brr[j] +" ");
				j++;
			}else {
				System.out.print(arr[i]+" ");       // or System.out.println(brr[j]);
				i++;
				j++;
			}
		}
		while(i<m) {
			if(i>0 && arr[i] != arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
			i++;
		}
		while(j<n) {
			if(j>0 && brr[j] != brr[j-1]) {
				System.out.print(brr[j]+" ");
			}
			j++;
		}
	} 
}
