package k_Stack;

import java.util.*;

public class G_StockSpanProblem {

	public static void main(String[] args) {
		
		int arr1[] = {13,15,12,14,16,8,6,4,10,30}; 
		int arr2[] = {10,20,30,40};
		int arr3[] = {40,30,20,10};
		
		span(arr1, arr1.length);
		span(arr2, arr2.length);
		span(arr3, arr3.length);
		span1(arr1, arr1.length);
		span1(arr2, arr2.length);
		span1(arr3, arr3.length);

	}
	
	
	//Naive Approach O(n^2) time and O(1) space
	public static void span(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int span =1;
			for(int j=i-1; j>=0 && arr[i] >= arr[j]; j--) {
//				if(arr[i] >= arr[j]) {
					span++;
//				}else {
//					break;
//				}
			}
			System.out.print(span+" ");
		}
		System.out.println();
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static void span1(int arr[], int n) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(0);
		System.out.print(1+" ");
		for(int i=1; i<n; i++) {
			while(stack.isEmpty()==false && arr[stack.peek()]<=arr[i]) {
				stack.pop();
			}
			int span = (stack.isEmpty() == true)? i+1 : i-stack.peek();
			System.out.print(span+" ");
			stack.push(i);
			
		}
		System.out.println();
	}

}
