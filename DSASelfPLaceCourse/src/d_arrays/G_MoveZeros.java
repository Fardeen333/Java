package d_arrays;

public class G_MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,5,0,0,8,0,9,0};
		moveZeros(a, a.length);
		System.out.println();
		int b[] = {10,5,0,0,8,0,9,0};
		move(b, b.length);

	}
	//O(n^2) time and O(1) space
	public static void moveZeros(int arr[], int n) {
		for(int i =0; i<n; i++) {
			if(arr[i] == 0) {
				for(int j=i+1; j<n; j++) {
					if(arr[j] != 0) {
						swap(arr,i,j);
						break;
					}
				}
			}
		}
		print(arr);
	}
	
	//O(n) time and O(1) space
	public static void move(int arr[], int n) {
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] != 0) {
				swap(arr, i, count);
				count++;
			}
		}
		print(arr);
	}
	
	//Utility function
	public static void swap(int a[], int i, int j) {
		int temp = a[i]; 
		a[i]=a[j];
		a[j]= temp;
	}
	
	//Utility function
	public static void print(int arr[]) {
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}

}
