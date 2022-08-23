import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Sol {

	public static void main(String[] args) throws IOException{
		
		
		int arr[] = {11,18,21,28,31,38,40,55,60,62};
		System.out.println(isSumPossible(arr, arr.length, 67));
		
		
		
	}
	
	public static int isSumPossible(int arr[], int n, int input_no) {

		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0; i<n; i++) {
			Integer x = input_no-arr[i];
			if(hs.contains(x)) {
				return 1;
			}else {
				hs.add(arr[i]);
			}
		}
		return 0;
	}

}
