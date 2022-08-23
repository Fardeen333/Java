package g_matrix;

import java.util.Arrays;

public class H_MedianInRowWiseSortedMatrix {

	public static void main(String[] args) {
		int arr[][] = {{5,10,20,30,40}, {1,2,3,4,6},{11,13,15,17,19}};
		int brr[][] = {{1,10,20},{15,25,35},{5,30,40}};
		int crr[][] = {{2,4,6,8,10},{1,3,5,7,9},{100,200,400,500,800}};
		System.out.println(median(arr, arr.length, arr[0].length)+" "+median(brr, brr.length, brr[0].length)+" "+median(crr, crr.length, crr[0].length));
		System.out.println(median1(arr, arr.length, arr[0].length)+" "+median1(brr, brr.length, brr[0].length)+" "+median1(crr, crr.length, crr[0].length));
	}
	
	//Naive Approach
	//O(r*clog(r*c)) time and O(r*c) space
	public static int median(int arr[][], int r, int c){
		int temp[] = new int[r*c];
		int index = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				temp[index] = arr[i][j];
				index++;
			}
		}
		Arrays.sort(temp);
		return temp[(c*r)/2];
	}
	
	//Efficient Approach
	public static int median1(int arr[][], int r, int c) {
		int min =arr[0][0];
		int max = arr[0][c-1];
		for(int i=1; i<r; i++) {
			if(arr[i][0] < min) min = arr[i][0];
			if(arr[i][c-1] > max) max = arr[i][c-1]; 
		}
		
		int medianPosition = ((r*c) +1)/2;
		while(min < max) {
			int mid = (min+max)/2;
			int midPosition = 0;
			for(int i=0; i<r; i++) {
				int pos = Arrays.binarySearch(arr[i], mid)+1;
				midPosition += Math.abs(pos);  
			}
			if(midPosition < medianPosition) {
				min = mid+1;
			}else {
				max = mid;
			}
		}
		return min;
	}

}
