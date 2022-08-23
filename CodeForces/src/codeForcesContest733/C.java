package codeForcesContest733;

import java.util.*;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			
			ArrayList<Integer> arr1 = new ArrayList<>(); 
			ArrayList<Integer> arr2 = new ArrayList<>(); 
			
			for(int i=0; i<n; i++) {
				int x = sc.nextInt();
				arr1.add(x);
			}
			for(int i=0; i<n; i++) {
				int x = sc.nextInt();
				arr2.add(x);
				
			}
			System.out.println(count(arr1, arr2, n));
		}

	}
	
	public static int count(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
		Collections.sort(arr1);
		Collections.sort(arr2);
		int sum1 = 0;
		int sum2 = 0;
		int res = 0;
		for(int i=0; i<n; i++) {
			sum1 += arr1.get(i);
			sum2 += arr2.get(i);
		}
		if(n==1) {
			if(sum2==0) {
				return 0; 
			}
			if(sum1 == 0) {
				return 1;
			}
		}
		int k = (int)Math.round(n/4.0);
		int a = k;
		int b = k;
		for(int i=0; i<k; i++) {
			sum1 -= arr1.get(i);
			sum2 -= arr2.get(i);
		}
		if(sum1 >= sum2) {
			return 0;
		}else {
			while(sum1<sum2) {
				if((int)Math.round((n+1)/4.0) == k) {
					sum1 += 100;
					sum2 += 0;
				}else {
					sum1+= 100;
//					sum1 -= arr1.get(a);
					a++;
					if(b-1>=0) {
						sum2+=arr2.get(b-1);
						b--;
					}
					k=(int)Math.round((n+1)/4.0);
				}
				res++;
				n++;
				
			}
		}
		return res;
		
	}

}
