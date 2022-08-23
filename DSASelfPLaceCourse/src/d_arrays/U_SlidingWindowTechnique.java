package d_arrays;

public class U_SlidingWindowTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Type 1
		int arrForMaxSum[] = {1,8,30,-5,20,7};
		System.out.println(maxSum1(arrForMaxSum, arrForMaxSum.length, 3));
		System.out.println(maxSum2(arrForMaxSum, arrForMaxSum.length, 3));
		System.out.println();
		//Type 2
		int arrForCheckingSum[] = {1,8,30,-5,20,7};
		System.out.println(checkSum(arrForCheckingSum, arrForCheckingSum.length, 3, 45));
		System.out.println(checkSum(arrForCheckingSum, arrForCheckingSum.length, 3, 44));
		System.out.println();
		//Type 3
		int a[] = {1,4,20,3,10,5}; int b[] = {1,4,0,0,3,10,5}; int c[] = {2,4};
		System.out.println(givenSum1(a, a.length, 33)+" "+givenSum1(b, b.length, 7)+" "+givenSum1(c, c.length, 3));
		System.out.println(givenSum2a(a, a.length, 33)+" "+givenSum2a(b, b.length, 7)+" "+givenSum2a(c, c.length, 3));
		System.out.println(givenSum2b(a, a.length, 33)+" "+givenSum2b(b, b.length, 7)+" "+givenSum2b(c, c.length, 3));
		System.out.println();
		//Type 4
		nBonacci(3,8);
		nBonacci(4,10);
		
	}
	
	//Type 1
	//GIven a array of integers and a number k, find the maximum sum of K consecutive elements
	//O((n-k)*k) time and O(1) space
	public static int maxSum1(int arr[] , int n, int k){
		int res = Integer.MIN_VALUE;
		for(int i =0; i<n-k+1; i++) {
			int sum = 0;
			for(int j=0; j<k; j++) {
				sum += arr[i+j];
			}
			res = Math.max(res, sum);
		}
		return res;
	}
	//O(n) time and O(1) space
	public static int maxSum2(int arr[] , int n, int k){
		int currentMaxSum =0 ;
		for(int i =0; i<k; i++) {
			currentMaxSum += arr[i];
		}
		int res = currentMaxSum;
		for(int i=k; i<n; i++) {
			currentMaxSum += arr[i] - arr[i-k];
			res = Math.max(res,currentMaxSum);
		}
		return res;
	}
	
	
	//Type 2
	//Given an array of integers and a number k(window), and a sum, check whether there exists a subarray with that sum
	//O(n) time and O(1) space
	public static boolean checkSum(int arr[], int n, int k, int sum) {
		int currentSum =0 ;
		for(int i =0; i<k; i++) {
			currentSum += arr[i];
		}
		if(currentSum == sum) return true;
		for(int i=k; i<n; i++) {
			currentSum += arr[i] - arr[i-k];
			if(currentSum == sum) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	//Type 3
	//Given an unsorted array of non-negative integers. Find if there is a sub Array with given sum
	//Naive approach O(n^2) time and O(1) time
	public static boolean givenSum1(int arr[], int n, int sum) {
		for(int i =0; i<n; i++) {
			int currentSum =0 ;
			for(int j=i ; j<n; j++) {
				currentSum += arr[j];
				if(currentSum == sum) {
					return true;
				}
			}	
		}
		return false;
	}
	//O(n) time though we are iterating over some i more than once
	public static boolean givenSum2a(int arr[], int n, int sum) {
		int currentSum =arr[0];
		int s = 0;
		for(int e=1; e<n; e++) {
			if(currentSum < sum) {
				currentSum += arr[e];
			}else if(currentSum > sum) {
				currentSum -= arr[s];
				s++;
				e--;
			}else {
				return true;
			}
		}
		return false;
	}
	//O(n) time though we are using a while loop over some i but the operation performed on this while loop are O(1) hence averaging out to O(1) constant time
	public static boolean givenSum2b(int arr[], int n, int sum) {
		int currentSum = arr[0];
		int s =0;
		for(int e=1; e<n; e++) {
			while(currentSum > sum && e<n) {
				currentSum -= arr[s];
				s++;
			}
			if(currentSum == sum) {
				return true;
			}
			if(currentSum < sum ) {
				currentSum += arr[e];
			}
		}
		return currentSum == sum;
	}
	
	//Type 4 N-bonacci Number
	//Fibonacci Number - First 2 numbers are known and next number is the sum of previous two numbers
	//in N-bonacci number first n numbers are known and next number is the sum of previous n numbers
	public static void nBonacci(int n, int m) {
		int arr[] = new int[m];
		for(int i=0; i<n-1; i++) {
			arr[i] = 0;
		}
		arr[n-1] = 1;
		int currentSum = 0;
		for(int i=0; i<n; i++) {
			currentSum += arr[i];
		}
		for(int i=n; i<m; i++) {
			arr[i] = currentSum;
			currentSum += arr[i] - arr[i-n];
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}

}
