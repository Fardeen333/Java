package e_searching;

public class B_BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {5,15,25};
		int c[] = {5,10,15,25};
		int d[] = {10,10};
		
		System.out.println(search(a, 20, 0, a.length-1)+" "+search(b,25,0 ,b.length-1)+" "+ search(c, 20, 0, c.length-1)+" "+search(d, 10, 0, d.length-1));
	}
	
	public static int search(int arr[], int k, int low, int high) {
		
		if(low > high) {
			return -1;
		}
		
		int mid = (low + high)/2;
		if(arr[mid] == k) {
			return mid;
		}else if(arr[mid] < k) {
			return search(arr, k, mid+1, high);
		}else {
			return search(arr, k, low, mid-1);
		}
	}

}
