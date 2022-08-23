package b_bitMagic;

public class IIIIII_TwoOddOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,4,3,4,5,4,4,6,7,7};
		int b[]= {3,4,3,4,8,4,4,32,7,7};
		int n = a.length;
		int n2 = b.length;
		
		twoOdd(a,n);
		System.out.println();
		twoOdd1(b, n2);
		
		

	}
	
	
	//Method 1 O(n^2)
	public static void twoOdd(int arr[], int n) {
		
		for(int i =0; i<n; i++) {
			int count =0;
			for(int j =0; j<n; j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	//Method 2 O(n) and space O(1)
	public static void twoOdd1(int a[], int n) {
		int res = 0;
		int a1 = 0; 
		int a2 = 0;
		for(int i =0; i<n; i++) {
			res = res ^ a[i];
		}
		int r = res & (~(res-1));
		for(int j =0; j<n; j++) {
			if((r & a[j]) != 0) {
				a1 ^= a[j];
			}else {
				a2 ^= a[j];
			}
		}
		System.out.println(a1+ " "+a2);
	}

}
