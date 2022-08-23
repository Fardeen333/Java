package d_arrays;

public class T_MinimumGroupFlipsToMakeSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,0,0,0,1};
		int b[] = {1,0,0,0,1,0,0,1,1,1,1};
		int c[] = {1,1,1};
		int d[] = {0,1};
		
		minFlips(a,a.length);
		minFlips(b,b.length);
		minFlips(c,c.length);
		minFlips(d,d.length);
		
		System.out.println();
		minFlips1(a,a.length);
		minFlips1(b,b.length);
		minFlips1(c,c.length);
		minFlips1(d,d.length);
	}
	
	//Naive Approach O(n) time with iterating through the array twice and O(1) space 
	public static void minFlips(int arr[], int n) {
		int count0 = 0;
		int count1 = 0;
		int i =0;
		while(i<n) {
			if(arr[i]==0) {
				while(i<n && arr[i] == 0) {
					i++;
				}
				count0++;
			}else {
				while(i<n && arr[i] == 1) {
					i++;
				}
				count1++;
			}
		}
		if(count0==0 || count1==0) {
			System.out.println("Doing Nothing");
			return;
		}
		if(count0 < count1 || count1==count0) {
			int j=0;
			while(j<n) {
				if(arr[j] == 0) {
					System.out.print(j+" to ");
					while(arr[j] == 0) {
						j++;
					}
					System.out.println(j-1);
					j--;
				}
				j++;
			}
		}else if(count0 >count1) {
			int k=0;
			while(k<n) {
				if(arr[k]==1) {
					System.out.print(k+" to ");
					while(arr[k] == 1) {
						k++;
					}
					System.out.println(k-1);
					k--;
				}
				k++;
			}
		}
		
	}
	
	//O(n) time and O(1) space with single iteration
	public static void minFlips1(int arr[], int n) {
		for(int i=1; i<n; i++) {
			if(arr[i] != arr[i-1]) {
				if(arr[i] != arr[0]) {
					System.out.print(i+" to ");
				}else {
					System.out.println(i-1);
				}
			}
		}
		if(arr[n-1] != arr[0]) {
			System.out.println(n-1);
		}
	}
}
