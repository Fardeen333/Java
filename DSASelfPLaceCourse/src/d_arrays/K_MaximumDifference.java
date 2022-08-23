package d_arrays;

public class K_MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,10,6,4,8,1};
		int b[] = {7,9,5,6,3,2};
		int c[] = {10,20,30};
		int d[] = {30,10,8,2};
		
		System.out.println(maximum(a,a.length)+" "+maximum(b,b.length)+" "+maximum(c,c.length)+" "+maximum(d,d.length));
		System.out.println();
		System.out.println(maximum1(a,a.length)+" "+maximum1(b,b.length)+" "+maximum1(c,c.length)+" "+maximum1(d,d.length));

	

	}
	//O(n^2) time and O(1) Space
	public static int maximum(int arr[], int n) {
		int res = arr[1] - arr[0];
		for(int i =0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				res = Math.max(res, arr[j]-arr[i]);
			}
		}
		return res;
	}
	
	//O(n) time and O(1) space
	public static int maximum1(int arr[], int n) {
		int res= arr[1]-arr[0]; 
		int min = arr[0];
		for(int i =1; i<n ;i++) {
			res= Math.max(res, arr[i]-min);
			min = Math.min(min,  arr[i]);
		}
		return res;
	}

}
