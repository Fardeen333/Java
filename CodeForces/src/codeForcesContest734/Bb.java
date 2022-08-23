package codeForcesContest734;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bb {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
			}
			int res = 0;
			int noOfEle = 0;
			for(Map.Entry<Integer, Integer> e : hm.entrySet() ) {
				if(e.getValue() <= k) {
					noOfEle+=e.getValue();
				}
				if(e.getValue()>=k) {
					res++;
				}
			}
			
			int pls[] = new int[n];
			LinkedHashMap<Integer, Integer> helper = new LinkedHashMap<>();
			for(int i=0; i<n; i++) {
				helper.put(arr[i], 1);
			}
			int rem = noOfEle/k;
			noOfEle = 1;
			noOfEle =rem*k;
			int z = 1;
			for(int i=0; i<n; i++) {
				int count = hm.get(arr[i]);
				if(count >= k) {
					if(helper.get(arr[i])<=k) {
						pls[i] = helper.get(arr[i]);
						int x = helper.get(arr[i])+1;
						helper.put(arr[i], x);
					}
				}else if(count < k){
					noOfEle--;
					pls[i] = z;
					z++;
					if(z>k) {
						z=1;
					}
					if(noOfEle==0) continue;
				}
			}
			
			System.out.println(Arrays.toString(pls));
			
			
			
		}

	}

}
