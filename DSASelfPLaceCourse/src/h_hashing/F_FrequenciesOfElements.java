package h_hashing;

import java.util.HashMap;
import java.util.Map;

public class F_FrequenciesOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,12,10,15,10,20,12,12};
		int brr[] = {10,10,10,10};
		int crr[] = {10,20,30};
		
		frequency(arr, arr.length);
		System.out.println();
		frequency(brr, brr.length);
		System.out.println();
		frequency(crr, crr.length);
		System.out.println();
		
		frequency1(arr, arr.length);

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static void frequency(int arr[], int n) {
		for(int i=0; i<n; i++) {
			boolean isVisited = false;
			int freq = 1;
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					isVisited = true;
					break;
				}
			}
			if(isVisited) {
				continue;
			}
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					freq++;
				}

			}
			System.out.print(arr[i] + " " + freq + " ");
		}
	}
	
	//Efficient Approach O(n) time and O(n) space
	public static void frequency1(int arr[] ,int n) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int x: arr) {
			m.put(x, m.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer, Integer> e : m.entrySet() ) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
