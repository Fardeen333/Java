package d_arrays;
public class W_PrefixSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L[] = {1,2,3};
		int R[] = {3,5,7};
		System.out.println(maximum(L, R, 3));

	}
	
	//Given n ranges find the maximum appearing element in these ranges;
	public static int maximum(int L[], int R[], int n) {
		int prefix[] =new int[1000];
		for(int i=0; i<n; i++) {
			prefix[L[i]]++;
			prefix[R[i]+1]--;
		}
		int max = prefix[0]; int res = 0;
		for(int i =1; i<1000; i++) {
			prefix[i] += prefix[i-1];
			if(prefix[i]>max) {
				max = prefix[i];
				res =i;
			}
		}
		return res;
	}

}
