package e_searching;

public class A_BinarySearchIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,60};
		int b[] = {5,15,25};
		int c[] = {5,10,15,25};
		int d[] = {10,10};
		
		System.out.println(search(a, a.length, 20)+" "+search(b, b.length, 25)+" "+ search(c, c.length, 20)+" "+search(d, d.length, 10));
		System.out.println(binarysearch(a, a.length, 20)+" "+binarysearch(b, b.length, 25)+" "+ binarysearch(c, c.length, 20)+" "+binarysearch(d, d.length, 10));

	}
	
	//Naive Approach O(n) time and O(1) space
	public static int search(int arr[], int n, int k) {
		for(int i=0; i<n; i++) {
			if(arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	//Efficient Approach O(logn) time and O(1) space
	public static int binarysearch(int arr[], int n, int k) {
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int mid = (low + high)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(k < arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
}
