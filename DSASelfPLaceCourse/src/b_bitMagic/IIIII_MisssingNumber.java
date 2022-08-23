package b_bitMagic;

public class IIIII_MisssingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,5};
		int n = a.length;
		
		System.out.println(missingValue(a, n));

	}
	
	public static int missingValue(int a[], int n) {
		int result =0;
		for(int i =0; i<n; i++) {
			result ^= a[i];
		}
		for(int j =1; j<=n+1; j++) {
			result ^= j;
		}
		return result;
	}

}
