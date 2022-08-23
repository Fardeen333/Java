package d_arrays;

public class C_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,5,8,20};
		int b[] = {20,10,20,8,12};
		int c[] = {10,10,10};
		
		System.out.println(secondLargest(a, 4) +" "+secondLargest(b, 5) +" "+secondLargest(c, 3));
		System.out.println();
		System.out.println(second(a, 4) +" "+second(b, 5) +" "+second(c, 3));
		
		
		
		

	}
	
	//O(n) but iterating only once through the array
	public static int second(int arr[], int n) {
		int res = -1;
		int largest = 0;
		for(int i =0; i<n; i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest = i;
			}else if(arr[i] != arr[largest]) {
				if(res == -1 || arr[i] > arr[res] ) {
					res=i;
				}
			}
		}
		return res;
	}

	
	//O(n) but iterating 2 times through the array
	public static int secondLargest(int arr[], int n) {
		int res = -1;
		int largest = largest(arr, n);
		for(int i = 0; i<n ; i++) {
			if(arr[i] != arr[largest]) {
				if(res == -1 ) {
					res = i;
				}else if(arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
		
	}
	public static int largest(int arr[], int n) {
		int largest = 0;
		for(int i =0; i<n; i++) {
			if(arr[i]> arr[largest]) {
				largest = i ;
			}
		}
		return largest;
	}

}
