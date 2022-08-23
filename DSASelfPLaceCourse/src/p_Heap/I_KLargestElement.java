package p_Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class I_KLargestElement {

	public static void main(String[] args) {
		
		int arr[] = {5,15,10,20,8};
		int brr[] = {8, 6, 4, 10, 9};
		kLargest(arr, arr.length, 2);
		kLargest(brr, brr.length, 3);
		
		int arr1[] = {5,15,10,20,8};
		int brr1[] = {8, 6, 4, 10, 9};
		kLargest1(arr1, arr1.length, 2);
		kLargest1(brr1, brr1.length, 3);
		
		int arr2[] = {5,15,10,20,8};
		int brr2[] = {8, 6, 4, 10, 9};
		kLargest2(arr2, arr2.length, 2);
		kLargest2(brr2, brr2.length, 3);
		
		

	}
	
	//NAive Approach
	//O(nlogn) + o(k) time and O(1) space
	public static void kLargest(int arr[], int n, int k) {
		Arrays.sort(arr);
//		for(int i=1; i<=k; i++) {
//			System.out.print(arr[n-i]+" ");
//		}
		for(int i=n-1; i>=n-k; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//Better Solution using Max Heap
	//O(n) + O(kLogn) time and O(n) space
	public static void kLargest1(int arr[], int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			pq.add(arr[i]);
		}
		for(int i=1; i<=k; i++) {
			System.out.print(pq.poll()+" ");
		}
		System.out.println();
	}
	
	//Efficient Solution using Min Heap
	//O(k) + O((n-k)logk) time and O(k) space
	public static void kLargest2(int arr[], int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(arr[i]);
		}
		for(int i=k; i<n; i++) {
			if(pq.peek()<arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq);
	}
}
