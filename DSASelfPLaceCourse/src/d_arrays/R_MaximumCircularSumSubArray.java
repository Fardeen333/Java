package d_arrays;

public class R_MaximumCircularSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,-2,3,4}; int b[] = {2,3,-4};
		int c[] = {8,-4,3,-5,4};
		int d[] = {-3,4,6,-2};
		int e[] = {-8,7,6};
		int f[] = {3,-4,5,6,-8,7};
		int a1[] = {5,-2,3,4}; int b1[] = {2,3,-4};
		int c1[] = {8,-4,3,-5,4};
		int d1[] = {-3,4,6,-2};
		int e1[] = {-8,7,6};
		int f1[] = {3,-4,5,6,-8,7};
		System.out.println(maxCicularSum(a, a.length)+" "+maxCicularSum(b, b.length)+" "+maxCicularSum(c, c.length)+" "+maxCicularSum(d, d.length)+" "+maxCicularSum(e, e.length)+" "+maxCicularSum(f, f.length));
		System.out.println(maxInCircularSubArray(a1, a1.length)+" "+maxInCircularSubArray(b1, b1.length)+" "+maxInCircularSubArray(c1, c1.length)+" "+maxInCircularSubArray(d1, d1.length)+" "+maxInCircularSubArray(e1, e1.length)+" "+maxInCircularSubArray(f1, f1.length));
	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int maxCicularSum(int arr[] , int n) {
		int res = arr[0];
		for(int i =0 ; i<n; i++) {
			int count = arr[i];
			for(int j=1; j<n; j++) {
				int index = (i+j)%n;
				count += arr[index];
				res = Math.max(res, count);
			}
		}
		return res;
	}
	
	//O(n) time and O(1) space
	public static int maxInCircularSubArray(int arr[], int n){
		int maxNormalSubArray = normalSubArray(arr, n);
		if(maxNormalSubArray < 0) {
			return maxNormalSubArray;
		}
		int totalSum = 0;
		for(int i =0; i<n; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}
		int minNormalSubArray = normalSubArray(arr, n);
		int maxCircularSubArray = totalSum - (-minNormalSubArray);
		return Math.max(maxNormalSubArray, maxCircularSubArray);
	}
	
	
	public static int normalSubArray(int arr[], int n) {
		int res = arr[0];
		int current = arr[0];
		for(int i =1; i<n; i++) {
			current = Math.max(current+arr[i], arr[i]);
			res = Math.max(res,current);
		}
		return res;
	}

}
