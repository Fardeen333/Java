package p_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class G_SortKSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,7,18,19,17};
		kSorted(arr, arr.length, 2);
		System.out.println(Arrays.toString(arr));
		
		int arr1[] = {9,8,7,18,19,17};
		kSorted1(arr1, arr1.length, 2);
		System.out.println(Arrays.toString(arr1));
		
		int brr[] = {10,9,7,8,4,70,50,60};
		kSorted(brr, brr.length, 4);
		System.out.println(Arrays.toString(brr));
		
		

	}
	
	//Naive Approach O(nlogn) time and O(1) space
	public static void kSorted(int arr[], int n, int k) {
		Arrays.sort(arr);
	}
	
	//Efficient Approach 
	//O(klogk) time + O((n-k-1)logk) time + O(klogk) time = O(nlogk) time
	//O(k) space
	public static void kSorted1(int arr[], int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<=k; i++) {   //O(klogk) time 
			pq.add(arr[i]);
		}
		int index = 0;
		for(int i=k+1; i<n; i++) {   //O((n-k-1)logk) time
			arr[index++] = pq.poll();
			pq.add(arr[i]);
		}
		while(!pq.isEmpty()) {     //O(klogk) time
			arr[index++] = pq.poll();
		}
	}

}
