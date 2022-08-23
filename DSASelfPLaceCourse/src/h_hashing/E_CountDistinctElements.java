package h_hashing;

import java.util.Arrays;
import java.util.HashSet;

public class E_CountDistinctElements {

	public static void main(String[] args) {
		int a[] = {15,12,13,12,13,13,18};
		int b[] = {10,10,10};
		int c[] = {10,20,30};

		Integer a1[] = {15,12,13,12,13,13,18};
		Integer b1[] = {10,10,10};
		Integer c1[] = {10,20,30};
		
		System.out.println(countDistinct(a, a.length) + " " + countDistinct(b, b.length)+" " + countDistinct(c, c.length) );
		System.out.println(countDistinct1(a, a.length) + " " + countDistinct1(b, b.length)+" " + countDistinct1(c, c.length) );
		System.out.println(countDistinct2(a1, a1.length) + " " + countDistinct2(b1, b1.length)+" " + countDistinct2(c1, c1.length) );

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int countDistinct(int arr[], int n) {
		int res = 0;
		for(int i=0; i<n; i++) {
			boolean isPresent = false;
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					isPresent = true;
					break;
				}
			}
			if(!isPresent) {
				res++;
			}
		}
		return res;
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static int countDistinct1(int arr[], int n) {
		HashSet<Integer> h = new HashSet<>();
		for(int i=0 ; i<n; i++) {
			h.add(arr[i]);
		}
		return h.size();
	}
	
	//Shorter version of the efficient solution
	public static int countDistinct2(Integer arr[], int n) {
		HashSet<Integer> h = new HashSet<Integer>(Arrays.asList(arr));
		return h.size();
	}

}
