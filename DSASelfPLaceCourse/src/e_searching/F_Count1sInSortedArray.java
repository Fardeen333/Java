package e_searching;

public class F_Count1sInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,0,0,1,1,1,1};
		int b[] = {1,1,1,1,1};
		int c[] = {0,0,0,0};
		
		System.out.println(count(a,a.length)+" "+count(b, b.length)+" "+count(c, c.length));
		System.out.println(count1(a,a.length)+" "+count1(b, b.length)+" "+count1(c, c.length));
		System.out.println(count2(a,a.length,0,a.length-1)+" "+count2(b, b.length,0,b.length-1)+" "+count2(c, c.length,0,c.length-1));

	}
	
	//Naive Approach
	//O(n) time and O(1) space
	public static int count(int arr[], int n) {
		int i=0;
		for(i=0; i<n; i++) {
			if(arr[i] == 1) {
				break;
			}
		}
		if(i==n) {
			return 0;
		}else {
			return n-i;
		}
	}
	
	//Efficient approach
	//O(logn) time and o(1)space
	public static int count1(int arr[], int n) {
		int low=0; int high= n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == 0) {
				low = mid+1;
			}else {
				if(mid==0 || arr[mid-1] != arr[mid]) {
					return n-mid;
				}else {
					high = mid-1;
				}
			}
		}
		return 0;
	}
	//Recursive
	public static int count2(int arr[], int n, int low, int high) {
		if(low>high) {
			return 0;
		}
		int mid=(low +high)/2;
		if(arr[mid] == 0) {
			return count2(arr, n, mid+1, high);
		}else {
			if(mid==0 || arr[mid-1] != arr[mid]) {
				return n-mid;
			}else {
				return count2(arr, n, low, mid-1);
			}
		}
	}
	
}
