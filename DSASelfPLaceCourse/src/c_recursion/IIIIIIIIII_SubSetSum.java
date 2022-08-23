package c_recursion;

public class IIIIIIIIII_SubSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,15};
		
		System.out.println(countSubsets(arr, 3, 25));

	}
	
	public static int countSubsets(int arr[], int n, int sum) {
		if(n == 0) {
			return (sum==0) ? 1 : 0;
		}
		
		return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum-arr[n-1]);
		
	}

}
