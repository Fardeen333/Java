package o_BInarySearchTree;

import java.util.TreeSet;

public class H_CeilingOnTheLeftSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 8, 30, 15, 25, 12};
		leftCeiling(arr, arr.length);
		leftCeil(arr, arr.length);

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static void leftCeiling(int arr[], int n) {
		System.out.print(-1+" ");
		for(int i=1; i<n; i++) {
			int diff = Integer.MAX_VALUE;
			for(int j=0; j<i; j++) {
				if(arr[j] >= arr[i]) {
					diff = Math.min(diff, arr[j]-arr[i]);
				}
			}
			if(diff == Integer.MAX_VALUE) {
				System.out.print(-1+" ");
			}else {
				System.out.print(diff+arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	//efficient Approach O(nlogn) time and o(n) space
	public static void leftCeil(int arr[], int n) {
		System.out.print(-1+" ");
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(s.ceiling(arr[i])!=null) {
				System.out.print(s.ceiling(arr[i])+" ");
			}else {
				System.out.print(-1+" ");
			}
			s.add(arr[i]);
		}
		System.out.println();
	}

}
