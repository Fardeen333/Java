package d_arrays;

public class A_OperationOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,1,5,7};
		System.out.println(search(arr,5,13));
		
		int a[] = new int [10];
		a[0] =1; a[1] =3; a[2] =4; a[3] =5;
		print(a);
		System.out.println();
		insert(a, 10, 2, 2, 4);
		System.out.println("Delete Operation:");
		int b[] = {1,2,3,4,5};
		System.out.println(delete(b,5,2));

	}
	
	public static int search(int arr[], int n, int k ) {
		for(int i =0; i<n; i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}
	
	public static void insert(int arr[], int n, int k, int i, int cap) {
		if(n==cap) {
			print(arr);
			return;
		}
		for(int j =cap-1; j>=i-1; j--) {
			arr[j+1] = arr[j];
		}
		arr[i-1] = k;
		print(arr);
	}
	
	public static void print(int arr[]) {
		for(int e: arr) {
			System.out.print(e+" ");
		}
	}
	
	public static int delete(int arr[], int n , int k) {
		int i =0;
		for(i =0; i<n; i++) {
			if(arr[i] == k) {
				break;
			}
		}
		if(i==n) {
			return n;
		}
		for(int j =i; j<n-1; j++) {
			arr[j] = arr[j+1];
		}
		arr[n-1] = 0;
		print(arr);
		System.out.println();
		return n-1;
	}

}
