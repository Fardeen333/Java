package m_Deque;

import java.util.ArrayDeque;

public class F_MaximumInSubArrayOfSizeK {

	public static void main(String[] args) {
		
		int arr[] = {10,8,5,12,15,7,6};
		maximum(arr, arr.length, 3);
		maximum1(arr, arr.length, 3);
		
		int brr[] = {20,40,30,10,60};
		maximum1(brr, brr.length, 3);

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static void maximum(int arr[], int n, int k) {
		for(int i=0; i<n-(k-1); i++) {
			int max = arr[i];
			for(int j=i+1; j<i+k; j++) {
				max = Math.max(max, arr[j]);
			}
			System.out.print(max+" ");
		}
		System.out.println();
	}
	
	
	//Efficient Approach O(n) time and O(n) space
	public static void maximum1(int arr[], int n, int k) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		for(int i=0; i<k; i++) {
			while(!ad.isEmpty() && arr[i]>=arr[ad.peekLast()]) {
				ad.removeLast();
			}
			ad.addLast(i);
		}
		for(int i=k; i<n; i++) {
			System.out.print(arr[ad.peekFirst()]+" ");
			while(!ad.isEmpty() && ad.peekFirst()<=(i-k)) {
				ad.removeFirst();
			}
			while(!ad.isEmpty() && arr[i]>=arr[ad.peekLast()]) {
				ad.removeLast();
			}
			ad.addLast(i);
		}
		
		System.out.print(arr[ad.peekFirst()]+" ");
		System.out.println();
		
	}
	

}
