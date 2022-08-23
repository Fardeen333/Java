package p_Heap;

import java.util.Arrays;

public class L_MedianOfAStream {

	public static void main(String[] args) {
		
		double arr[] = {25,7,10,15,20,85};
		System.out.println(Arrays.toString(arr));
		medianOfAStream(arr, arr.length);
	}
	
	//NAive APproach O(n^2) time and O(n) space
	public static void medianOfAStream(double arr[], int n) {
		double temp[] = new double[n];
		double res[] = new double[n];
		int size = 0;
		for(int i=0; i<n; i++) {
			if(size == 0) {
				temp[0] = arr[i]; 
				size++;
			}else {
				int j = size-1;
				while(j>=0 && temp[j] > arr[i]) {
					temp[j+1] = temp[j];
					j--;
				}
				temp[j+1] = arr[i];
				size++;
			} 
			
			if(size %2 == 0) {
				res[i] = (temp[size/2] + temp[size/2 - 1])/2;
			}else {
				res[i] = temp[size/2];
			}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(res));
	}

}
