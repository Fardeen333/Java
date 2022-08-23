package d_arrays;

public class Q_MaximumLengthEvenOddSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,10,20,6,3,8};
		int b[] = {10,12,14,7,8};
		int c[] = {7,10,13,14};
		int d[] = {10,12,8,4};
		System.out.println(max(a, a.length)+" "+max(b, b.length)+" "+max(c, c.length)+" "+max(d, d.length));
		System.out.println(max1(a, a.length)+" "+max1(b, b.length)+" "+max1(c, c.length)+" "+max1(d, d.length));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int max(int arr[], int n) {
		int res = 1;
		for(int i =0; i<n; i++) {
			int count = 1;
			for(int j =i+1; j<n; j++) {
				if(arr[j]%2 != arr[j-1]%2) {  
//				if((arr[j-1]%2==0 && arr[j]%2!=0) || (arr[j-1]%2!=0 && arr[j]%2==0)){
					count++;
				}else {
					break;
				}
			}
			res = Math.max(res, count);
		}
		return res;
	}
	
	//O(n) time and O(1) space
	public static int max1(int arr[], int n) {
		int res =1;
		int count = 1;
		for(int i=1; i<n; i++) {
			if(arr[i]%2 != arr[i-1]%2) {
				count++;
				res = Math.max(res, count);
			}else {
				count =1;
			}
		}
		return res;
	}

}
