package k_Stack;

import java.util.ArrayDeque;

public class K_LargestRectangleWithall1 {

	public static void main(String[] args) {
		int arr1[][] = {{1,0,0,1,1},{0,0,0,1,1},{1,1,1,1,1},{0,1,1,1,1}};
		int arr2[][] = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
		int arr3[][] = {{0,1,1},{1,1,1},{0,1,1}};
		int arr4[][] = {{0,0},{0,0}};
		int arr5[][] = {{0,0},{0,1}};
		int arr6[][] = {{1,1,1}};
		
		System.out.println(largestRectangleWithAll1(arr1, 4, 5));
		System.out.println(largestRectangleWithAll1(arr2, arr2.length, arr2[0].length));
		System.out.println(largestRectangleWithAll1(arr3, arr3.length, arr3[0].length));
		System.out.println(largestRectangleWithAll1(arr4, arr4.length, arr4[0].length));
		System.out.println(largestRectangleWithAll1(arr5, arr5.length, arr5[0].length));
		System.out.println(largestRectangleWithAll1(arr6, arr6.length, arr6[0].length));
		
		

	}
	
	//Efficient Solution O(r*c) time and O(C) space
	public static int largestRectangleWithAll1(int arr[][], int r, int c) {
		int res = getMaxArea(arr[0], c);
		for(int i=1; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(arr[i][j] == 1) {
					arr[i][j] += arr[i-1][j];
				}	
			}
			res = Math.max(res, getMaxArea(arr[i], c));
		}
		return res; 
	}
	
	public static int getMaxArea(int arr[], int n) {
		int res = 0;
		ArrayDeque<Integer> s = new ArrayDeque<>();
		for(int i=0; i<n; i++) {
			while(s.isEmpty()==false && arr[s.peek()]>=arr[i]) {
				int tp = s.pop();
				int curr = arr[tp] * (s.isEmpty()? i : i - s.peek() - 1 );
				res = Math.max(res, curr);
			}
			s.push(i);
		}
		while(s.isEmpty() == false) {
			int tp = s.pop();
			int curr = arr[tp] * (s.isEmpty()? n : n-s.peek() - 1 );
			res = Math.max(res, curr);
		}
		return res;
	}
		
}

