package p_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class H_PurchasingMaximumItem {

	public static void main(String[] args) {
		int arr[] = {1,12,5,111,200};
		int brr[] = {20,10,5,30,100};
		
		System.out.println(maxItem(arr, arr.length, 10));
		System.out.println(maxItem(brr, brr.length, 35));
		
		int arr1[] = {1,12,5,111,200};
		int brr1[] = {20,10,5,30,100};
		
		System.out.println(maxItem1(arr1, arr1.length, 10));
		System.out.println(maxItem1(brr1, brr1.length, 35));

	}
	
	//Naive Approach O(nlogn) time and O(1) space
	public static int maxItem(int arr[], int n, int sum) {
		Arrays.sort(arr);
		int res = 0;
		int i=0;
		while(arr[i] <= sum) {
			res++;
			sum -= arr[i];
			i++;
		}
		return res;
	}
	
	//Efficient Approach 
	//O(n) + O(res*logn) time. This res can become equal to n as well but that will happen in worst case.
	//O(1) space if convert the array into the min heap and O(n) space if we use priorityQueue
	
	public static int maxItem1(int arr[], int n, int sum) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			pq.add(arr[i]);
		}
		int res=0;
		while(pq.peek()<=sum) {
			res++;
			sum -= pq.poll();
		}
		return res;
	}

}
