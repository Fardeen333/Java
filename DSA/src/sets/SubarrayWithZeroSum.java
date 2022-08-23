package sets;

//given an array, find if there exists a sub array with sum equals to zero..
//Given an array, find if there exists a sub array with sum equals to zero
import java.util.*;
public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 1, 3, -4, -2};
		int k =-3;
		boolean found = false;
		
//		for(int i = 0 ; i< a.length; i++) {
//			int sum = 0;
//			for(int j = i; j<a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) {
//				break;
//			}
//		}
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 0 ; i< a.length; i++) {
			set.add(sum);
			sum += a[i];
			if(set.contains(sum-k)) {        //set.contains(sum-k)
				found = true;
				break;
			}
		}
			

		
		
		
		
		System.out.println("found = "+found);

	}

}
