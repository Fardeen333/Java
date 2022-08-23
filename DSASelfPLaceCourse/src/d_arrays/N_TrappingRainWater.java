package d_arrays;

public class N_TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,0,2};int b[] = {3,0,1,2,5};int c[] = {1,2,3};int d[] = {3,2,1};int e[] = {5,0,6,2,3};
		System.out.println(maxWater(a, a.length)+" "+maxWater(b, b.length)+" "+maxWater(c, c.length)+" "+maxWater(d, d.length));
		System.out.println(maxWater1(a, a.length)+" "+maxWater1(b, b.length)+" "+maxWater1(c, c.length)+" "+maxWater1(d, d.length)+" "+maxWater1(e, e.length));
		
	}
	
	//Naive Approach
	//O(n^2) time and O(1) Space
	public static int maxWater(int arr[], int n) {
		int res = 0;
		for(int i =1; i<n-1; i++) {
			int leftmax = arr[i];
			for(int j=0; j<i; j++) {
				leftmax = Math.max(arr[j], leftmax);
			}
			int rightmax = arr[i];
			for(int j=i+1; j<n; j++) {
				rightmax = Math.max(arr[j], rightmax); 
			}
			res+= (Math.min(leftmax, rightmax)-arr[i]);
		}
		return res;
	}
	
	//O(n) time and O(n) space
	public static int maxWater1(int arr[], int n) {
		int res =0;
		int lmax[] = new int[n];
		int rmax[] = new int[n];
		lmax[0] = arr[0];
		for(int i =1; i<n; i++) {
			lmax[i] = Math.max(arr[i], lmax[i-1]);
		}
		rmax[n-1] = arr[n-1];
		for(int i =n-2; i>=0; i--) {
			rmax[i] = Math.max(arr[i], rmax[i+1]);
		}
		for(int i =1; i<n-1; i++) {
			res += (Math.min(lmax[i], rmax[i])-arr[i]);
		}
		return res;
	}

}
