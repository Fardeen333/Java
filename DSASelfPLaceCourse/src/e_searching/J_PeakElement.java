package e_searching;

public class J_PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,10,20,15,7};
		int b[] = {5,10,20,20,7};
		int c[] = {10,20,15,5,23,90,67};
		int d[] = {80,70,60};
		
		System.out.println(peak(a, a.length)+" "+peak(b, b.length)+" "+peak(c,c.length)+" "+peak(d,d.length));
		System.out.println(peak1(a, a.length)+" "+peak1(b, b.length)+" "+peak1(c,c.length)+" "+peak1(d,d.length));
	}

	//Naive Approach O(n) time and O(1) space
	public static int peak(int arr[], int n) {
		if(n == 1) return arr[0];
		if(arr[0] >= arr[1]) return arr[0];
		if(arr[n-1] >= arr[n-2]) return arr[n-1];
		for(int i=1; i<n-1; i++) {
			if(arr[i] >= arr[i-1] && arr[i] >=arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	//Efficient Approach though unsorted binary search can be applied here
	//o(logn) time and O(1) space
	public static int peak1(int arr[], int n) {
		int low =0;
		int high = n-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if((mid ==0 || (arr[mid] >= arr[mid-1])) && (mid==n-1 || (arr[mid] >= arr[mid+1]))) {
				return arr[mid];
			}
			if(mid>0 && arr[mid-1] >= arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
		
	}
}
