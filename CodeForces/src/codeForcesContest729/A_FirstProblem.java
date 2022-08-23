package codeForcesContest729;

import java.util.Arrays;
import java.util.Scanner;

public class A_FirstProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(int j=1; j<=t; j++) {
				int n = sc.nextInt();
				int arr[] = new int[2*n];
				int even = 0;
				int odd = 0;
				for(int i=0; i<(2*n); i++) {
					arr[i] = sc.nextInt();
					if(arr[i]%2==0) {
						even++;
					}else {
						odd++;
					}
				}
				
				if(even == odd) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
//				System.out.println(Arrays.toString(arr));	
			}
	}
	
	public static int sort(int arr[], int n) {
		int i=-1; int j= n;
		while(true) {
			do {
				i++;
			}while(arr[i]%2 == 0);
			do {
				j--;
			}while(arr[j]%2 != 0);
			if(i>=j) return j;
			swap(arr, i , j);
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
