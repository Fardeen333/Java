package h_hashing;

import java.util.HashSet;
import java.util.Set;

public class I_UnionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		int arr[] = {10,30,10,40};
		int brr[] = {40,5,10,15};
		System.out.println(countUnion(arr, arr.length, brr, brr.length));

	}
	
	//Naive Approach O(m*m + n*(n+m)) time and O(n+m) size
	
	
	//Efficient Approach O(m+n) time and O(m+n) size
	public static int countUnion(int arr[] , int m ,int brr[], int n) {
		Set<Integer> s = new HashSet<>();
		for(int e: arr) {
			s.add(e);
		}
		for(int e: brr) {
			s.add(e);
		}
		return s.size();
	}

}
