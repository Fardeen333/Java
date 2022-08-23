package d_arrays;

public class E_Reversre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {30,7,6,5,10};
		print(arr);
		System.out.println();
		reverse(arr, 5);
		print(arr);

	}
	
	public static void reverse(int arr[], int n) {
		int i = 0; int j=n-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}
	}
	
	//Utility function
	public static void print(int arr[]) {
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}

}
