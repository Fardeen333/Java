package f_sorting.H_quickSort;

public class C_HoarePartition {

	public static void main(String[] args) {
		int arr[] = {5,3,8,4,2,7,1,10};
		int brr[] = {5,10,9,12};
		int crr[] = {10,10,5,9};
		int drr[] = {5,5,5,5};
		System.out.println(hoarePartition(arr, 0, arr.length-1)+" "+
		hoarePartition(brr, 0, brr.length-1)+" "+
		hoarePartition(crr, 0, crr.length-1)+" "+
		hoarePartition(drr, 0, drr.length-1));

	}
	//O(n) time and O(1) space
	public static int hoarePartition(int arr[], int l, int h) {
		int i = l -1 ;
		int j = h+1;
		int pivot = arr[l];
		while(true) {
			do {
				i++;
			}while(arr[i]< pivot);
			do {
				j--;
			}while(arr[j] > pivot);
			if(i>=j) {
				return j;
			}
			swap(arr,i,j);
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
