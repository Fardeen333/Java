package e_searching;

public class H_SearchInAInfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,10,15,20,40,80,90,100,120,150};
		int b[] = {20,40,100,200};
		int c[] = {1,10,15,20,40,80,90,100,120,150};
		
		System.out.println(position(a, 100)+" "+position(b, 50));
		System.out.println(position1(a, 100)+" "+position1(b, 50)+" "+position(c, 120));

	}
	
	//Naive APproach O(position of the element) and O(1) space
	public static int position(int arr[], int k) {
		int i = 0;
		while(true) {
			if(arr[i] == k) return i;
			if(arr[i] > k) return -1;
			i++;
		}
	}
	
	//Efficient Approach O(log(postiion of the element)) and O(1) space
	public static int position1(int arr[], int k) {
		if(arr[0] == k) return 0;
		int i =1;
		while(arr[i] < k) {
			i*=2;
		}
		if(arr[i] == k) return i;
		return binarysearch(arr, k, i);
	}
	
	public static int binarysearch(int arr[], int k, int i) {
		int low = i/2+1;
		int high = i-1;
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
