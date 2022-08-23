package codeForcesContest743;
import java.util.*;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			char arr1[] = s.toCharArray();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] =Character.getNumericValue(arr1[i]); 
						
			}
			
			System.out.println(count(arr, n));
			
			
		} 

	}
	
	private static long count(int arr[], int n) {
		int i=0; int j=n-1;
		long count = 0;
		while(i<=j) {
			
			while(i<n-1 && arr[i] == 0 ) {
				i++;
			}
			
			if(arr[j] != 0) {
				count += arr[j];
				arr[j] = 0;
			}
			
			if(i==j) {
				break;
			}
			
			swap(arr, i , j);
			count++;
			
		}
		return count;
	}
	
	private static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
