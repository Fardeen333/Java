package d_arrays;

public class H_LeftRotateAnArrayByONe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		rotate(arr,5);

	}
	//O(n) time and O(1) space
	public static void rotate(int arr[], int n) {
		int temp =arr[0];
		for(int i =1; i<n; i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
		print(arr);
	}
	
	//Utility function
		public static void print(int arr[]) {
			for(int e: arr) {
				System.out.print(e+" ");
			}
		}

}
