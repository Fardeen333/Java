package e_searching;

import java.util.Arrays;

public class N_RepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,2,1,3,2,2};
		int b[] = {1,2,3,0,3,4,5};
		int c[] = {0,0};
		int a1[] = {0,2,1,3,2,2};
		int b1[] = {1,2,3,0,3,4,5};
		int c1[] = {0,0};
		
		System.out.println(repeating(a, a.length)+" "+repeating(b, b.length)+" "+repeating(c, c.length));
		System.out.println(repeating1(a, a.length)+" "+repeating1(b, b.length)+" "+repeating1(c, c.length));
		System.out.println(repeating2(a1, a1.length)+" "+repeating2(b1, b1.length)+" "+repeating2(c1, c1.length));
		
		int arr[] = {1,3,2,4,6,5,7,3};
		System.out.println(repeatingElementExcluding0(arr, arr.length));
	}
	
	//Super Naive Approach O(n^2) time and O(1) space
	public static int repeating(int arr[] , int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	//Naive Approach O(nlogn) time and O(1) space
	public static int repeating1(int arr[], int n) {
		Arrays.sort(arr);
		for(int i=1; i<n; i++) {
			if(arr[i] == arr[i-1]) {
				return arr[i];
			}
		}
		return -1;
	}
	//Little Efficient APproach O(n) time and O(n) space
	public static int repeating2(int arr[], int n) {
		boolean isVisited[] =new boolean[n];
		for(int i=0; i<n; i++) {
			if(isVisited[arr[i]]) return arr[i];
			isVisited[arr[i]] = true;
		}
		return -1;
	}
	
	//Efficient Approach
	public static int repeatingElementExcluding0(int arr[], int n) {
		int slow = arr[0];         //slow = arr[0] + 1;
		int fast = arr[0];         //fast = arr[0] + 1;
		do{
			slow = arr[slow];         //slow = arr[slow] +1;
			fast = arr[arr[fast]];      //fast = arr[arr[fast]+1]+1;
		}while(slow != fast);
		slow = arr[0];					//slow = arr[0] + 1;
		while(slow != fast) {
			slow =arr[slow];				//slow = arr[slow]+1;
			fast = arr[fast];				//fast = arr[fast]+1
		}
		return slow; 					//return slow-1;
	}

}
