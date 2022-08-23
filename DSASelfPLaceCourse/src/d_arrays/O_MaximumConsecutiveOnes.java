package d_arrays;

public class O_MaximumConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,1,1,0,1,1};
		int a1[]= {0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(maximumOnes(a, a.length));
		System.out.println(maximumOnes1(a1, a1.length));

	}
	//O(n^2) time and O(1) space
	public static int maximumOnes(int arr[], int n) {
		int res =0;
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=i; j<n; j++) {
				if(arr[j] == 1) {
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
	public static int maximumOnes1(int arr[], int n) {
		int res =0;
		int count =0 ;
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				count =0;
			}else {
				count++;
				res= Math.max(res, count);
			}
		}
		return res;
	}

}
