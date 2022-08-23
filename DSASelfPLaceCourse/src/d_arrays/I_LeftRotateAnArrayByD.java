package d_arrays;

public class I_LeftRotateAnArrayByD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		rotate1(a, 5, 2);
		int b[] = {1,2,3,4,5};
		rotate2(b, 5, 2);
		int c[] = {1,2,3,4,5};
		rotate3(c, 5, 2);

	}
	
	
	//O(nd) time and O(1) space
	public static void rotate1(int arr[], int n, int d) {
		for(int i =0 ; i<d; i++) {
			int temp = arr[0];
			for(int j=1; j<n; j++) {
				arr[j-1] = arr[j];
			}
			arr[n-1] = temp;
		}
		print(arr);
	}
	
	//O(n) time and O(n) space
	public static void rotate2(int arr[], int n, int d) {
		int temp[] = new int[d];
		for(int i =0; i<d; i++) {
			temp[i] = arr[i];
		}
		for(int i =d; i<n; i++) {
			arr[i-d] = arr[i];
		}
		for(int i=0; i<d; i++) {
			arr[n-d+i] = temp[i];
		}
		print(arr);
		
	}
	
	//O(n) time and O(1) space //Reverse Algorithm
	public static void rotate3(int arr[], int n, int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		print(arr);
	}
	
	public static void reverse(int arr[], int i, int j) {
		while(i<j){
			int temp = arr[i]; arr[i] = arr[j]; arr[j] =temp;
			i++; j--;
		}
	}
	
	//Utility function
	public static void print(int arr[]) {
		for(int e: arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}

}
