package g_matrix;

public class D_TransposeOfTheMatrix {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(arr, arr.length);
		int arr1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose1(arr1, arr1.length);
		

	}
	
	//Naive Approach O(n^2) time and o(n^2) extra space
	public static void transpose(int arr[][], int n) {
		int temp[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				temp[i][j] = arr[j][i];
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = temp[i][j];
			}
		}
		
		print(arr,n);
		
	}
	//Efficient Approach O(n^2) time and O(1) space
	public static void transpose1(int arr[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				swap(arr, i,j);
			}
		}
		print(arr,n);
	}
	
	private static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
		
	}

	//Utility function
	public static void print(int arr[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
