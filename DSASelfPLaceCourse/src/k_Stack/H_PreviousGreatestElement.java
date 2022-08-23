package k_Stack;

import java.util.*;

public class H_PreviousGreatestElement {

	public static void main(String[] args) {
		
		int arr1[] = {15,10,18,12,4,6,2,8};
		int arr2[] = {8,10,12,16,20};
		int arr3[] = {20,16,12,10,8};
		
		previousGreatest(arr1, arr1.length);
		previousGreatest(arr2, arr2.length);
		previousGreatest(arr3, arr3.length);
		System.out.println();
		
		previousGreatest1(arr1, arr1.length);
		previousGreatest1(arr2, arr2.length);
		previousGreatest1(arr3, arr3.length);

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static void previousGreatest(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int j=0;
			for(j=i-1; j>=0; j--) {
				if(arr[j] > arr[i]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==-1) {
				System.out.print(-1+" ");
			}
		}
		System.out.println();
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static void previousGreatest1(int arr[], int n) {
		Deque<Integer> s = new ArrayDeque<>();
		System.out.print(-1+" ");
		s.push(arr[0]);
		for(int i=1; i<n; i++) {
			while(s.isEmpty()==false && s.peek()<=arr[i]) {
				s.pop();
			}
			int val = (s.isEmpty()==true)? -1:s.peek();
			System.out.print(val+" ");
			s.push(arr[i]);
		}
		System.out.println();
	}

}
