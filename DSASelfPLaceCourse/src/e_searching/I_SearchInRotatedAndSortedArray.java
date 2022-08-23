package e_searching;

public class I_SearchInRotatedAndSortedArray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,8,9};
		int b[] = {100,200,300,10,20};
		int c[] = {10,20,40,60,5,8};
		
		System.out.println(index(a, 30)+ " "+index(b, 40)+" "+index(c, 5));
		System.out.println(index(a, 30)+ " "+index(b, 40)+" "+index(c, 5)+" "+index(c,6));

	}
	
	//Naive Approach O(n) time and O(1) space
	public static int index(int arr[], int k) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == k)
				return i;
		}
		return -1;
	}
	
	//Efficient Approach
	//O(logn) time and O(1) space
	public static int index1(int arr[], int k) {
		int low = 0; 
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == k) {
				return mid;
			} 
			if(arr[mid] > arr[low]) {
				if(k>=arr[low] && k<arr[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			}else {
				if(k>arr[mid] && k<=arr[high]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}
		return -1;
	}

}
