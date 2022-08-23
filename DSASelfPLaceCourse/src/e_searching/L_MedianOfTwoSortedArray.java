package e_searching;

import java.util.Arrays;

public class L_MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50}; int b[] = {5,15,25,35,45};
		int c[] = {1,2,3,4,5,6}; int d[] = {10,20,30,40,50};
		int e[] = {10,20,30,40,50,60}; int f[] = {1,2,3,4,5};
		
		System.out.println(median(a, b) + " "+median(c,d)+ " "+ median(e,f));
		System.out.println(median1(a, b, a.length, b.length)+" "+median1(c,d, c.length, d.length)+ " "+ median1(e,f, e.length, f.length));
		

	}
	
	//Naive approach
	//O((n1+n2)log(n1+n2)) time and O(n1+n2) space
	public static double median(int a[], int b[]) {
		int temp[] = new int[a.length+b.length];
		int n = a.length+b.length;
		for(int i=0; i<n; i++) {
			if(i<a.length) {
				temp[i] = a[i];
			}else {
				temp[i] = b[i-a.length];
			}
		}
		Arrays.sort(temp);
		if(n%2 == 0) {
			return (temp[n/2] + temp[(n/2)-1])/2.0;
		}else {
			return (double)temp[n/2];
		}
	}
	
	//Efficient Approach O(log(min(n1,n2))) time and O(1) space
	public static double median1(int a[], int b[], int n1, int n2) {
		if(n2 < n1) return median1(b, a,n2 ,n1);
		int low = 0;
		int high = n1;
		while(low <= high) {
			int i1 = (low+high)/2;
			int i2 = (n1 + n2 + 1)/2 - i1;
			int min1 = (i1 == n1) ? Integer.MAX_VALUE : a[i1];
			int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1-1]; 
			int min2 = (i2 == n2) ? Integer.MAX_VALUE : b[i2];
			int max2 = (i2 == 0) ? Integer.MIN_VALUE : b[i2-1];	
			
			if(max1 <= min2 && max2 <= min1) {
				if((n1+n2) %2 == 0) {
					return (Math.max(max1, max2) + Math.min(min1, min2))/2.0;
				}else {
					return Math.max(max1,max2);
				}
			}else if(max1 > min2){
				high = i1 - 1;
			}else {
				low = i1 + 1;
			}
		}
		return -1; 
	}
	
	

}
