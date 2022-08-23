package f_sorting;

import java.util.Arrays;

public class O_MeetingMaximumGuests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {900,940}; int dep1[] = {1000,1030};
		int arr2[] = {800,700,600,500}; int dep2[] = {840,820,830,530};
		int arr3[] = {900,940,950,1100,1500,1800}; int dep3[] = {910,1200,1120,1130,1900,2000};
		
		System.out.println(maxGuests(arr1, dep1, arr1.length)+" "+maxGuests(arr2, dep2, arr2.length)+" "+maxGuests(arr3, dep3, arr3.length));

	}
	//O(nlogn) time and O(1) space
	public static int maxGuests(int arr[], int dep[], int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1; int j=0; int count = 1; int res =1;
		while(i<n && j<n) {
			if(arr[i] <= dep[j]) {
				i++;
				count++;
			} else {
				j++;
				count--;
			}
			res = Math.max(res, count);
		}
		return res;
		
	}

}
