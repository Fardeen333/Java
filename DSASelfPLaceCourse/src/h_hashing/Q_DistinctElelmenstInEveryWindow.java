package h_hashing;

import java.util.*;

public class Q_DistinctElelmenstInEveryWindow {

	public static void main(String[] args) {
		int a[] = {10,20,20,10,30,40,10};
		int b[] = {10,10,10,10};
		int c[] = {10,20,30,40};
		
		distinctElements(a, a.length, 4);
		distinctElements(b, b.length, 3);
		distinctElements(c, c.length, 3);
		
		distinctElements1(a, a.length, 4);

	}
	
	//Naive Aprroach(O((n-k)*k*k))
	public static void distinctElements(int arr[], int n ,int k) {
		for(int i=0; i<n-k+1; i++) {
			int count =0;
			for(int j=0; j<k; j++) {
				boolean isVisited = false;
				for(int l =0; l<j; l++) {
					if(arr[j+i] == arr[l+i]) {
						isVisited = true;
						break;
					}
				}
				if(!isVisited) {
					count++;
				}
			}
			System.out.print(count+" ");
		}
		System.out.println();
	}
	
	//Efficient Approach O(n) time and O(k) space
	public static void distinctElements1(int arr[], int n, int k) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int i=0; i<k; i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
		}
		System.out.print(m.size()+" ");
		for(int i=k; i<n; i++) {
			
			//removing the last element of the previous window if its count is equal to 1
			//else reducing its count
			if(m.get(arr[i-k]) == 1) {
				m.remove(arr[i-k]);
			}else {
				m.put(arr[i - k],  m.get(arr[i - k]) - 1);
			}

			//putting in the new element
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);

			//printing the size
			System.out.print(m.size()+" ");
		}
	}

}
