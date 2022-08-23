package e_searching;

public class O_MinimizeTheMaximumAllocationOfPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40};
		int b[] = {10,20,30};
		int c[] = {10,5,30,1,2,5,10,10};
		
		System.out.println(pagesAllocated(a, a.length, 2)+" "+pagesAllocated(b, b.length, 1)+" "+pagesAllocated(c, c.length, 3));
		System.out.println(minPages(a, a.length, 2)+" "+minPages(b, b.length, 1)+" "+minPages(c, c.length, 3));

	}
	
	//Naive Approach o(2^n) time and O(n) space
	public static int pagesAllocated(int arr[], int n, int k) {
		if(k==1) {
			return sum(arr, 0, n-1);
		}
		if(n==1) {
			return arr[0];
		}
		int res = Integer.MAX_VALUE;
		for(int i=1; i<n; i++) {
			res = Math.min(res, Math.max(pagesAllocated(arr, i, k-1), sum(arr,i,n-1)));
		}
		return res;
	}
	
	public static int sum(int arr[], int l, int r){
		int sum =0;
		for(int k=l; k<=r; k++) {
			sum+=arr[k];
		}
		return sum;
	}
	
	//Efficient Approach O(n*log(sum -max)) time and O(1) space
	public static int minPages(int arr[], int n, int k) {
		int sum = 0;
		int max = 0;
		int res = 0;
		for(int i =0; i<n; i++) {
			sum+=arr[i];
			max = Math.max(max, arr[i]);
		}
		int low = max;
		int high = sum;
		while(low<=high) {
			int mid = (low+high)/2;
			if(feasible(arr,n,k,mid)) {
				res = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return res;
	}

	private static boolean feasible(int[] arr, int n, int k, int ans) {
		int req =1;
		int sum =0;
		for(int i=0; i<n; i++) {
			if(sum+arr[i] > ans) {
				req++;
				sum = arr[i];
			}else {
				sum+=arr[i];
			}
		}
		return (req <= k);
		
	}

}
