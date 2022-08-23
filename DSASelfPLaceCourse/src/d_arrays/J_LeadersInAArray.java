package d_arrays;

public class J_LeadersInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,10,4,10,6,5,2};
		int b[] = {7,10,4,10,6,5,2};
		leaders(a, a.length);
		System.out.println();
		leaders1(b, b.length);

	}
	//O(n^2) time and O(1) space 
	public static void leaders(int arr[], int n) {
		for(int i=0; i<n; i++) {
			boolean flag = true;
			for(int j =i+1;j<n; j++) {
				if(arr[j] >= arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	//O(n) time and O(1) space but prints leaders from right to left.
	//If we want to print from left to right we can use an additional array to store
	public static void leaders1(int arr[], int n) {
		int leader = arr[n-1];
		System.out.print(leader+ " ");
		for(int i =n-2; i>=0; i--) {
			if(arr[i] > leader) {
				leader = arr[i];
				System.out.print(leader+ " ");
			}
		}
	}
	

}
