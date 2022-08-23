package d_arrays;

public class B_LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,5,20,9};
		int b[] = {40,8,50,100};
		System.out.println(largest(a,4));
		System.out.println(largest(b,4));
		
		System.out.println(larg(a,4));
		System.out.println(larg(b,4));
		
		System.out.println(largRecursion(a, 4));
		System.out.println(largRecursion(b, 4));
		
		

	}

	//O(n^2)
	public static int larg(int arr[], int n) {
		for(int i =0; i<n; i++) {
			boolean flag = true;
			for(int j =0; j<n ; j++) {
				if(arr[j]>arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return i;
			}
		}
		return -1;
	}
	
	//O(n)
	public static int largest(int arr[], int n) {
		int largest = 0;
		for(int i =0; i<n ;i++) {
			if(arr[i]>arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}
	
	//O(n) using recursion
	public static int largRecursion(int arr[], int n) {
		if(n==1) {
			return arr[0];
		}
		
		return Math.max(arr[n-1], largRecursion(arr, n-1) );
	}

}
