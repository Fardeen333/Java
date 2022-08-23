package h_hashing;

import java.util.HashSet;

public class H_IntersectionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		
		int arr[] = {10,15,20,5,30};
		int brr[] = {30,5,30,80};
		
		int crr[] = {10,20,10,30};
		int drr[] = {20,10,10,40};
		
		int err[] = {10,10,10};
		int frr[] = {10,10,10};
		
		int grr[] = {10,20};
		int hrr[] = {20,30};
		
		System.out.println(intersection(arr, arr.length, brr, brr.length)+" "+intersection(crr, crr.length, drr, drr.length)+" "+intersection(err, err.length, frr, frr.length)+" "+intersection(grr, grr.length, hrr, hrr.length));
		System.out.println(intersection1(arr, arr.length, brr, brr.length)+" "+intersection1(crr, crr.length, drr, drr.length)+" "+intersection1(err, err.length, frr, frr.length)+" "+intersection1(grr, grr.length, hrr, hrr.length));
		System.out.println(intersection2(arr, arr.length, brr, brr.length)+" "+intersection2(crr, crr.length, drr, drr.length)+" "+intersection2(err, err.length, frr, frr.length)+" "+intersection2(grr, grr.length, hrr, hrr.length));
		

	}
	//Naive Approach O(n*(n+m)) time and O(1) space
	public static int intersection(int arr[], int m, int brr[], int n) {
		int res =0;
		for(int i=0; i<m; i++) {
			boolean isPresent = false;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					isPresent = true;
					break;
				}
			}
			if(isPresent) {
				continue;
			}
			for(int j=0; j<n; j++) {
				if(arr[i] == brr[j]) {
					res++;
					break;
				}
			}
		}
		return res;
	}
	
	//Efficient Approach O(m+n) time and O(m+n) space
	public static int intersection1(int arr[], int m, int brr[], int n) {
		int res = 0;
		HashSet<Integer> h_arr = new HashSet<>();
		HashSet<Integer> h_brr = new HashSet<>();
		for(int i=0; i<m; i++) {
			h_arr.add(arr[i]);
		}
		for(int i=0; i<n; i++) {
			h_brr.add(brr[i]);
		}
		for(int e : h_arr) {
			if(h_brr.contains(e)) {
				res++;
			}
		}
		return res;
	}
	
	//Efficient Approach O(m+n) time and O(m) space
		public static int intersection2(int arr[], int m, int brr[], int n) {
			int res =0;
			HashSet<Integer> h_arr = new HashSet<>();
			for(int i=0; i<m; i++) {
				h_arr.add(arr[i]);
			}
			for(int i=0; i<n; i++) {
				if(h_arr.contains(brr[i])) {
					res++;
					h_arr.remove(brr[i]);
				}

			}
			
			return res;
		}
	
	

}
