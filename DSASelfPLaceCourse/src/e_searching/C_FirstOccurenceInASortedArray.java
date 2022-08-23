package e_searching;

public class C_FirstOccurenceInASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,10,10,10,20,20,40};
		int b[] = {10,20,30};
		int c[] = {15,15,15};
		
		System.out.println(index(a,a.length,20)+" "+index(b,b.length,15)+" "+index(c,c.length,15));
		System.out.println(index1(a,20,0,a.length-1)+" "+index1(b,15,0,b.length-1)+" "+index1(c,15,0,c.length-1));
		System.out.println(index2(a,a.length,20)+" "+index2(b,b.length,15)+" "+index2(c,c.length,15));
	}
	
	//Naive Approach
	//O(n) time and O(1) space
	public static int index(int arr[], int n, int k) {
		for(int i=0; i<n; i++) {
			if(arr[i] == k) {
				return i;
			}
		}
		return -1;
	}
	
	//Efficient approach
	//Recursive o(logn) time and O(logn) space
	public static int index1(int arr[], int k, int low, int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high)/2;
		if(arr[mid] < k) {
			return index1(arr, k, mid+1, high);
		}else if(arr[mid] > k) {
			return index1(arr, k, low, mid-1);
		}else {
			if(mid==0 || arr[mid-1] != arr[mid]) {
				return mid;
			}else {
				return index1(arr, k, low, mid-1);
			}
		}
	}
	//Iterative O(logn) time and O(1) space 
	public static int index2(int arr[], int n, int k) {
		int low = 0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(k > arr[mid]) {
				low = mid+1;
			}else if(k < arr[mid]) {
				high = mid-1;
			}else {
				if(mid == 0 || arr[mid-1] != arr[mid]) {
					return mid;
				}else {
					high = mid-1;
				}
			}
		}
		return -1;
	}
}
