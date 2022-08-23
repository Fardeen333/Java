package e_searching;

public class K_TwoPointersApproach {

	public static void main(String[] args) {
	
		//Type 1 
		int a[] = {3,5,9,2,8,10,11};
		int b[] = {8,4,6};
		System.out.println(checkSum(a, a.length, 17)+" "+checkSum(b, b.length, 11));
		
		//Type 2 
		int c[] = {2,5,8,12,30};
		int d[] = {3,8,13,18};
		System.out.println(checkSumEfficiently(c, c.length, 17,0,c.length-1)+ " "+checkSumEfficiently(d, d.length, 14, 0, d.length-1));
		
		//Type 3 
		int e[] = {2,3,4,8,9,20,40};
		System.out.println(triplets(e, e.length, 32));
		System.out.println(triplets1(e, e.length, 32));

	}
	
	//Type 1
	//1. Given an unsorted array and a number x, we need to find  if there is a pair in the array with the sum equals to x
	//Naive Approach O(n^2) time and O(1) space
	public static boolean checkSum(int arr[], int n, int sum) {
		for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(arr[i] + arr[j] == sum)
						return true;
				}
		}
		return false;
	}
	
	//Type 2
	//Given an sorted array and a number x, we need to find  if there is a pair in the array with the sum equals to x
	//technique 1 - nested loop - O(n^2) time and O(1) space 
	//technique 2 - hashing - O(n) time and O(n) space
	
	//Technique 3 - two pointers approach - O(n) time and O(1) space 
	public static boolean checkSumEfficiently(int arr[], int n, int sum, int i, int j) {
//		int i = 0; 
//		int j = n-1;
		while(i<j) {
			if(arr[i] + arr[j] == sum) {
				return true;
			}else if(arr[i] + arr[j] > sum) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
	
	// Given an sorted array and a number x, we need to find  if there is a pair in the array with the sum equals to x
	//Naive Approach O(n^3) time and O(1) space
	public static boolean triplets(int arr[], int n, int sum) {
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					if(arr[i]+arr[j]+arr[k] == sum)
						return true;
				}
			}
		}
		return false;
	}
	
	//Efficient Approach O(n^2) time and O(1) space
	public static boolean triplets1(int arr[], int n, int sum) {
		for(int i=0; i<n-2; i++) {
			if(checkSumEfficiently(arr, n, sum - arr[i], i+1, n-1)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
