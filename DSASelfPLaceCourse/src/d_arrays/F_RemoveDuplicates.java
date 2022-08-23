package d_arrays;

public class F_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,20,30,30,30};
		System.out.println(duplicates(arr,6));
		System.out.println(removeDuplicates(arr,6));

	}
	
	//O(n) time and O(n) space
	public static int removeDuplicates(int arr[], int n) {
		int temp[] = new int[n];
		temp[0] =arr[0];
		int res = 0;
		for(int i =1; i<n; i++) {
			if(temp[res] != arr[i]) {
				temp[res+1] = arr[i];
				res++;
			} 
		}
		return res+1;
	}
	
	
	//O(n) time and O(1) space
	public static int duplicates(int arr[], int n) {
		int res = 0;
		for(int i=1; i<n; i++) {
			if(arr[i] != arr[i-1]) {     //if(arr[res] != arr[i]){
				arr[res+1] = arr[i];     //    arr[res+1] = arr[i];
				res++;                   //    res++;
			}
		}
		return res+1;
	}

}
