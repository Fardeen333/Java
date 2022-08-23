package h_hashing;
import java.util.*;
public class J_PairWithGivenSum {

	public static void main(String[] args) {
		int a[] = {3,2,8,15,-8};
		int b[] = {2,1,6,3};
		int c[] = {5,8,-3,6};
		
		System.out.println(pair(a, a.length, 17)+" "+pair(b, b.length, 6)+" "+pair(c, c.length, 3));
		System.out.println(pair1(a, a.length, 17)+" "+pair1(b, b.length, 6)+" "+pair1(c, c.length, 3));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static boolean pair(int arr[], int n, int sum) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Efficient Approach using Two Pointers algorithm O(nlogn) time and O(1) space
	
	//More Efficient Approach O(n) time and O(n) space
	public static boolean pair1(int arr[], int n, int sum) {
		Set<Integer> s = new HashSet<>();
		for(int e: arr) {
			if(s.contains(sum-e)) {
				return true;
			}else {
				s.add(e);
			}
		}
		return false;
	}

}