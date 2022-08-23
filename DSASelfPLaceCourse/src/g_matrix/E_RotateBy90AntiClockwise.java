package g_matrix;

public class E_RotateBy90AntiClockwise {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
		rotate(arr, 4);
		int arr1[][] = {{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
		rotate1(arr1, 4);

	}
	
	//Naive Approach o(n*n) time and O(n*n) space
	public static void rotate(int arr[][], int n) {
		int temp[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				temp[n-1-j][i] = arr[i][j];
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = temp[i][j];
			}
		}
		
		print(arr,n);
		
	}
	
	//Efficient Approach O(n*n) time and O(1) space
	public static void rotate1(int arr[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				swap(arr, i ,j);
			}
		}
		for(int i=0; i<n; i++) {
			int low =0;
			int high = n-1;
			while(low< high) {
				swap(arr, low, i, high);
				low++;
				high--;
			}
		}
		print(arr, n);
	}
	
	public static void swap(int arr[][],int low , int i, int high) {
		int temp = arr[low][i];
		arr[low][i] = arr[high][i];
		arr[high][i] = temp;
	}
	
	public static void swap(int[][] arr, int i, int j) {
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
