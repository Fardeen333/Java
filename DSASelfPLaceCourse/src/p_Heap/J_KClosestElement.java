package p_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class J_KClosestElement {

	public static void main(String[] args) {
		
		int arr[] = {10,30,5,40,38,80,70};
		printKClosest(arr, arr.length, 35, 3);

		
		printKClosest1(arr, arr.length, 35, 3);
		
		

	}
	
	//Naive Approach O(nk) time and O(n) space
	public static void printKClosest(int arr[], int n, int x, int k) {   // k = no. of closest elements to be printed and x = number closest to which elements are to be searched
		boolean visited[] = new boolean[n];
		for(int i=0; i<k; i++) {
			int min_diff = Integer.MAX_VALUE;
			int min_diff_index = -1;
			for(int j=0; j<n; j++) {
				if(visited[j] == false && Math.abs(arr[j] - x ) <= min_diff) {
					min_diff = Math.abs(arr[j]-x);
					min_diff_index = j;
				}
			}
			System.out.print(arr[min_diff_index]+" ");
			visited[min_diff_index] = true; 
		}
		System.out.println();
	}
	
	//Efficient Approach
	//O(klogk) + O(n-k)logk + O(klogk) == O(nlogk) time
	//O(k) space
	public static void printKClosest1(int arr[], int n, int x, int k) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
		for(int i=0; i<k; i++) {
			pq.add(new Pair(Math.abs(arr[i]-x ),i));
		}
		for(int i=k; i<n; i++) {
			int diff = Math.abs(arr[i] - x);
			if(pq.peek().diff > diff) {
				pq.poll();
				pq.add(new Pair(diff, i));
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(arr[pq.poll().index]+" ");
		}
		System.out.println();

	}

}

class Pair implements Comparable<Pair>{
	int diff;
	int index;
	Pair(int diff, int index){
		this.diff = diff;
		this.index = index;
	}
	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return this.diff - o.diff ;
		
	}
}
