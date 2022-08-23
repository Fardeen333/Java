package d_arrays;

public class P_MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,-2,3,-1,2};
		System.out.println(max(a, a.length));
		int a1[] = {-3,8,-2,4,-5,6};
		System.out.println(max1(a1, a1.length));

	}
	//Naive solution O(n^2) time and O(1) space
	public static int max(int arr[], int n) {
		int res = arr[0];
		for(int i =0; i<n; i++) {
			int current = 0;
			for(int j =i; j<n;j++) {
				current += arr[j];
				res =Math.max(res, current);
			}
		}
		return res;
	}
	
	//O(n) time and O(1) space
	public static int max1(int arr[], int n) {
		int res = arr[0];
		int current = arr[0];
		for(int i =1; i<n; i++) {
			current = Math.max(current+arr[i], arr[i]);
			res = Math.max(res,current);
		}
		return res;
	} 

}
