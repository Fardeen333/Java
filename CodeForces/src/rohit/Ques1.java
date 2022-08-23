package rohit;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Inavlid Input");
		}else {
		
			int arr1[] = new int[n];
			int arr2[] = new int[n];
		
			for(int i=0; i<2*n; i++) {
				if(i < n) {
					arr1[i] = sc.nextInt();
				}else {
					arr2[i-n] = sc.nextInt();
				}
			}
		
		
		
			largestArray(arr1, arr2, n);
		}

	}
	
	public static void largestArray(int arr1[], int arr2[], int n) {
		
		int output[] = new int[n];
		for(int i=0; i<n; i++) {
			if(arr1[i] < 0 || arr2[i] < 0) {
				System.out.println("Inavlid Input");
				return;
			}
			output[i] = Math.max(arr1[i], arr2[i]);
		}
		for(int i=0;i<n; i++) {
			System.out.println(output[i]);
		}
	}

}
