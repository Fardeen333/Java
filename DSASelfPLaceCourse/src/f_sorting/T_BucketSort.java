package f_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T_BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {30,40,10,80,5,12,70};
		bucketSort(arr, arr.length, 4);
		System.out.println(Arrays.toString(arr));

	}
	//O(n) in best case(when k~n) and O(nlogn) in worst case(when k=1)
	public static void bucketSort(int arr[], int n, int k) {
		//finding max value in the array
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		max++;//if this is not incremented than the max value in the array would have given bucket index as k which would result in arrayIndexOutOfBoundException
		ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<k; i++) {
			bkt.add(new ArrayList<Integer>());
		}
		//adding elements to the bucket
		for(int i=0; i<n;i++) {
			int bk = (k*arr[i])/max;
			bkt.get(bk).add(arr[i]);
		}
		
		//Sorting individual buckets
		for(int i=0; i<k; i++) {
			Collections.sort(bkt.get(i));
		}
		//merging all the buckets
		int index = 0;
		for(int i=0; i<k;i++) {
			for(int j=0; j<bkt.get(i).size(); j++) {
				arr[index] = bkt.get(i).get(j);
				index++;
			}
		}
	}

}
