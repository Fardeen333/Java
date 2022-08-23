package k_Stack;

import java.util.ArrayDeque;

public class J_LargestRectangularAreaInHistogram {

	public static void main(String[] args) {

		int arr1[] = {6,2,5,4,1,5,6};
		int arr2[] = {2,5,1};
		
		System.out.println(getMaxArea(arr1, arr1.length)+"  "+getMaxArea(arr2, arr2.length));

		
		System.out.println(getMaxArea1(arr1, arr1.length)+"  "+getMaxArea1(arr2, arr2.length));		
		
		
		System.out.println(getMaxArea2(arr1, arr1.length)+"  "+getMaxArea2(arr2, arr2.length));		
	}
	//Naive Approach O(n^2) time and O(1) space
	public static int getMaxArea(int arr[], int n) {
		int res =0 ;
		for(int i=0; i<n; i++) {
			int curr = arr[i];
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>=arr[i]) {
					curr+=arr[i];
				}else {
					break;
				}
			}
			for(int j=i+1; j<n; j++) {
				if(arr[j]>=arr[i]) {
					curr+=arr[i];
				}else {
					break;
				}
			}
			res = Math.max(res, curr);
		}
		return res;
	}
	
	//Better solution O(n) time and O(n) space
	//but requires 3 iterations and O(4 n) space
	public static int getMaxArea1(int arr[], int n) {
		int res= 0;
		int previousSmaller[] = previousSmaller(arr, n);
		int nextSmaller[] = nextSmaller(arr, n);
		
		for(int i=0; i<n; i++) {
			int curr = arr[i];
			curr += (i - previousSmaller[i] - 1)*arr[i];
			curr += (nextSmaller[i] - i - 1)*arr[i]; 
			
			res = Math.max(res, curr);
		}
		
		return res;
	}
	
	public static int[] previousSmaller(int arr[], int n) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		s.push(0);
		int ps[] = new int[n];
		ps[0] = -1;
		for(int i=1; i<n; i++) {
			while(s.isEmpty()==false && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()==true) {
				ps[i] = -1;
			}else {
				ps[i] = s.peek();
			}
			s.push(i);
		}
		return ps;
	}
	
	public static int[] nextSmaller(int arr[], int n) {
		ArrayDeque<Integer> s = new ArrayDeque<>();
		int ns[] = new int[n];
		ns[n-1] = n;
		s.push(n-1);
		for(int i=n-2; i>=0; i--) {
			while(s.isEmpty()==false && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()==true) {
				ns[i] = n;
			}else {
				ns[i] = s.peek();
			}
			s.push(i);
		}
		return ns;
		
	}
	
	//Efficient Solution O(n) time and O(n) space
	//Single iteration
	public static int getMaxArea2(int arr[], int n) {
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
