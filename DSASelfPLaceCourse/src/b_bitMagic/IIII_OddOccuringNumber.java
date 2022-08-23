package b_bitMagic;

public class IIII_OddOccuringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,7,8,8,7,7,7};
		int n =a.length;
		System.out.println(odd(a, n));
		System.out.println(odd1(a, n));
		

	}
	
	//Method 1 O(n^2)
	public static int odd(int arr[], int n) {
		int result =0;
		for(int i =0; i<n; i++) {
			int count =0;
			for(int j =0; j<n; j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count%2!=0) {
				result = arr[i];
			}
		}
		return result;
	}
	
	
	//Method 2 O(n) and O(1) space
	public static int odd1(int arr[], int n) {
		int res =0;
		for(int i=0; i<n; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}
