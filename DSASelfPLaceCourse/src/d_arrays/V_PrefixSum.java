package d_arrays;

public class V_PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Type 1 
		int arr[] = {2,8,3,9,6,5,4};
		System.out.println(getSum1(arr, 0, 2)+" "+getSum1(arr, 1, 3)+" "+getSum1(arr, 2, 6));
		System.out.println(getSum2(arr,arr.length, 0, 2)+" "+getSum2(arr,arr.length, 1, 3)+" "+getSum2(arr,arr.length, 2, 6));
		
		//Type 2
		int a[] = {3,4,8,-9,20,6}; int b[] = {4,2,-2}; int c[] = {4,2,2};
		System.out.println(isEquilibrium(a, a.length)+" "+ isEquilibrium(b, b.length)+" "+isEquilibrium(c, c.length));
		System.out.println(isEquilibrium1(a, a.length)+" "+ isEquilibrium1(b, b.length)+" "+isEquilibrium1(c, c.length));

	}
	
	//Type 1 Given a fixed array and multiple queries of following types on the array, how to effectively perform these queries
	//Naive Approach O(n) time in worst case
	public static int getSum1(int arr[], int l, int r) {
		int sum =0; 
		for(int i =l; i<=r; i++) {
			sum += arr[i];
		}
		return sum;
	}
	//O(n) time and o(n) space but for each query it would take O(1) time
	public static int getSum2(int arr[], int n, int l, int r ) {
		int prefix_sum[] = new int[n];
		prefix_sum[0] = arr[0];
		for(int i =1; i<n; i++) {
			prefix_sum[i] = prefix_sum[i-1] + arr[i];
		}
		if(l==0) {
			return prefix_sum[r];
		}
		return prefix_sum[r] - prefix_sum[l-1];
	}
	
	
	//Type 2 Given an array of integers, find if it has an equilibrium point or not
	//Equilibrium point = point where arr[0] to arr[i-1] == arr[i+1] to arr[n-1]
	//Naive Approach O(n^2) time and O(1) space
	public static boolean isEquilibrium(int arr[], int n) {
		for(int i =0; i<n; i++) {
			int leftSum = 0;
			for(int j=0; j<i; j++) {
				leftSum += arr[j];
			}
			int rightSum = 0;
			for(int k=i+1; k<n; k++) {
				rightSum += arr[k];
			}
			if(leftSum == rightSum) {
				return true;
			}
		}
		return false;
	}
	//can be solved by using prefix sum and suffix sum array but space used would be 2n
	//efficient approach O(n) time and O(1) space
	public static boolean isEquilibrium1(int arr[], int n) {
		int sum= 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		int leftSum = 0;
		for(int i=0; i<n; i++) {
			if(leftSum == sum-arr[i]) {
				return true;
			}
			leftSum += arr[i];
			sum -= arr[i];
		}
		return false;
	}

}
