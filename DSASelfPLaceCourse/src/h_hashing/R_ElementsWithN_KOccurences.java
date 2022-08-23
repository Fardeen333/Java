package h_hashing;

import java.util.*;

public class R_ElementsWithN_KOccurences {

	public static void main(String[] args) {
		
		int a[] = {30,10,20,20,10,20,30,30};
		int b[] = {30,10,20,30,30,40,30,40,30};
		int c[] = {10,10,20,30,20,10,10};
		
		occurences(a, a.length, 4);
		occurences(b, b.length, 2);
		occurences(c, c.length, 2);
		
		
		int a1[] = {30,10,20,20,10,20,30,30};
		int b1[] = {30,10,20,30,30,40,30,40,30};
		int c1[] = {10,10,20,30,20,10,10};
		
		occurences1(a1, a1.length, 4);
		occurences1(b1, b1.length, 2);
		occurences1(c1, c1.length, 2);
		
	}
	//Naive Approach O(nlogn ) time and O(1) space
	public static void occurences(int arr[], int n, int k) {
		Arrays.sort(arr);
		int count =1;
		int i=1;
		while(i < n) {
			while(i<n && arr[i-1] == arr[i]) {
				count++;
				i++;
			}
			if(count > (n/k)) {
				System.out.print(arr[i-1]+" ");
			}
			count =1;
			i++;
		}
		System.out.println();
	}
	
	//efficient Approach O(n) time and O(n) space
	public static void occurences1(int arr[], int n, int k) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int e : arr) {
			m.put(e, m.getOrDefault(e, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e: m.entrySet()) {
			if(e.getValue() > (n/k)) {
				System.out.print(e.getKey()+" ");
			}
		}
		System.out.println();
		
	}

}
