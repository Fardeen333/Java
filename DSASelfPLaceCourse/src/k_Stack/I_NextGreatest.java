package k_Stack;

import java.util.ArrayDeque;

public class I_NextGreatest {

	public static void main(String[] args) {
		
		int arr1[] = {5,15,10,8,6,12,9,18};
		int arr2[] = {10,15,20,25};
		int arr3[] = {25,20,15,10};
		
		nextGreatest(arr1, arr1.length);
		nextGreatest(arr2, arr2.length);
		nextGreatest(arr3, arr3.length);
		
		System.out.println();
		
		nextGreatest1(arr1, arr1.length);
		nextGreatest1(arr2, arr2.length);
		nextGreatest1(arr3, arr3.length);

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static void nextGreatest(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int j=0; 
			for(j=i+1; j<n; j++) {
				if(arr[j] > arr[i]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==n) {
				System.out.print(-1+" ");
			}
		}
		System.out.println();
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static void nextGreatest1(int arr[], int n) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		System.out.print(-1+" ");
		s.push(arr[n-1]);
		for(int i=n-2; i>=0; i--) {
			while(s.isEmpty()==false && arr[i] >= s.peek()) {
				s.pop();
			}
			int nextGre = (s.isEmpty())? -1: s.peek();
			System.out.print(nextGre+" ");
			s.push(arr[i]);
		}
		System.out.println();
		
	}

}
