package d_arrays;

public class D_SortedOrNOt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,12,15};
		int b[] = {8, 10 ,10,12};
		int c[] = {100};
		int d[] = {100,20,200};
		
		System.out.println(sorted1(a, 3)+" "+sorted1(b, 4)+" "+sorted1(c, 1)+" "+sorted1(d, 3));
		System.out.println(sorted2(a, 3)+" "+sorted2(b, 4)+" "+sorted2(c, 1)+" "+sorted2(d, 3));

	}
	
	//Naive Approach O(n^2)
	public static boolean sorted1(int arr[], int n) {
		for(int i =0; i<n; i++) {
			for(int j =i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Efficient approach O(n)
	public static boolean sorted2(int arr[] , int n) {
		for(int i =0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}
