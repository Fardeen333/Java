package e_searching;

public class E_NumberOfOccurenceOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,20,20,30,30};
		int b[] = {10,10,10,10,10};
		int c[] = {5,8,10};
		
		System.out.println(countOccurences(a, a.length, 20)+" "+countOccurences(b,b.length , 10)+" "+countOccurences(c, c.length, 7));
		System.out.println(countOccurences1(a,20,0, a.length-1)+" "+countOccurences1(b ,10 ,0 ,b.length-1)+" "+countOccurences1(c, 7, 0, c.length-1));

	}
	
	//Naive Approach
	//O(n) time and O(1) space
	public static int countOccurences(int arr[], int n, int k) {
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == k) {
				count++;
			}
		}
		return count;
	}
	
	//Efficient approach
	public static int countOccurences1(int arr[], int k, int low, int high) {
		int firstOccurence = firstOccurence(arr, k, low, high);
		if(firstOccurence == -1) {
			return 0;
		}
		return ((lastOccurence(arr, k, low, high)) - firstOccurence + 1);
	}
	
	public static int firstOccurence(int arr[], int k, int low, int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high)/2;
		if(arr[mid] > k) {
			return firstOccurence(arr, k, low, mid-1);
		}else if(arr[mid] < k) {
			return firstOccurence(arr, k, mid+1, high);
		}else {
			if(mid==0 || arr[mid] != arr[mid-1]) {
				return mid;
			}else {
				return firstOccurence(arr, k, low, mid-1);
			}
		}
	}
	
	public static int lastOccurence(int arr[], int k, int low, int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high)/2;
		if(arr[mid] > k) {
			return lastOccurence(arr, k, low, mid-1);
		}else if(arr[mid] < k) {
			return lastOccurence(arr, k, mid+1, high);
		}else {
			if(mid==arr.length-1 || arr[mid] != arr[mid+1]) {
				return mid;
			}else {
				return lastOccurence(arr, k, mid+1, high);
			}
		}
	}
	
	

}
