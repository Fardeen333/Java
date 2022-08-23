package f_sorting.ArraysSort;

import java.util.Arrays;
import java.util.Collections;

public class A_SortingBaiscs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,20,12,30};
		char b[] = {'B','B','A','C','A'};
		Arrays.sort(arr);
		Arrays.sort(b);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
		
		int c[] = {5,30,20,10,8};
		Arrays.sort(c,1,4);
		System.out.println(Arrays.toString(c));
		
		Integer drr[] = {9,8,2,1,3};
		Arrays.sort(drr, Collections.reverseOrder());
		System.out.println(Arrays.toString(drr));
		
//		Integer x = 54;
//		Integer y = 60;
//		System.out.println(x.compareTo(y));
	}

}
